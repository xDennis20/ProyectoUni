package Logica_Agencia;
import java.util.HashMap; //Es como un diccionario en
import java.util.Map;

public class AgenciaTelefonica {
    private Map<String, Contacto> contactos = new HashMap<>(); //Creacion del diccionario
    //Metodos
    public void agregarContacto(String nombre, String telefono) {
        contactos.put(nombre, new Contacto(nombre, telefono)); //put() añade un par clave-valor al HashMap.
    }
}
