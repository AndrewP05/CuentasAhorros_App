package operaciones;

public abstract class GestionDatosC 
{
    private String digitosGen;
    
    public abstract int[] construirAleatoreo();
    
    public int generarAleatoreo()
    {
        int b = (int) (Math.random()*(9-0+1)+0);
        return b;
    }
}
