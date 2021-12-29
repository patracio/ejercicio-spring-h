package cl.falabella.decodificacion.service;

import org.springframework.stereotype.Service;


public interface CodificacionService {
    public String codificarMensaje(String mensaje);
    public String decodificarMensaje(String mensaje);
}