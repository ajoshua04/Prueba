
package com.servicio;

import com.data.TransaccionDao;
import com.domain.Cuenta;
import com.domain.Transaccion;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;


@Stateless
@Path("/transacciones")
public class TransaccionServiceRS {
    
    @Inject
    private TransaccionDao transaccionDao;
    
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Transaccion> listarTransacciones(){
        List<Transaccion> transacciones = transaccionDao.findAllTransaccion();
        System.out.println("personas encontradas:"+transacciones);
        return transacciones;
    }
    

    
    
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Transaccion agregarTransaccion(Transaccion transaccion){
        transaccionDao.insertTransaccion(transaccion);
        System.out.println("Transaccion agregada:"+transaccion);
        return transaccion;
    }
    
    

   
        
   
    
    
    
    
}
