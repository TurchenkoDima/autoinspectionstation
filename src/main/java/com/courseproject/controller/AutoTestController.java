package com.courseproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class AutoTestController {

    @GetMapping("/exhaust")
    public String index(){
        return "exhaustSystemTest";
    }


}
