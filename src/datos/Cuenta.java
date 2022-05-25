package datos;

import java.io.Serializable;

public class Cuenta implements Serializable
{
    private Cliente elCliente;
    private double saldo;
    private String numCuenta;

    public Cuenta(Cliente elCliente, double saldo, String numCuenta) 
    {
        this.elCliente = elCliente;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

    public Cliente obtenerCliente()
    {
        return this.elCliente;
    }
    public String obtenerNumCuenta()
    {
        return this.numCuenta = numCuenta;
    }
    
    public double obtenerSaldo()
    {
        return this.saldo = saldo;
    }
    
    
    
    @Override
    public String toString()
    {
        return "numero de cuenta: "+numCuenta+" del cliente: "+elCliente+" con saldo :"+saldo;
    }
   
    
}
