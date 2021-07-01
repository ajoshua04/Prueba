
package com.servicio;

import com.data.CuentaDao;
import com.domain.Cuenta;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;


@Stateless
@Path("/cuentas")
public class CuentaServiceRS {
    
    @Inject
    private CuentaDao cuentaDao;
    
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Cuenta> listarCuentas(){
        List<Cuenta> cuentas = cuentaDao.encontrarTodasCuentas();
        System.out.println("personas encontradas:"+cuentas);
        return cuentas;
    }
    
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("{id}")//hace referencia al path: /cuentas/{id}
    public Cuenta encontrarCuenta(@PathParam("id") int id){
        Cuenta cuenta = cuentaDao.encontrarCuenta(new Cuenta(id));
        System.out.println("Persona encontrada:"+cuenta);
        return cuenta;
    }
    
    @PUT
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Response modificarCuenta(@PathParam("id") int id, Cuenta cuentaModificada){
        Cuenta cuenta = cuentaDao.encontrarCuenta( new Cuenta(id));
        
        if(cuenta != null){
            cuentaDao.actualizarCuenta(cuentaModificada);
            System.out.println("persona modificada:" + cuentaModificada);
            return Response.ok().entity(cuentaModificada).build();
        }
        else{
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
