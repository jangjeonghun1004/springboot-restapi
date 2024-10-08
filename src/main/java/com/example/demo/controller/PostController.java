package com.example.demo.controller;

import com.example.demo.dto.MemberDto;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/post"})
public class PostController {
    public PostController() {
    }

    @PostMapping({"requestBody"})
    public String requestBody(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    @PostMapping({"/requestBody2"})
    public String requestBody2(@RequestBody Map<String, String> maps) {
        StringBuilder sb = new StringBuilder();
        maps.forEach((key, value) -> {
            sb.append(String.format("%s : %s, ", key, value));
        });
        return sb.toString();
    }
}
