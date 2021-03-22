package BD;

import Clases.*;
import java.sql.*;

public class TAsistencia {
    private Connection con;

    public TAsistencia(Connection con) {
        this.con = con;
    }

    public void insetar(Persona p, Evento e) throws SQLException {
        String insert="insert into aforopersonas values (?,?)";
        PreparedStatement ps= con.prepareStatement(insert);
        ps.setString(1, p.getDni());
        ps.setString(2, e.getNombre());
                
        int i=ps.executeUpdate();
    }
}
