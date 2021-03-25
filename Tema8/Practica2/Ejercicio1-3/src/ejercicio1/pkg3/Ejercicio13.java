package ejercicio1.pkg3;

import Vistas.*;

public class Ejercicio13 {
    
    private static VPrincipal vp;
    private static VCliente vcli;

    private static char opcionCliente;
    private static char opcionAbogado;
    private static char opcionCaso;
    
    public static void main(String[] args) {
        
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

    }

    public static void confirmarCliente(String text) {

    }

    public static void altaCliente(String text, String text0, String text1, String text2, String text3) {

    }

    public static void modificarCliente(String text, String text0, String text1, String text2, String text3) {

    }

   
    

}
