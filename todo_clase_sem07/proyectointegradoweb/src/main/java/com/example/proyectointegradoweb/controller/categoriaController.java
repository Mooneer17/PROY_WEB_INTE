package com.example.proyectointegradoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/categoria")

public class categoriaController {
    
    @RequestMapping("/")
    public String inicio(){
        return "categoria/inicio";
    }
}
