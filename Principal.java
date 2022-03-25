public class Principal {

    public static void main(String[] args) {
        Tienda tienda = new Tienda("Mi Tiendita", "Algun Lugar", 123456789, "Tienda de Conveniencia", "Mariano", "Proveedor Juan");
        Banco banco = new Banco("Montreal", "Otra Direccion", 333002797, "Banco", "Hector", 35678, "Dolares");
        LavadoAutos autolavado = new LavadoAutos("Clean Dude", "No se que direccion", 758462298, "Autolavado", "Remolques,Trocas", "8:00", "20:00");
        Hospital hospital = new Hospital("Santa Fe", "En alguna calle", 98984672, "Hospital", "Torres", 380, 250, 33300272);
        Fabrica fabrica = new Fabrica("Toyoto", "A las afueras de la ciudad", 987654321, "Fabrica", "Carros y partes de los mismos", 700, "Europa y Estados Unidos", "Handa, Ferrare");

        System.out.println("\nDatos de la Tienda de la Esquina: \n");
        tienda.MostrarInfo();
        tienda.Vender();

        System.out.println("\nDatos del Banco mas cercano: \n");
        banco.InfoGerencia();
        banco.AsociarCuenta();

        System.out.println("\nDatos del autolavado mejor calificado: \n");
        autolavado.InformacionNegocio();
        autolavado.LavarAuto();
        autolavado.OfertaDia();

        System.out.println("\nHospital mas cercano registrado:\n");
        hospital.InfoSistema();
        hospital.RecibirPaciente();

        System.out.println("\n\nDatos de la fabrica de Autos:\n");
        fabrica.InfoLegal();
        fabrica.AgendarPedido();
    }

}
