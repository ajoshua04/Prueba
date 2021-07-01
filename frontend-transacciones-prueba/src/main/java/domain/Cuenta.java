

package domain;


import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cuenta {
    
   
    private int idCuenta;
   
    private String contraseña;
    private double saldo;
    
  
    private List<Transaccion> transaccionList;
    
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

    public List<Transaccion> getTransaccionList() {
        return transaccionList;
    }

    public void setTransaccionList(List<Transaccion> transaccionList) {
        this.transaccionList = transaccionList;
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
