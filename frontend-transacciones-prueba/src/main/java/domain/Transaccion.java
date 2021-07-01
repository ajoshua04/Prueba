
package domain;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transaccion {
    

    private Integer idTransaccion;
   
    private String tipo;
    
    private String fecha;
    
    private double saldoAnterior;
    
    private double saldoActual;
    
    private int idCuenta;

    public Transaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Transaccion() {
    }
    
    

    public Transaccion(String tipo, String fecha, double saldoAnterior, double saldoActual, int idCuenta) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.saldoAnterior = saldoAnterior;
        this.saldoActual = saldoActual;
        this.idCuenta = idCuenta;
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
