package com.example.proyectointegradoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.proyectointegradoweb.model.Categoria;
import com.example.proyectointegradoweb.model.Service.ICategoriaService;

@Controller
@RequestMapping("/categoria")
public class categoriaController {
    
    @Autowired
    private ICategoriaService categoriaService;

    @RequestMapping("/")
    public String inicio(Model model) {
        Categoria categoria = new Categoria();
        model.addAttribute("categoria", categoria);
        return "categoria/inicio";  // Render the inicio view
    }

    @PostMapping("/guardar")  // Use @PostMapping for clarity
    public String guardar(Categoria categoria) {
        categoriaService.guardarCategoria(categoria);  // Save the category
        return "redirect:/categoria/";  // Redirect to the main page after saving
    }
}
