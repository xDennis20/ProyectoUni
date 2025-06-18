package Logica_Agencia;

public class Contacto {
    private String nombre;
    private String telefono;

    //Constructor
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // getters y setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    @Override // Resolvi un bug que al momento de imprimir me salia los nombres de las clases y no en String, tuve que pedir a la IA que me ayude en este bug
    public String toString(){
        return nombre + ": " + telefono;
    }
}
