package com.courseproject.controller;

import com.courseproject.entity.BreakSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xml.sax.SAXException;

import java.io.IOException;

@Controller
@RequestMapping("/test")
public class AutoTestController {

    @Autowired
    public BreakSystem breakSystem;

    @GetMapping("/breakSystem")
    public String exhaustPage(Model model) throws IOException, SAXException {
        breakSystem.toDoTest();
        model.addAttribute("errors", breakSystem.getGeneratedErrors());
        return "breakSystemTest";
    }


}
