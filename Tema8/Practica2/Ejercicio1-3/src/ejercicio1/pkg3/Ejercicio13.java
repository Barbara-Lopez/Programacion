package ejercicio1.pkg3;

import BD.*;
import Vistas.*;
import Clases.*;
import java.sql.SQLException;

public class Ejercicio13 {
    
    private static BaseDatos bd;
    private static TAbogados ta;
    private static TCasos tc;
    private static TCliente tcli;
    private static TCasoAbogado tca;
    
    private static VPrincipal vp;
    private static VCliente vcli;
    private static VAbogado va;
    private static VCaso vc;
    private static VConsultas vC;

    private static char opcionCliente;
    private static char opcionAbogado;
    private static char opcionCaso;
    
    private static Cliente cli;
    private static Abogado a;
    private static Caso c;
    private static String consulta;
    
    public static void main(String[] args) {
        bd=new BaseDatos();
        bd.conexion();
        ta=new TAbogados(bd.getCon());
        tc=new TCasos(bd.getCon());
        tcli=new TCliente(bd.getCon());
        tca=new TCasoAbogado(bd.getCon());
        
        vp=new VPrincipal();
        vp.setVisible(true);
    }
    
    // Volver al inicio
    public static void inicioConsulta() {
        vC.dispose();
        
        vp.setVisible(true);        
    }
    public static void inicioC() {
        vc.dispose();
        
        vp.setVisible(true);        
    }
    public static void inicioA() {
        va.dispose();
        
        vp.setVisible(true);        
    }
    public static void inicioCli() {
        vcli.dispose();
        
        vp.setVisible(true);        
    }
    
    // Visualizar ventanas
    public static void vCliente() {
        vp.setVisible(false);
        
        vcli=new VCliente();
        vcli.setVisible(true);
    }
    public static void vAbogado() {
        vp.setVisible(false);
        
        va=new VAbogado();
        va.setVisible(true);
    }
    public static void vCaso() {
        vp.setVisible(false);
        
        vc=new VCaso();
        vc.setVisible(true);
    }
    public static void vConsultas() {
        vp.setVisible(false);
        
        vC=new VConsultas();
        vC.setVisible(true);
    }
    
    // Opciones elegidas
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
    public static void opcionConsulta(String opcion) {
        consulta=opcion;
    }
    public static String consulta() {
        return consulta;
    }
    
    // Cliente
    public static void bajaCliente() throws Exception {
        tcli.eliminar();
    }

    public static void altaCliente(String dni, String nombre, String apellido, String telefono, String correo) throws Exception {
        int tel=Integer.parseInt(telefono);
        cli=new Cliente(dni,nombre,apellido,tel,correo);
        tcli.alta(cli);
    }

    public static void modificarCliente(String dni, String nombre, String apellido, String telefono, String correo) throws Exception {
        int tel=Integer.parseInt(telefono);
        cli=new Cliente(dni,nombre,apellido,tel,correo);
        tcli.modificar(cli);
    }
    public static void consultarCli(String dni, String nombre, String apellido, String telefono, String correo) throws SQLException{
        int tel=Integer.parseInt(telefono);
        cli=new Cliente(dni,nombre,apellido,tel,correo);
        tcli.consultar(cli);
    }
            
    public static void confirmarCliente(String dni) throws Exception {
        cli=tcli.confirmar(dni);
    }
     
    public static String getDniCli(){
        return cli.getDni();
    }
    public static String getNombreCli(){
        return cli.getNombre();
    }
    public static String getApellidoCli(){
        return cli.getApellido();
    }
    public static String getTelefonoCli(){
        String tel=String.valueOf(cli.getTelefono());
        return tel;
    }
    public static String getCorreoCli(){
        return cli.getCorreo();
    }
    
     
    // Caso
    public static void bajaCaso() {
        tc.eliminar();
    }
    
    public static void confirmarCaso(String id) {
        c=tc.confirmar(id);
    }

    public static void altaCaso(String id, String fechaI, String fechaF, String estado, String cliente) throws Exception {
        cli=tcli.confirmar(cliente);
        
        
        c=new Caso();
    }
    
    public static void modificarCaso(String id, String fechaI, String fechaF, String estado, String cliente) throws Exception {
        cli=tcli.confirmar(cliente);
    }
    public static void consultarC(String id, String fechaI, String fechaF, String estado, String cliente){
    
    }
    
    
    // Abogado 
    public static void bajaAbogado() {
        ta.eliminar();
    }    

    public static void altaAbogado(String dni, String nombre, String apellido, String direccion) throws SQLException {
        a= new Abogado(dni,nombre,apellido,direccion);
        ta.alta(a);
    }

    public static void modificarAbogado(String dni, String nombre, String apellido, String direccion) throws SQLException {
        a= new Abogado(dni,nombre,apellido,direccion);
        ta.modificar(a);
    } 
    
    public static void confirmarAbogado(String dni) throws Exception {
        a=ta.confirmar(dni);
    }
    
    public static String getDniA(){
        return a.getDni();
    }
    public static String getNombreA(){
        return a.getNombre();
    }
    public static String getApellidoA(){
        return a.getApellido();
    }
    public static String getDireccionA(){
        return a.getDireccion();
    }
    
    // Caso-Abogado
    public static void insertarCasoAbogado(String dni, String id) throws Exception {
       a=ta.confirmar(dni);
       c=tc.confirmar(id);
       tca.insertar(c,a);
    }
    
   
 

}
