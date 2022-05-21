package datos;

public class Cliente 
{
    private String nombre;
    private String identificacion;
    private String tipoId;
    private float saldo;
    
    public String obtenerNombre(String nombre)
    {
        return this.nombre = nombre;
    }
    
    public String obtenerIdentificacion(String identificacion)
    {
        return this.identificacion = identificacion;
    }

    public String obtenerTipoId(String tipoId) 
    {
        return this.tipoId = tipoId;
    }
    
    public float obtenerSaldo(float saldo)
    {
        return this.saldo;
    }
    
    @Override
    public String toString()
    {
        return "Cliente : "+this.nombre+" con identifiación: "+this.identificacion+" tipo de identificacion: "+this.tipoId+" y saldo: "+this.saldo;
    }

}
