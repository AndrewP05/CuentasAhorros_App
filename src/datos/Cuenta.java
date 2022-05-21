package datos;

public abstract class  Cuenta   
{
    private Cliente elCliente;
    private String saldo;
    private String numCuenta;
    
    public Cliente obtenerCliente(Cliente elCliente)
    {
        return this.elCliente = elCliente;
    }
    
    public String obtenerNumCuenta(String numCuenta)
    {
        return this.numCuenta = numCuenta;
    }
    
    public String obtenerSaldo(String saldo)
    {
        return this.saldo = saldo;
    }
    
    
    @Override
    public String toString()
    {
        return "Numero de cuenta: "+numCuenta+" del cliente: "+elCliente;
    }
   
    
}
