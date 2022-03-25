public class Fabrica extends Negocio{

    private String Produccion;
    private int Num_empleados;
    private String Lugar_importacion;
    private String Socios;

    public Fabrica(String negocio, String direccion, int licencia, String tipo, String produccion, int num_empleados, String importaciones, String socios){

        super(negocio, direccion, licencia, tipo);
        this.Produccion = produccion;
        this.Num_empleados = num_empleados;
        this.Lugar_importacion = importaciones;
        this.Socios = socios;
    }

    public void InfoLegal(){
        System.out.println("Nombre Negocio: " + GetNombre());
        System.out.println("Direccion: " + GetDireccionNegocio());
        System.out.println("Numero de Licencia: " + GetLicencia_negocio());
        System.out.println("Tipo de Comercio: " + GetTipo_estaplecimiento());
        System.out.println("Produccion manejada: " + Produccion);
        System.out.println("Empleados actuales: " + Num_empleados);
        System.out.println("Lugares de importacion disponibles/trabajados: " + Lugar_importacion);
        System.out.println("Socios:" + Socios);
    }

    public void AgendarPedido(){
        System.out.println("\nAcciones:");
        System.out.println("\tRecibimos un pedido de exportacion para Europa\n");
    }
    
}
