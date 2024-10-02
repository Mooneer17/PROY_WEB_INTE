 package com.example.proyectointegradoweb.model.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectointegradoweb.model.Categoria;
import com.example.proyectointegradoweb.model.ICategoriaDAO;

@Service
public class CategoriaService implements ICategoriaService{


    @Autowired
    private ICategoriaDAO categoriaDAO;


    @Override
    public void guardarCategoria(Categoria categoria) {
       categoriaDAO.save(categoria);

    }
 
    
}