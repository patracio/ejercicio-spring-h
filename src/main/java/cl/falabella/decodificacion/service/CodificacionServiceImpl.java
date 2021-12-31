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
        //return null;
    }


    public String decodificarMensaje(String dato)
    {
        String result = dato.replaceAll("[^a-zA-Z0-9]","");
        return result;
    	//String newStr = "";
        //for (int i=0;i<dato.length();i++)
        //{
            
        //}

    }
}