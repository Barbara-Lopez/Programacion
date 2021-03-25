package BD;

import java.sql.*;
import javax.swing.JOptionPane;

public class BaseDatos {
    private Connection con;

    public BaseDatos() {
    }
    
    public void conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String bd="bd3";
            String url="jbdc:mysql://localhost:3007/"+bd;
            String login="root";
            String passwd="usbw";
            con=DriverManager.getConnection(url, login, passwd);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }  
    }
    public void desconectar(){
        
    
    }
    
}
