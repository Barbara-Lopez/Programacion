package ejercicio1.pkg3;

import BD.*;
import Vistas.*;
import Clases.*;

public class Ejercicio13 {
    
    private static BaseDatos bd;
    private static TAbogados ta;
    private static TCasos tc;
    private static TCliente tcli;
    
    private static VPrincipal vp;
    private static VCliente vcli;

    private static char opcionCliente;
    private static char opcionAbogado;
    private static char opcionCaso;
    
    private static Cliente cli;
    private static Abogado a;
    private static Caso c;
    
    public static void main(String[] args) {
        bd=new BaseDatos();
        bd.conexion();
        ta=new TAbogados(bd.getCon());
        tc=new TCasos(bd.getCon());
        tcli=new TCliente(bd.getCon());
        
        vp=new VPrincipal();
        vp.setVisible(true);
    }
    public static void vCliente() {
        vp.setVisible(false);
        
        vcli=new VCliente();
        vcli.setVisible(true);
    }
    public static void inicio() {
        vcli.dispose();
        
        vp.setVisible(true);        
    }
    public static void opcionCliente(char cliente) {
        opcionCliente=cliente;
    }
    public static char opcionCli() {
        return opcionCliente;
    }
    public static void opcionAbogado(char abogado) {
        opcionAbogado=abogado;
    }
    public static char opcionA() {
        return opcionAbogado;
    }
    public static void opcionCaso(char caso) {
        opcionCaso=caso;
    }
    public static char opcionCa() {
        return opcionCaso;
    }

    public static void bajaCliente() {
        tcli.eliminar();
    }

    public static void confirmarCliente(String dni) {
        cli=tcli.confirmar(dni);
    }

    public static void altaCliente(String dni, String nombre, String apellido, String telefono, String correo) {

    }

    public static void modificarCliente(String dni, String nombre, String apellido, String telefono, String correo) {

    }
    public static void bajaCaso() {
        tc.eliminar();
    }

    public static void confirmarCaso(String id) {
        cli=tc.confirmar(id);
    }

    public static void altaCaso() {

    }

    public static void modificarCaso() {

    }
   
    public static void bajaAbogado() {
        ta.eliminar();
    }

    public static void confirmarAbogado(String dni) {
        cli=tcli.confirmar(dni);
    }

    public static void altaAbogado(String dni, String nombre, String apellido, String direccion) {
        
    }

    public static void modificarAbogado(String dni, String nombre, String apellido, String direccion) {

    }

}
