/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.rest.service;

import co.com.rest.clientsoap.Empelado;
import co.com.rest.clientsoap.manager.ClientManager;
import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

@Path("/empleado")
public class EmpleadoService {

    @GET
    @Produces("application/json")
    @Path("/hola")
    public String getHola(){
        return "Hola";
    }
    
    @GET
    @Produces("application/json")
    public Response getMsg(@PathParam("nombres") String nombres,
            @PathParam("apellidos") String apellidos,
            @PathParam("tipoDocumento") String tipoDocumento,
            @PathParam("numeroDocumento") String numeroDocumento,
            @PathParam("cargo") String cargo,
            @PathParam("salario") String salario,
            @PathParam("fechaNacimiento") String fechaNacimiento,
            @PathParam("fechaVinculacion") String fechaVinculacion
    ) {

        String mensaje = "";

        if (validarCampos(mensaje, nombres, apellidos, tipoDocumento,
                numeroDocumento, cargo, salario, fechaNacimiento, fechaVinculacion)) {
            try {

                ClientManager clientManager = new ClientManager();
                Empelado empelado = new Empelado();
                empelado.setNombres(nombres);
                empelado.setApellidos(apellidos);
                empelado.setTipoDocumento(tipoDocumento);
                empelado.setSalario(new Double(salario));
                GregorianCalendar geCalendar = new GregorianCalendar();
                geCalendar.setTime(new Date(fechaNacimiento));
                XMLGregorianCalendar fechaNacimientoGreg = DatatypeFactory.newInstance().newXMLGregorianCalendar(geCalendar);
                empelado.setFechaNacimiento(fechaNacimientoGreg);
                GregorianCalendar geCalendar2 = new GregorianCalendar();
                geCalendar2.setTime(new Date(fechaVinculacion));
                XMLGregorianCalendar fechaVinculacionGreg = DatatypeFactory.newInstance().newXMLGregorianCalendar(geCalendar2);
                empelado.setFechaVinculacion(fechaVinculacionGreg);

                mensaje = clientManager.crearEmpleado(empelado);
            } catch (Exception ex) {

            }

        }

        return Response.status(200).entity(mensaje).build();

    }

    private boolean validarCampos(String mensaje, String nombres,
            String apellidos, String tipoDocumento, String numeroDocumento, String cargo,
            String salario, String fechaNacimiento, String fechaVinculacion) {
        boolean flag = true;

        if (nombres == null || nombres.equals("")) {
            flag = false;
            mensaje = "Debe diligenciar los nombres \n";
        }

        if (apellidos == null || apellidos.equals("")) {
            flag = false;
            mensaje = "Debe diligenciar los apellidos \n";
        }

        if (tipoDocumento == null || cargo.equals("")) {
            flag = false;
            mensaje = "Debe diligenciar el tipo de documento \n";
        }

        if (numeroDocumento == null || numeroDocumento.equals("")) {
            flag = false;
            mensaje = "Debe diligenciar el numero de documento \n";
        }

        if (cargo == null || cargo.equals("")) {
            flag = false;
            mensaje = "Debe diligenciar el cargo \n";
        }

        if (salario == null || salario.equals("")) {
            flag = false;
            mensaje = "Debe diligenciar la fecha de nacimiento \n";
        }

        if (fechaNacimiento == null || fechaNacimiento.equals("")) {
            flag = false;
            mensaje = "Debe diligenciar la fecha de nacimiento \n";
        }

        if (fechaVinculacion == null || fechaVinculacion.equals("")) {
            flag = false;
            mensaje = "Debe diligenciar la fecha de vinculación \n";
        }

        return flag;
    }

}
