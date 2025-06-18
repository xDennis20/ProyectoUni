package Logica_Agencia;
import java.util.HashMap; //Es como un diccionario en
import java.util.Map;

public class AgenciaTelefonica {
    private Map<String, Contacto> contactos = new HashMap<>(); //Creacion del diccionario
    //Metodos
    public void agregarContacto(String nombre, String telefono) {
        contactos.put(nombre, new Contacto(nombre, telefono)); //put() añade un par clave-valor al HashMap.
    }
    public Contacto buscarContacto(String nombre) {
        return contactos.get(nombre);  // Busca el contacto en el diccionario y si no esta devuelve valor Null (None)
    }

    public void mostrarContactos(){
        contactos.entrySet().stream() // Convierte el HashMap en una lista de pares [clave, valor].
                .sorted(Map.Entry.comparingByKey()) // stream() + sorted(): Ordena los contactos alfabéticamente por nombre (clave)
                .forEach(entry -> System.out.println(entry.getValue())); // forEach(): Imprime cada contacto.
    }
}
