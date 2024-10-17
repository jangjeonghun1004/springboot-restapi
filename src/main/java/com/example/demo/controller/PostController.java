package com.example.demo.controller;

import com.example.demo.dto.MapDTO;
import com.example.demo.dto.MemberDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping({"/post"})
public class PostController {

    @Operation(summary = "POST = 서버로 데이터를 보내 새로운 리소스를 생성합니다.", description = "requestBody 테스트")
    @PostMapping({"requestBody"})
    public ResponseEntity<MemberDTO> requestBody(
            @Parameter(description = "schema 설명") @RequestBody MemberDTO memberDTO
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(memberDTO);
    }

    @Operation(summary = "POST = 서버로 데이터를 보내 새로운 리소스를 생성합니다.", description = "requestBody 테스트")
    @PostMapping({"/requestBody2"})
    public ResponseEntity<List<MapDTO>> requestBody2(
            @Parameter(description = "schema 설명") @RequestBody Map<String, String> maps
    ) {
        List<MapDTO> mapDTOs = new ArrayList<MapDTO>();
        maps.forEach((key, value) -> {
            mapDTOs.add(
                    MapDTO.builder()
                    .key(key)
                    .value(value)
                    .build()
            );
        });

        return ResponseEntity.status(HttpStatus.OK).body(mapDTOs);
    }

    @Operation(summary = "POST = 서버로 데이터를 보내 새로운 리소스를 생성합니다.", description = "requestBody 테스트")
    @PostMapping("/requestBody3")
    public ResponseEntity<String> requestBody3(
            @Parameter(description = "이름") @RequestBody String name,
            @Parameter(description = "이메일") @RequestBody String email
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(name + email);
    }

}
