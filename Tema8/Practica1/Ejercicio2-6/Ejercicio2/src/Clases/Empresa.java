package Clases;

public class Empresa {
    private int nif;
    private String nombre;

    public Empresa() {
    }

    public Empresa(int nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }
    
    // getter and Setter

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
