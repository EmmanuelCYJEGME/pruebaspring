package com.jegme.pruebaspring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.jegme.pruebaspring.model.Compras;
import com.jegme.pruebaspring.repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class Controller {

    @Autowired
    private Repository repo;

    @GetMapping("obtenerCompras")
    public List<Compras> getCompras () {
        return repo.findAll();
    }

    @PostMapping("guardarcompra")
    public String compraspost(@RequestBody Compras compras) {
        repo.save(compras);
        return "guradado";
    }
    
    
}
