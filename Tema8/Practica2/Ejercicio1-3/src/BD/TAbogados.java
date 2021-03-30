package BD;

import Clases.Abogado;
import java.sql.*;

public class TAbogados {
    
    private Connection con;
    private Abogado a;

    public TAbogados(Connection con) {
        this.con=con;
    }

    public void eliminar() {
        

    }

    public Abogado confirmar(String dni) throws Exception {
        String select="select * from abogado where dni=?;";
        PreparedStatement ps=con.prepareStatement(select);
        ps.setString(1, dni);
        
        ResultSet resultado=ps.executeQuery();
         
        if(resultado.next()){
            a=new Abogado();
            a.setDni(resultado.getString("dni"));
            a.setNombre(resultado.getString("nombre"));
            a.setApellido(resultado.getString("apellido"));
            a.setDireccion(resultado.getString("direcion"));
            return a;
        }
        else
            throw new Exception();

    }

    public void alta(Abogado a) throws SQLException {
        String insert="insert into abogado values(?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(insert);
        ps.setString(1, a.getDni());
        ps.setString(2, a.getNombre());
        ps.setString(3, a.getApellido());
        ps.setString(4, a.getDireccion());
        
        int i=ps.executeUpdate();
    }

    public void modificar(Abogado a) throws SQLException {
        String update="update abogados set nombre=?, apellido=?, direccion=? where dni=?;";
        PreparedStatement ps=con.prepareStatement(update);
        ps.setString(4, a.getDni());
        ps.setString(1, a.getNombre());
        ps.setString(2, a.getApellido());
        ps.setString(3, a.getDireccion());
        
        int i=ps.executeUpdate();
        
        
    }
    
}
