package com.example.demo.controller;

import com.example.demo.dto.MapDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping({"/get"})
public class GetController {

    @Operation(summary = "GET = 서버의 기존 리소스를 업데이트하거나 교체합니다.", description = "pathVariable 테스트")
    @GetMapping({"/pathVariable/{name}"})
    public ResponseEntity<String> pathVariable(
            @Parameter(description = "이름") @PathVariable String name
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(String.format("name = %s", name));
    }

    @Operation(summary = "GET = 서버의 기존 리소스를 업데이트하거나 교체합니다.", description = "pathVariable 테스트")
    @GetMapping({"pathVariable2/{name}/{email}"})
    public ResponseEntity<String> pathVariable2(
            @Parameter(description = "이름") @PathVariable("name") String name,
            @Parameter(description = "이메일") @PathVariable("email") String email
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(String.format("name = %s, email = %s", name, email));
    }

    @Operation(summary = "GET = 서버의 기존 리소스를 업데이트하거나 교체합니다.", description = "requestParam 테스트")
    @GetMapping({"/requestParam"})
    public ResponseEntity<String> requestParam(
            @Parameter(description = "이름") @RequestParam(required = false) String name,
            @Parameter(description = "이메일") @RequestParam(required = true) String email
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(String.format("name = %s, email = %s", name, email));
    }

    @Operation(summary = "GET = 서버의 기존 리소스를 업데이트하거나 교체합니다.", description = "requestParam 테스트")
    @GetMapping({"requestParam2"})
    public ResponseEntity<List<MapDTO>> requestParam2(
            @Parameter(description = "schema 설명") @RequestParam Map<String, String> maps
    ) {
        List<MapDTO> mapDTOs = new ArrayList<MapDTO>();

        maps.forEach((key, value) -> {
            mapDTOs.add(MapDTO.builder()
                    .key(key)
                    .value(value)
                    .build()
            );
        });

        return ResponseEntity.status(HttpStatus.OK).body(mapDTOs);
    }

}
