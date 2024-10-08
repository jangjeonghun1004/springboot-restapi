//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo.controller;

import com.example.demo.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/put"})
public class PutController {
    public PutController() {
    }

    @PutMapping({"/requestBody"})
    public String requestBody(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    @PutMapping({"/responseEntity"})
    public ResponseEntity<MemberDto> responseEntity(@RequestBody MemberDto memberDto) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(memberDto);
    }
}
