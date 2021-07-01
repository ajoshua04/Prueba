
package com.data;

import com.domain.Cuenta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
@Stateless
public class CuentaDaoImpls implements CuentaDao{

    @PersistenceContext(unitName = "TransaccionPU")
    EntityManager em ;
    
    @Override
    public Cuenta encontrarCuenta(Cuenta cuenta) {
        return em.find(Cuenta.class, cuenta.getIdCuenta());
    }

    @Override
    public Cuenta encontrarSaldo(Cuenta cuenta) {
        return em.find(Cuenta.class, cuenta.getSaldo());
    }

    @Override
    public Cuenta encontrarClave(Cuenta cuenta) {
        return em.find(Cuenta.class, cuenta.getContraseña());
    }

    @Override
    public void insertCuenta(Cuenta cuenta) {
        em.persist(cuenta);
        em.flush();
    }

    @Override
    public List<Cuenta> encontrarTodasCuentas() {
       return em.createNamedQuery("Cuenta.encontrarTodasCuentas").getResultList();
    }

    @Override
    public void actualizarCuenta(Cuenta cuenta) {
        em.merge(cuenta);
    }
    
}
