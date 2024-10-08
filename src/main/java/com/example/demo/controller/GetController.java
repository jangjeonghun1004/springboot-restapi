package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Parameter;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/get"})
public class GetController {
    public GetController() {
    }

    @GetMapping({"/pathVariable/{name}"})
    public String pathVariable(@Parameter(description = "이름") @PathVariable String name) {
        return "pathVariable " + name;
    }

    @GetMapping({"pathVariable2/{name}/{email}"})
    public String pathVariable2(@PathVariable("name") String name, @PathVariable("email") String email) {
        return String.format("name=%s, email=%s", name, email);
    }

    @GetMapping({"/requestParam"})
    public String requestParam(@Parameter(description = "이름") @RequestParam(required = false) String name, @RequestParam String email) {
        return String.format("name=%s, email=%s", name, email);
    }

    @GetMapping({"requestParam2"})
    public String requestParam2(@RequestParam Map<String, String> maps) {
        StringBuilder sb = new StringBuilder();
        maps.forEach((key, value) -> {
            sb.append(String.format("%s : %s", key, value));
        });
        return sb.toString();
    }
}
