package test;


import java.util.Arrays;
import operaciones.GestionDatos;
import operaciones.GestionDatosC;
import org.junit.Assert;
import org.junit.Test;

public class pruebaGestionDatos 
{
    
    public pruebaGestionDatos()
    {
        
    }
    @Test
    public void pruebaDigitos()
    {
        GestionDatos gd = new GestionDatos();
        int  guardar =gd.generarAleatoreo();
        int [] generado = gd.construirAleatoreo();
        Assert.assertTrue(guardar>0 && guardar<10);
        System.out.println("Numero Aleatoreo: "+Arrays.toString(generado));
    }

    

}
