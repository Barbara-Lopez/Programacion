package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Caso {
    private String id;
    private LocalDate fechaI;
    private LocalDate fechaF;
    private String estado;
    private Cliente c;
    private ArrayList<Abogado> listaAbogado;

    public Caso() {
    }

    public Caso(String id, LocalDate fechaI, String estado, Cliente c, ArrayList<Abogado> listaAbogado) {
        this.id = id;
        this.fechaI = fechaI;
        this.estado = estado;
        this.c = c;
        this.listaAbogado = listaAbogado;
    }

    public Caso(String id, LocalDate fechaI, LocalDate fechaF, String estado, Cliente c, ArrayList<Abogado> listaAbogado) {
        this.id = id;
        this.fechaI = fechaI;
        this.fechaF = fechaF;
        this.estado = estado;
        this.c = c;
        this.listaAbogado = listaAbogado;
    }
    
    // Getter and Setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaI() {
        return fechaI;
    }

    public void setFechaI(LocalDate fechaI) {
        this.fechaI = fechaI;
    }

    public LocalDate getFechaF() {
        return fechaF;
    }

    public void setFechaF(LocalDate fechaF) {
        this.fechaF = fechaF;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public ArrayList<Abogado> getListaAbogado() {
        return listaAbogado;
    }

    public void setListaAbogado(Abogado a) {
        if(listaAbogado==null)
            listaAbogado=new ArrayList();
        this.listaAbogado.add(a); 
    }
    
}
