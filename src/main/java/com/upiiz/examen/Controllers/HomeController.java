package com.upiiz.examen.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "login";
    }

    @GetMapping("/Listado")
    public String Listado(){
        return "Listado";
    }

    @GetMapping("/Listado/Editar")
    public String Editar(){
        return "Editar";
    }

    @GetMapping("/Listado/Eliminar")
    public String Eliminar(){
        return "Eliminar";
    }
    @GetMapping("/Listado/Agregar")
    public String Agregar(){
        return "Agregar";
    }
}

