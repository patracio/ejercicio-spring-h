package cl.falabella.decodificacion.service;

import java.util.Base64;

import org.springframework.stereotype.Service;

@Service
public class CodificacionServiceImpl implements CodificacionService
{
    
    public String codificarMensaje(String dato)
    {
    	String encodedString = Base64.getEncoder().encodeToString(dato.getBytes());
        return new String(encodedString);
    }


    public String decodificarMensaje(String dato)
    {
    	byte[] decodedBytes = Base64.getDecoder().decode(dato);
    	String decodedString = new String(decodedBytes);
        return new String(decodedString);
    }
}