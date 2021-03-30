package BD;

import Clases.*;
import java.sql.*;


public class TCasoAbogado {

    private Connection con;
    
    public TCasoAbogado(Connection con) {
        this.con=con;
    }

    public void insertar(Caso c, Abogado a) throws Exception {
        String insert="insert into caso_abogado values(?,?);";
        PreparedStatement ps=con.prepareStatement(insert);
        ps.setString(1, c.getId());
        ps.setString(2, a.getDni());
        
        int i=ps.executeUpdate();
        
    }
    
}
