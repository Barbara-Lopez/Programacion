package BD;

import java.sql.*;


public class BaseDatos {
    private Connection con;

    public BaseDatos() {
    }
    
    public void conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String bd="bd3";
            String url="jdbc:mysql://localhost:3307/"+bd;
            String login="root";
            String passwd="usbw";
            con=DriverManager.getConnection(url, login, passwd);
        }
        catch(Exception e){
               System.out.println("Problemas con la conexion");;
        }  
    }
    public void desconectar(){
         try{
            con.close();
        
        }
        catch(Exception e){
               System.out.println("Problemas cerrando la conexión");
        
        }        
    }
    public Connection getCon(){
        return con;
    }
    
    
}
