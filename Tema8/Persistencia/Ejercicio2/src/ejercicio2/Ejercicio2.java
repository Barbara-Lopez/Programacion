package ejercicio2;

import BBDD.*;
import BBDD.exceptions.NonexistentEntityException;
import BBDD.exceptions.PreexistingEntityException;
import UML.*;
import Vistas.*;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.persistence.Persistence;



public class Ejercicio2 {

    public static PersonaJpaController bdp;
    public static EmpresaJpaController bdemp;
    public static EventoJpaController bdev;
    
  
    
    private static VPrincipal vp;
    private static VEventos ve;
    private static VAsistencia va;   
    
    public static Evento e;
    public static Empresa em;
    public static Persona p;
    
    public static char opcionElegida;
    
    public static void main(String[] args) {
        bdp = new PersonaJpaController(Persistence.createEntityManagerFactory("Ejercicio2PU"));
        bdemp = new EmpresaJpaController(Persistence.createEntityManagerFactory("Ejercicio2PU"));
        bdev = new EventoJpaController(Persistence.createEntityManagerFactory("Ejercicio2PU"));
        
        vp=new VPrincipal();
        vp.setVisible(true); 
    }

    // Visualizar ventanas
    
    public static void evento() {
        vp.setVisible(false);
        ve=new VEventos();
        ve.setVisible(true);
    }

    public static void asistencia() {
        vp.setVisible(false);
        va=new VAsistencia();
        va.setVisible(true); 
    }

    public static void salir() {
        vp.dispose();
        System.exit(0); 
    }
    
    // Saber que opción de la ventana eventos nos clican
    
    public static char opcion() {
        return opcionElegida;
    }

    public static void opcionElegida(char opcion) {
        opcionElegida=opcion;
    }
    
    // Volver a la ventana principal
    
    public static void inicio() {
        ve.dispose(); 
        
        vp.setVisible(true); 
    }
    
    public static void inicio2() {
        va.dispose();
        vp.setVisible(true); 
    }
    
    // Eventos
    
    public static void guardar(String nombre, String lugar, String fecha, String horaInicio, String horaFin, String aforo) throws SQLException, ParseException, Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("DD-MM-YYYY");
        Date f= formatter.parse(fecha);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        Date hi=(Date) formato.parse(horaInicio);
        Date hf=(Date) formato.parse(horaFin);
        int aforoEvento=Integer.getInteger(aforo);
        e=new Evento(nombre,lugar,f,hi,hf,aforoEvento);
        bdev.create(e);
    }
    
    public static void actualizar(String nombre, String lugar, String fecha, String horaInicio, String horaFin, String aforo) throws SQLException, ParseException, Exception {
        LocalDate f= LocalDate.parse(fecha, DateTimeFormatter.ofPattern("DD-MM-YYYY"));
        LocalTime hi=LocalTime.parse(horaInicio, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime hf=LocalTime.parse(horaFin, DateTimeFormatter.ofPattern("HH:mm"));
        
        int aforoEvento=Integer.getInteger(aforo);
        e=new Evento(nombre,lugar, convertirDate(f),convertirTime(hi),convertirTime(hf),aforoEvento);
        bdev.edit(e); 
    }    

    public static java.sql.Date convertirDate(LocalDate fecha){
        return java.sql.Date.valueOf(fecha);
    }
    public static java.sql.Time convertirTime(LocalTime hora){
        return java.sql.Time.valueOf(hora);
    }

    public static void eliminar() throws NonexistentEntityException {
        bdev.destroy(e.getNombre()); 
    }

    public static void buscar(String nombre) {
        e=bdev.findEvento(nombre);
    }

    public static String lugar() {
        return e.getLugar();
    }

    public static String fecha() {
        String fecha=String.valueOf(e.getFecha());
        return fecha;
    }

    public static String horaF() {
        String fecha=String.valueOf(e.getHoraFin());
        return fecha;
    }

    public static String horaI() {
        String fecha=String.valueOf(e.getHoraInicio());
        return fecha;
    }

    public static String aforo() {
         String num=String.valueOf(e.getAforo());
        return num;
    }
    
    // Insertar Persona y Empresa
    
    public static void insertarP(String dni, String nombre, String apellido, String telefono) throws PreexistingEntityException, Exception {
        int tel=Integer.parseInt(telefono);
        p=new Persona(dni,nombre,apellido,tel);
        bdp.create(p);
    }

    public static void insertarE(String nif, String nombre) throws Exception {
        int id= Integer.parseInt(nif);
        em=new Empresa(id,nombre);
        bdemp.create(em); 
    }

    
    
}
