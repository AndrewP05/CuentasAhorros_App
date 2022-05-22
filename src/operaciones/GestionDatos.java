package operaciones;

import datos.*;

public class GestionDatos extends GestionDatosC
{
    public Cliente crearCliente(String nombre, String identificacion, float saldo)
    {
        Cliente cl = new Cliente();
        cl.obtenerNombre(nombre);
        cl.obtenerIdentificacion(identificacion);
        cl.obtenerSaldo(saldo);
        
        return cl;
    }
    
    public Cuenta crearCuenta(Cliente elCliente, String numCuenta)
    {
        Cuenta cu = new Cuenta() {};
        cu.obtenerCliente(elCliente);
        cu.obtenerNumCuenta(numCuenta);
        return cu;
        
    }
    
    public String extraerDigitosId(String identificacion)
    {
        if(identificacion.length()>4)
        {
            char num1 = identificacion.charAt(identificacion.length()-1);
            char num2 = identificacion.charAt(identificacion.length()-2);
            char num3 = identificacion.charAt(identificacion.length()-3);
            char num4 = identificacion.charAt(identificacion.length()-4); 
            
            String Digitos = (Character.toString(num1)+Character.toString(num2)+Character.toString(num3)+Character.toString(num4));
            
            String numeroCuenta ="57"+"22"+Digitos+construirAleatoreo();
            
            return numeroCuenta;
        }
        else
        {
            return null;
        }
        
    }
    
    public boolean buscarCuenta(Cuenta Cuenta, Cliente elCliente, String identificacion, String tipoId)
    {
        Cuenta cu = new Cuenta() {};
        cu.obtenerCliente(elCliente);
        Cliente cli = new Cliente();
        String idObtenida = cli.obtenerIdentificacion(identificacion);
        cli.obtenerTipoId(tipoId);
        
        
        
        
        return false;
    }

    @Override
    public int[] construirAleatoreo() 
    {
        int numero[] = new int [4];
        
        int num1 = generarAleatoreo();
        numero [0]=num1;
        int posicion=1;
        while(posicion<4)
        {
           int num2 = generarAleatoreo();
           boolean existe=false;
           for(int i=0; i<posicion; i++){
               if (numero[i]==num2)
               {
                   existe=true;
               }
           }
           if(!existe )
           {
               numero [posicion++]=num2;
           }
 
        }
        return numero;
    }
    @Override
    public String toString()
    {
        return "El numero es: "+this.construirAleatoreo();
    }

}
