package clientebanco;

public class Cliente {

    private String nombre;
    private String apellido;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public String toString() {
        return "nombre: " + this.nombre + "apellido: " + this.apellido + "edad: " + this.edad;
    }

}
