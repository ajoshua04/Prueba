
package com.data;

import com.domain.Cuenta;
import java.util.List;


public interface CuentaDao {
    
    public List<Cuenta> encontrarTodasCuentas();
    
    public Cuenta encontrarCuenta(Cuenta cuenta);
    
    public Cuenta encontrarSaldo(Cuenta cuenta);
    
    public Cuenta encontrarClave(Cuenta cuenta);
    
    public void actualizarCuenta(Cuenta cuenta);
    
    public void insertCuenta(Cuenta cuenta);
}
