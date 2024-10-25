package com.jegme.pruebaspring.rutas;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class rutas {
    
    @GetMapping("/hola")
    public String hola() {
        return "hola mi primera api simple";
    }
    

}
