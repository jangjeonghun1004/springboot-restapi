package com.example.demo.controller;

import com.example.demo.dto.MemberDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/put"})
public class PutController {

    @Operation(summary = "PUT = 서버의 기존 리소스를 업데이트하거나 교체합니다.", description = "requestBody 테스트")
    @PutMapping({"/requestBody"})
    public ResponseEntity<MemberDTO> requestBody(
            @Parameter(description = "schema 설명") @RequestBody MemberDTO memberDTO
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(memberDTO);
    }
}
