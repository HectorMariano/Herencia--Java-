public class Tienda extends Negocio{

    private String Propietario;
    private String Proveedor;

    public Tienda (String negocio, String direccion, int licencia, String tipo, String propietario, String proveedor){
        super(negocio, direccion, licencia, tipo);
        this.Propietario = propietario;
        this.Proveedor = proveedor;
    }
    
    public void MostrarInfo(){
        System.out.println("Nombre Negocio: " + GetNombre());
        System.out.println("Direccion: " + GetDireccionNegocio());
        System.out.println("Numero de Licencia: " + GetLicencia_negocio());
        System.out.println("Tipo de Comercio: " + GetTipo_estaplecimiento());
        System.out.println("Propietario: " + Propietario);
        System.out.println("Nombre Proveedor: " + Proveedor);
    }

    public void Vender(){
        System.out.println("\nAcciones:");
        System.out.println("\tVendi unas papas y galletas");
    }
}
