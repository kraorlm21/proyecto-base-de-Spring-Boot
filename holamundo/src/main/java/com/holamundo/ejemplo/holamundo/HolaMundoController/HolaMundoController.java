package com.holamundo.ejemplo.holamundo.HolaMundoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "HOLA MUNDOO"; 
    }

    @GetMapping("/hola")
    public String holaMundo() {
        return "chao amarooo"; 
    } 
}
