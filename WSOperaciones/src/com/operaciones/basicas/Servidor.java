package com.operaciones.basicas;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;



@WebService()
@XmlSeeAlso({Respuesta.class})
public class Servidor {

	@WebMethod(operationName="Operaciones")
    public  List Operaciones(int numero1,int numero2){
        List lista=new ArrayList();
        Respuesta r=new Respuesta();
        int suma= numero1+ numero2;
        int resta=numero1-numero2;
        double division= numero1/numero2;
        int multiplicacion=numero1*numero2;
        
        r.setTipo("Respuesta Suma");
        r.setRespuesta(String.valueOf(suma));
        lista.add(r);
        r=new Respuesta();
        r.setTipo("Respuesta resta");
        r.setRespuesta(String.valueOf(resta));
        lista.add(r);
        r=new Respuesta();
        r.setTipo("Respuesta division");
        r.setRespuesta(String.valueOf(division));
        lista.add(r);
        r=new Respuesta();
        r.setTipo("Respuesta multiplicacion");
        r.setRespuesta(String.valueOf(multiplicacion));
        lista.add(r);

        
        return  lista; 
        
    }

}