package com.courseproject.controller;

import com.courseproject.entity.AutoInf;
import com.courseproject.entity.BreakSystem;
import com.courseproject.entity.TechEngineer;
import com.courseproject.service.AutoInfService;
import com.courseproject.service.TechEngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;

import java.io.IOException;

@Controller
@RequestMapping("/")
public class TechEngineerController {

    @Autowired
    public TechEngineerService techEngineerService;

    @Autowired
    public AutoInfService autoInfService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/")
    public String autorization(@ModelAttribute("form-login") TechEngineer techEngineerForm) throws IOException, SAXException {
        TechEngineer engineer = techEngineerService.getByLogin(techEngineerForm.getLogin());
        if (engineer!=null) {
            if (engineer.getPassword().equals(techEngineerForm.getPassword()))
                return "redirect:/app/techengineers";
        }
        return "index";
    }

    @GetMapping("/hello")
    // Возвращает название нужного Темплейта.
    public String hello(){
        return "hello";
    }

    // Model нужна для передачи данных между View и Controller
    @GetMapping("/techengineers")
    public String getAllTechEngineers(Model model){
        // После мы будем обрабатывать атрибут с именем techEngineers в techEngineersList.
        model.addAttribute("techEngineers", techEngineerService.findAll());
        return "techEngineersList";
    }

    // в get данные передаются через url
    //Model нужна для передачи данных на темплейт (freemarker)
    @GetMapping("/techengineer/{id}")
    public String getById(@PathVariable("id") int id, Model model){
        model.addAttribute("techEngineer", techEngineerService.getById(id));
        return "showTechEngineer";
    }

    @GetMapping("/addtechengineer")
        public String createTechEngineerPage(){
        return "createTechEngineer";
    }


    @PostMapping("/addtechengineer")
    public String addTechEngineer(@ModelAttribute("techEngineer") TechEngineer techEngineer){
        techEngineerService.save(techEngineer);
        return "redirect:/app/techengineers";
    }

    @GetMapping("delete/{id}")
    public String deleteTechEngineer(@PathVariable("id") int id){
        techEngineerService.delete(id);
        return "redirect:/app/techengineers";
    }

    @GetMapping("update/{id}")
    public String updateTechEngineer(@PathVariable("id") int id, Model model){
        model.addAttribute("techEngineer", techEngineerService.getById(id));
        return "editTechEngineer";
    }

    @PostMapping("/updatetechengineer")
    public String editTechEngineer(@ModelAttribute("techEngineer") TechEngineer techEngineer){
        techEngineerService.update(techEngineer);
        return "redirect:/app/techengineers";
    }

    @GetMapping("/addAutoInf")
    public String addAutoInf(){ return "transportInf"; }

    @PostMapping("/addtransportinf")
    public String addTransportInf(@ModelAttribute("autoInf") AutoInf autoInf) {
        autoInfService.save(autoInf);
        return "redirect:/app/techengineers";
    }

    @GetMapping("/allautoinf")
    public String getAllAutoInf(Model model){
        // После мы будем обрабатывать атрибут с именем techEngineers в techEngineersList.
        model.addAttribute("autoInf", autoInfService.findAll());
        return "showTransportInf";
    }

    @GetMapping("/testCar/{id}")
    public String getCarById(@PathVariable("id") int id, Model model){
        model.addAttribute("auto", autoInfService.getById(id));
        return "showTestCar";
    }

}
