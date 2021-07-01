
package com.data;

import com.domain.Transaccion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class TransaccionDaoImpl implements TransaccionDao{
    
    @PersistenceContext(unitName = "TransaccionPU")
    EntityManager em ;

    @Override
    public List<Transaccion> findAllTransaccion() {
        return em.createNamedQuery("Transaccion.findAll").getResultList();
    }

    @Override
    public void insertTransaccion(Transaccion transaccion) {
        em.persist(transaccion);
        em.flush();
    }


   

    
}
