package BD;

import java.sql.*;
import Clases.*;

public class TPersona {
    private Connection con;

    public TPersona(Connection con) {
        this.con = con;
    }
    public void insetar(Persona p){
        String insert="insert into personas values (?,?,?,?,?)";
        
    }    
}
