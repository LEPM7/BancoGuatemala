/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicios;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author luisperalta
 */
@WebService(serviceName = "BanGuatService")
public class BanGuatService {
    
    @WebMethod(operationName = "ConsultaTasaDeCambio") 
    public String ConsultaTasaDeCambio(@WebParam(name = "fecha")String f){
        return new String();
    }
    
    @WebMethod(operationName = "MontosMaximosYMinimos")
    public String MontosMaximosYMinimos(@WebParam(name = "usuario")String u, @WebParam(name = "contrasena")String c, @WebParam(name = "fecha")String f){
        return new String();
    }
    
    @WebMethod(operationName = "")
    public String ConsultaComisionPorRemesa(){
        return new String();
    }

//    @WebMethod(operationName = "")     
//    @WebParam(name = "")
}
