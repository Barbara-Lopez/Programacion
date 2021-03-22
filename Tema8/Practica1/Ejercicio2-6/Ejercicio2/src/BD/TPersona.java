package BD;

import java.sql.*;
import Clases.*;

public class TPersona {
    private Connection con;

    public TPersona(Connection con) {
        this.con = con;
    }
    public void insetar(Persona p) throws SQLException{
        String insert="insert into personas values (?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(insert);
        ps.setString(1, p.getDni());
        ps.setString(2, p.getNombre());
        ps.setString(3, p.getApellido());
        ps.setInt(4, p.getTelefono());
        ps.setInt(5, p.getNif().getNif());        
        
        int i=ps.executeUpdate();
    }    
}
