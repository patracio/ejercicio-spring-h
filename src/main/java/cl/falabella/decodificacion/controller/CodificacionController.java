package cl.falabella.decodificacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import cl.falabella.decodificacion.service.CodificacionService;
import cl.falabella.decodificacion.payroll.Input;

@RestController
@RequestMapping("/usuario")
class CodificadorController {
    @Autowired
    private CodificacionService codificacionService;
    
    @PostMapping("/codificar")
    public String codificar(@RequestBody Input mensaje){
        return codificacionService.codificarMensaje(mensaje.dato);
    }
    
    @PostMapping("/decodificar")
    public String decodificar(@RequestBody Input mensaje){
        return codificacionService.decodificarMensaje(mensaje.dato);
    }
    
}