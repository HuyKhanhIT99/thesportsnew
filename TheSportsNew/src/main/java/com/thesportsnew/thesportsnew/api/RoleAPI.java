package com.thesportsnew.thesportsnew.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleAPI {

    @GetMapping("/test")
    public String testAPI(){
        return "success";
    }
}
