package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class DemoController {
    @RequestMapping("/getById")
    public String getById(@RequestParam(value = "id") String requestId) {
        return "dummy Response";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post() {
        return "POST Request";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String put() {
        return "PUT Method";
    }

    @RequestMapping(method = RequestMethod.PATCH)
    public String patch() {
        return "Patch Method";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String delete() {
        return "delete Method";
    }

    @GetMapping("getName/{name}")
    public String getMapping(@PathVariable String name) {
        return "GET";
    }

    @PostMapping("/saveUser")
    public String postMapping() {
        return "Name";
    }

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public String createUser(@RequestBody User user) {
        return "Created User" + user.getName();
    }
}
