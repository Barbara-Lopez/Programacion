package ejercicio1;

import Controler.E.PersonaJpaController;
import Vistas.*;
import Entidades.*;
import java.util.List;
import javax.persistence.Persistence;

public class Ejercicio1 {

    private static VPrincipal vp;
    private static VPersonas vper;
    
    private static PersonaJpaController bdp;
    
    private static Persona p;
    private static int numeroOpciones;
    private static List<Persona> listaPersona;
    private static int opcionListado;
    
    public static void main(String[] args) {
        
        bdp = new PersonaJpaController(Persistence.createEntityManagerFactory("Ejercicio1PU"));
        
        
        vp=new VPrincipal();
        vp.setVisible(true);
        
    }

    public static void seleccion(int num) {
        if(num==4)
            numeroOpciones=0;
        else
            numeroOpciones=num;
    }

    public static void vpersona() {
        vp.setVisible(false);
        
        vper=new VPersonas();
        vper.setVisible(true);
    }

    public static void terminar() {
        System.exit(0);
    }

    public static int opcion() {
        return numeroOpciones;
    }

    public static void consultaP(String nombre) {
        p=bdp.findPersona(nombre);
    }
    public static void consultarTodo(String opcion) {
       listaPersona=bdp.findPersonaEntities(); 
       switch(opcion){
            case "alante":
                opcionListado=opcionListado+1;
                break;
            case "atras":
                opcionListado=opcionListado-1;
                break;
            case "0":
                opcionListado=0;
                break;
       }
       personaListado();
    }
    public static void personaListado(){
        p=new Persona(listaPersona.get(opcionListado).getNombre(),listaPersona.get(opcionListado).getEdad(),
                listaPersona.get(opcionListado).getProfesion(),listaPersona.get(opcionListado).getTelefono());
        
    }
    public static String devolverNombre() {
        return p.getNombre();
    }

    public static String devolverEdad() {
        return p.getEdad();
    }

    public static String devolverProfesion() {
        return p.getProfesion();
    }

    public static String devolverTelefono() {
        return p.getTelefono();
    }

    public static void vprincipal() {
        vper.dispose();
        vp.setVisible(true);
    }

    public static void registrar(String nombre, String edad, String profesion, String telefono) throws Exception {
        p=new Persona(nombre,edad,profesion,telefono);
        bdp.create(p); 
    }
    
}
