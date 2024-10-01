
package com.example.proyectointegradoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/curso")

public class cursoController {
    
    @RequestMapping("/")
    public String inicio(){
        return "curso/inicio";
    }
}
