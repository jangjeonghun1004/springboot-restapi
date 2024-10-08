
package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/delete"})
public class DeleteController {
    public DeleteController() {
    }

    @DeleteMapping({"/pathVariable/{name}"})
    public String pathVariable(@PathVariable String name) {
        return "delete pathVariable " + name;
    }

    @DeleteMapping({"/pathVariable2/{pathVariable2}/{pathVariable1}"})
    public String pathVariable2(@PathVariable("pathVariable1") String pathVariable1, @PathVariable("pathVariable2") String pathVariable2) {
        return "hi2 " + pathVariable1 + pathVariable2;
    }

    @DeleteMapping({"/requestParam"})
    public String requestParam(@RequestParam String name, @RequestParam String email) {
        return String.format("%s, %s", name, email);
    }
}
