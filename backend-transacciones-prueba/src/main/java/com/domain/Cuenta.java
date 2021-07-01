
package com.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@NamedQueries({
    @NamedQuery(name = "Cuenta.encontrarTodasCuentas", query = "SELECT p FROM Cuenta p ORDER BY p.idCuenta"),
    @NamedQuery(name = "Cuenta.findByIdCuenta", query = "SELECT c FROM Cuenta c WHERE c.idCuenta = :idCuenta")
})
public class Cuenta implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cuenta")
    private int idCuenta;
    
    private String contraseña;
    private double saldo;
    
    public Cuenta(){
        
    }
    
    public Cuenta(int idCuenta){
        this.idCuenta=idCuenta; 
    }

    public Cuenta(int idCuenta, String contraseña, double saldo) {
        this.idCuenta = idCuenta;
        this.contraseña = contraseña;
        this.saldo = saldo;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "idCuenta=" + idCuenta + ", contrase\u00f1a=" + contraseña + ", saldo=" + saldo + '}';
    }
    
    
}
