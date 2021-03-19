package Clases;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private Empresa nif;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido, int telefono, Empresa nif) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nif = nif;
    }
    
    // Getter and Setter

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Empresa getNif() {
        return nif;
    }

    public void setNif(Empresa nif) {
        this.nif = nif;
    }
    
}
