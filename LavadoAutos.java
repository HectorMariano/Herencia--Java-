public class LavadoAutos extends Negocio{

    private String Vehiculo_NoAceptado;
    private String Horario_Inicio;
    private String Horario_Cierre;

    public LavadoAutos(String negocio, String direccion, int licencia, String tipo, String vehiculo, String inicio, String cierre){
        super(negocio, direccion, licencia, tipo);
        this.Vehiculo_NoAceptado = vehiculo;
        this.Horario_Inicio = inicio;
        this.Horario_Cierre = cierre;
    }

    public void InformacionNegocio(){
        System.out.println("Nombre Negocio: " + GetNombre());
        System.out.println("Direccion: " + GetDireccionNegocio());
        System.out.println("Numero de Licencia: " + GetLicencia_negocio());
        System.out.println("Tipo de Comercio: " + GetTipo_estaplecimiento());
        System.out.println("No trabajamos con: " + Vehiculo_NoAceptado);
        System.out.println("Abrimos a las: " + Horario_Inicio);
        System.out.println("Cesamos operaciones a las: " + Horario_Cierre);
    }

    public void LavarAuto(){
        System.out.println("\nAcciones:");
        System.out.println("\tEstoy lavando un Mercedes");
    }
    public void OfertaDia(){
        System.out.println("\tHoy tenemos un 30% menos en taxis\n");
    }

}
