package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @Value("${app.varexample}")
    String message;

    @GetMapping("/saludo")
    public String saludo(){
        return "¡Hola y hasta luego!";
    }

}
