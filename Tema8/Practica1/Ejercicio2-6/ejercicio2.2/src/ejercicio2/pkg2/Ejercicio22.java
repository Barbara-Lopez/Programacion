package ejercicio2.pkg2;

import BD.*;
import Clases.*;
import Vistas.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Ejercicio22 {
    
    private static BaseDatos bd;
    private static TEventos te;

    private static VPrincipal vp;
    private static VEventos ve;
    
    private static char opcionElegida;
    private static int aforoEvento;
    private static Evento e;
    
    public static void main(String[] args) throws Exception {
        bd=new BaseDatos();
        bd.conectar();
        te=new TEventos(bd.getCon());
        
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

    public static void eliminar() throws SQLException {
        te.eliminarEvento();
    }

    public static void inicio() {
        ve.dispose();
        
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
        DateTimeFormatter fecha2=DateTimeFormatter.ofPattern("DD-MM-YYYY");
        LocalDate f= LocalDate.parse(fecha, DateTimeFormatter.ofPattern("DD-MM-YYYY"));
        LocalTime hi=LocalTime.parse(horaInicio, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime hf=LocalTime.parse(horaFin, DateTimeFormatter.ofPattern("HH:mm"));
        aforoEvento=Integer.getInteger(aforo);
        e=new Evento(nombre,lugar,f,hi,hf,aforoEvento);
         te.modificarEvento(e);
    }
}