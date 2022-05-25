package operaciones;

import datos.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import utilidades.GestorPersistencia;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class GestionDatos extends GestionDatosC implements Serializable
{
    public Map<String, Cuenta> ListaCuentas;
    public GestionDatos()
    {
        if(ListaCuentas == null)
        {
            ListaCuentas = (Map<String, Cuenta>) GestorPersistencia.recuperar();
            if(ListaCuentas == null)
            {
                ListaCuentas = new HashMap<>();
            }
        }
        
    }
    
    
    public Cliente crearCliente(String nombre, String identificacion, String tipoId)
    {
        Cliente cl = new Cliente();
        cl.obtenerNombre(nombre);
        cl.obtenerIdentificacion(identificacion);
        cl.obtenerTipoId(tipoId);
        
        
        return cl;
    }

    
    public Cuenta crearCuenta(String nombre, String identificacion, double saldo, String tipoId)
    {
        Cliente elCliente = this.crearCliente(nombre, identificacion, tipoId);
        Cuenta cu = new Cuenta(elCliente, saldo,extraerDigitosId(identificacion) ) ;
        //cu.obtenerCliente();
        //cu.obtenerNumCuenta();
        //cu.obtenerSaldo();
        
        //Cliente cli = this.crearCliente(numCuenta, numCuenta, 0);
        ListaCuentas.put(cu.obtenerNumCuenta(),cu);
        GestorPersistencia.guardar(ListaCuentas);
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
            
            int [] n = construirAleatoreo();
            String numeroCuenta ="57"+"22"+Digitos+Arrays.toString(n).format("", "");
            toString();
            return numeroCuenta;
        }
        else
        {
            return null;
        }
        
    }
    

    
    
    public boolean buscarCuenta(Cuenta Cuenta, Cliente elCliente, String identificacion, String tipoId)
    {
        Cuenta cu = new Cuenta(elCliente, 0, tipoId);
        cu.obtenerCliente();
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

    
    public Map<String, Cuenta> obtenerLista()
    {
        return (Map<String, Cuenta>) this.ListaCuentas;
        
                
    }
}
