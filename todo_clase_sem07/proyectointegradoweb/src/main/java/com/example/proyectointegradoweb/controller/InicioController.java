package com.example.proyectointegradoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class InicioController {
    
    @RequestMapping("/")
    
    private String inicio(){
        return "index";
    }
}
