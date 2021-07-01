
package com.data;

import com.domain.Transaccion;
import java.util.List;



public interface TransaccionDao {
    public List<Transaccion> findAllTransaccion();
    
    public void insertTransaccion(Transaccion transaccion);
}
