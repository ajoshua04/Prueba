
package com.domain;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@NamedQueries({
    @NamedQuery(name = "Transaccion.findAll", query = "SELECT t FROM Transaccion t ORDER BY t.idTransaccion")})
public class Transaccion implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_transaccion")
    private Integer idTransaccion;
    private String tipo;
    
    private String fecha;
    @Column(name = "saldo_anterior")
    private double saldoAnterior;
    @Column(name = "saldo_actual")
    private double saldoActual;
    
    @Column(name = "id_cuenta")
    private int idCuenta;
    

    public Transaccion(String tipo, String fecha, double saldoAnterior, double saldoActual, int idCuenta) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.saldoAnterior = saldoAnterior;
        this.saldoActual = saldoActual;
        this.idCuenta = idCuenta;
    }

    public Transaccion() {
    }

    public Transaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }
    
    

    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "idTransaccion=" + idTransaccion + ", tipo=" + tipo + ", fecha=" + fecha + ", saldoAnterior=" + saldoAnterior + ", saldoActual=" + saldoActual + ", idCuenta=" + idCuenta + '}';
    }

    
    
    
    
    
}
