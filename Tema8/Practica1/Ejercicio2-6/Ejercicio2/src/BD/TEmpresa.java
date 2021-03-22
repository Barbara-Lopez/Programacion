package BD;

import java.sql.*;
import Clases.*;

public class TEmpresa {
    private Connection con;

    public TEmpresa(Connection con) {
        this.con = con;
    }
    
    public void insetar(Empresa emp) throws SQLException{
        String insert="insert into personas values (?,?)";
        PreparedStatement ps=con.prepareStatement(insert);
        ps.setInt(1, emp.getNif());
        ps.setString(2, emp.getNombre());
        
        int i=ps.executeUpdate();
    }
}
