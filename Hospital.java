public class Hospital extends Negocio{

    private String Gerente;
    private int Num_Internos;
    private int Num_pacientes;
    private int Num_telefonico;


    public Hospital(String negocio, String direccion, int licencia, String tipo, String gerente, int internos, int num_pacientes, int telefono){

        super(negocio, direccion, licencia, tipo);
        this.Gerente = gerente;
        this.Num_Internos = internos;
        this.Num_pacientes = num_pacientes;
        this.Num_telefonico = telefono;
    }
    
    public void InfoSistema(){
        System.out.println("Nombre Negocio: " + GetNombre());
        System.out.println("Direccion: " + GetDireccionNegocio());
        System.out.println("Numero de Licencia: " + GetLicencia_negocio());
        System.out.println("Tipo de Comercio: " + GetTipo_estaplecimiento());
        System.out.println("Nombre del Gerente: " + Gerente);
        System.out.println("Total de residentes del hospital: " + Num_Internos);
        System.out.println("Numero de pacientes actualmente registrados: " + Num_pacientes);
        System.out.println("Contacto del Hospital:" + Num_telefonico);
    }

    public void RecibirPaciente(){
        System.out.println("\nAcciones:");
        System.out.println("\tEl dia de hoy esperanos recibir 5 pacientes nuevos");
    }
}
