/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.rest.clientsoap.manager;

import co.com.rest.clientsoap.Empelado;
import co.com.rest.clientsoap.EmpleadoService;
import co.com.rest.clientsoap.EmpleadoService_Service;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author USUARIO
 */
public class ClientManager {

    
    private EmpleadoService_Service service;
    private EmpleadoService port;

    public ClientManager() {
        if(port == null){
             port = service.getEmpleadoServicePort();
        }
    }
    
    
    
    
    public  String  crearEmpleado(Empelado empelado){
        try { 
            
            String result = port.crearEmpleado(empelado);
            System.out.println("Result = "+result);
            return result;
        } catch (Exception ex) {
            return null;
        }

    }
    
}
