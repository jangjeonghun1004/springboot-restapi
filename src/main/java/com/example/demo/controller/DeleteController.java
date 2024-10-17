package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/delete"})
public class DeleteController {

    @Operation(summary = "DELETE = 서버에서 리소스를 삭제합니다.", description = "pathVariable 테스트")
    @DeleteMapping({"/pathVariable/{name}"})
    public ResponseEntity<String> pathVariable(@PathVariable String name) {
        return ResponseEntity.status(HttpStatus.OK).body(name);
    }

    @Operation(summary = "DELETE = 서버에서 리소스를 삭제합니다.", description = "pathVariable 테스트")
    @DeleteMapping({"/pathVariable2/{pathVariable2}/{pathVariable1}"})
    public ResponseEntity<String> pathVariable2(
            @PathVariable("pathVariable1") String pathVariable1,
            @PathVariable("pathVariable2") String pathVariable2
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(
                String.format("pathVariable1 = %s, pathVariable2 = %s", pathVariable1, pathVariable2)
        );
    }

    @Operation(summary = "DELETE = 서버에서 리소스를 삭제합니다.", description = "requestParam 테스트")
    @DeleteMapping({"/requestParam"})
    public ResponseEntity<String> requestParam(
            @Parameter(description = "이름") @RequestParam String name,
            @Parameter(description = "이메일") @RequestParam(required = false) String email
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(String.format("name = %s, email = %s", name, email));
    }
}
