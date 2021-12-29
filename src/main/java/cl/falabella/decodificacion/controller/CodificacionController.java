package cl.falabella.decodificacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.falabella.decodificacion.service.CodificacionService;

@Controller
@RequestMapping("/usuario")
class CodificadorController {
    @Autowired
    private CodificacionService codificacionService;
    
    @GetMapping("/codificar/{mensaje}")
    public String codificar(@PathVariable String mensaje){
        return codificacionService.codificarMensaje(mensaje);
    }
    
    @GetMapping("/decodificar/{mensaje}")
    public String decodificar(@PathVariable String mensaje){
        return codificacionService.decodificarMensaje(mensaje);
    }
    
}