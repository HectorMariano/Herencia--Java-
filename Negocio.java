public class Negocio{

    private String Nombre_negocio;
    private String Dirección_negocio;
    private int Licencia_negocio;
    private String Tipo_establecimiento;

    public Negocio(String negocio, String direccion, int licencia, String tipo){
        this.Nombre_negocio = negocio;
        this.Dirección_negocio = direccion;
        this.Licencia_negocio = licencia;
        this. Tipo_establecimiento = tipo;
    }

    public String GetNombre(){
        return Nombre_negocio;
    }
    public String GetDireccionNegocio(){
        return Dirección_negocio;
    }
    public int GetLicencia_negocio(){
        return Licencia_negocio;
    }
    public String GetTipo_estaplecimiento(){
        return Tipo_establecimiento;
    }

    
}