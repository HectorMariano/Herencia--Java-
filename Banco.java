public class Banco extends Negocio{

    private String Gerente;
    private int Cuentas_Registradas;
    private String Divisa;

    public Banco(String negocio, String direccion, int licencia, String tipo, String gerente, int cuentas_registradas, String divisa){
        super(negocio, direccion, licencia, tipo);
        this.Gerente = gerente;
        this.Cuentas_Registradas = cuentas_registradas;
        this.Divisa = divisa;
    }

    public void InfoGerencia(){
        System.out.println("Nombre Negocio: " + GetNombre());
        System.out.println("Direccion: " + GetDireccionNegocio());
        System.out.println("Numero de Licencia: " + GetLicencia_negocio());
        System.out.println("Tipo de Comercio: " + GetTipo_estaplecimiento());
        System.out.println("Gerente: " + Gerente);
        System.out.println("Numero de clientes asociados: " + Cuentas_Registradas);
        System.out.println("Divisa manejada: " + Divisa);
    }

    public void AsociarCuenta(){
        System.out.println("\nAcciones:");
        System.out.println("\tNuevo Cliente Registrado con cuenta de socios\n");
    }
    
}
