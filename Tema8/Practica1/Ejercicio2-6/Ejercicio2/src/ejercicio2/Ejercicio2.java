package ejercicio2;

import BD.*;
import Clases.*;
import Vistas.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Ejercicio2 {
 private static BaseDatos bd;
    private static TEventos te;
    private static TAsistencia ta;
    private static TEmpresa temp;
    private static TPersona tp;

    private static VPrincipal vp;
    private static VEventos ve;
    private static VAsistencia va;
    
    private static char opcionElegida;
    private static int aforoEvento;
    private static Evento e;
    private static Persona p; 
    private static Empresa emp;
    
    public static void main(String[] args) throws Exception {
        bd=new BaseDatos();
        bd.conectar();
        te=new TEventos(bd.getCon());
        ta=new TAsistencia(bd.getCon());
        temp=new TEmpresa(bd.getCon());
        tp=new TPersona(bd.getCon());
        
        vp= new VPrincipal();
        vp.setVisible(true); 
    }

    public static void salir() {
        vp.dispose();
        System.exit(0); 
    }

    public static char opcion() {
        return opcionElegida;
    }

    public static void opcionElegida(char opcion) {
        opcionElegida=opcion;
    }

    public static void guardar(String nombre, String lugar, String fecha, String horaInicio, String horaFin, String aforo) throws SQLException {
        LocalDate f= LocalDate.parse(fecha, DateTimeFormatter.ofPattern("DD-MM-YYYY"));
        LocalTime hi=LocalTime.parse(horaInicio, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime hf=LocalTime.parse(horaFin, DateTimeFormatter.ofPattern("HH:mm"));
        aforoEvento=Integer.getInteger(aforo);
        e=new Evento(nombre,lugar,f,hi,hf,aforoEvento);
        te.insertarEvento(e);
    }

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
    public static void eliminar() throws SQLException {
        te.eliminarEvento();
    }

    public static void inicio() {
        ve.dispose();
        
        vp.setVisible(true);
    }
    public static void inicio2() {
        va.dispose();
        
        vp.setVisible(true);
    }
    public static void buscar(String nombre) throws Exception {
        e=te.buscar(nombre);
    }
    public static String lugar() {
        return e.getLugar();
    }

    public static String fecha() {
        String fecha=String.valueOf(e.getFecha());
        return fecha;
    }
    public static String horaI() {
        String horaI=String.valueOf(e.getHoraInicio());
        return horaI;
    }
    public static String horaF() {
        String horaF=String.valueOf(e.getHoraFin());
        return horaF;
        
    }
    public static String aforo() {
        String aforo=String.valueOf(e.getAforo());
        return aforo;
    }

    public static void actualizar(String nombre, String lugar, String fecha, String horaInicio, String horaFin, String aforo) throws SQLException, Exception {
        LocalDate f= LocalDate.parse(fecha, DateTimeFormatter.ofPattern("DD-MM-YYYY"));
        LocalTime hi=LocalTime.parse(horaInicio, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime hf=LocalTime.parse(horaFin, DateTimeFormatter.ofPattern("HH:mm"));
        aforoEvento=Integer.getInteger(aforo);
        e=new Evento(nombre,lugar,f,hi,hf,aforoEvento);
         te.modificarEvento(e);
    }
    public static void insertarE(String nif, String nombre) {
        int identificador=Integer.getInteger(nif);
        emp=new Empresa(identificador,nombre);
        temp.insetar(emp);
        
    }
    public static void insertarP(String dni, String nombre, String apellidos, String telefono) {
        int tel=Integer.getInteger(telefono);
        p=new Persona(dni,nombre,apellidos,tel,emp);
        tp.insetar(p);
    }
    public static void insetAsistencia() throws SQLException {
        ta.insetar(p,e);
    }


    
}
