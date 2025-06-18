package Logica_Agencia;

public class Main {
    public static void main(String[] args) {
        AgenciaTelefonica agencia = new AgenciaTelefonica();

        //Agregando Contactos
        agencia.agregarContacto("Dennis","0997119351");
        agencia.agregarContacto("Carlos","0984234556");

        //Mostrar los contactos
        System.out.println("--- Contactos de la Agencia ---");
        agencia.mostrarContactos();

        //Buscar contacto
        Contacto dennis = agencia.buscarContacto("Dennis");
        if (dennis != null){
            System.out.println("Encontrado: "+dennis);
        } else {
            System.out.println("El contacto "+ dennis +" No se encontro en el registro");
        }
    }
}