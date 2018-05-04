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
    public String breakPage(@PathVariable("id") int id, Model model) throws IOException, SAXException {
          testSystemService.saveBrakeSystem(id);
          model.addAttribute("errors", testSystemService.getBrakeErrorsByAutoId(id));
          return "breakSystemTest";
    }

    @GetMapping("/exhaustSystem/{id}")
    public String exhaustPage(@PathVariable("id") int id, Model model) throws IOException, SAXException {
        testSystemService.saveExhaustSystem(id);
        model.addAttribute("errors", testSystemService.getExhaustErrorsByAutoId(id));
        return "exhaustSystemTest";
    }

    @GetMapping("/engineSystem/{id}")
    public String enginePage(@PathVariable("id") int id, Model model) throws IOException, SAXException {
        testSystemService.saveEngineSystem(id);
        model.addAttribute("errors", testSystemService.getEngineErrorsByAutoId(id));
        return "engineSystemTest";
    }

    @GetMapping("/headlampsSystem/{id}")
    public String headlampsPage(@PathVariable("id") int id, Model model) throws IOException, SAXException {
        testSystemService.saveHeadlampsSystem(id);
        model.addAttribute("errors", testSystemService.getHeadlampsErrorsByAutoId(id));
        return "headlampsSystemTest";
    }

    @GetMapping("/rudderSystem/{id}")
    public String rudderPage(@PathVariable("id") int id, Model model) throws IOException, SAXException {
        testSystemService.saveRudderSystem(id);
        model.addAttribute("errors", testSystemService.getRudderErrorsByAutoId(id));
        return "rudderSystemTest";
    }


}
