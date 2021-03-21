package BD;

import Clases.*;
import java.sql.*;

public class TAsistencia {
    private Connection con;

    public TAsistencia(Connection con) {
        this.con = con;
    }
    
    public void insetar(Persona p, Empresa emp){
        String insert="insert into aforopersonas values (?,?)";
        
    } 
}
