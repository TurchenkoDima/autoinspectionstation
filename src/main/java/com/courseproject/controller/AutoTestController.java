package com.courseproject.controller;

import com.courseproject.entity.BreakSystem;
import com.courseproject.service.TestSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xml.sax.SAXException;

import java.io.IOException;

@Controller
@RequestMapping("/test")
public class AutoTestController {

    @Autowired
    public TestSystemService testSystemService;

    @GetMapping("/breakSystem/{id}")
    public String exhaustPage(@PathVariable("id") int id, Model model) throws IOException, SAXException {
          testSystemService.saveBrakeSystem(id);
          model.addAttribute("errors", testSystemService.getBrakeErrorsByAutoId(id));
//        breakSystem.toDoTest();
//        model.addAttribute("errors", breakSystem.getGeneratedErrors());
          return "breakSystemTest";
    }


}
