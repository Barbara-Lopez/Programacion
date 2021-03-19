package BD;

import Clases.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class TEventos {
    private Connection con;
    private Evento e;

    public TEventos(Connection con) {
        this.con = con;
    }
    
    public void insertarEvento(Evento e) throws SQLException{
        String insert="Insert into evento values(?,?,?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(insert);
        ps.setString(1, e.getNombre());
        ps.setString(2, e.getLugar());
        ps.setDate(3, convertirDate(e.getFecha()));
        ps.setTime(4,convertirTime(e.getHoraInicio()));
        ps.setTime(5, convertirTime(e.getHoraFin()));
        ps.setInt(6, e.getAforo());
        
        int n = (int) ps.executeLargeUpdate();
        
        
    } 
    public static java.sql.Date convertirDate(LocalDate fecha){
        return java.sql.Date.valueOf(fecha);
    }
    public static java.sql.Time convertirTime(LocalTime hora){
        return java.sql.Time.valueOf(hora);
    }
    
    public void eliminarEvento() throws SQLException{
        String delete="delete from evento where nombre=?;";
        PreparedStatement ps=con.prepareStatement(delete);
        ps.setString(1, e.getNombre());
        int n = (int) ps.executeLargeUpdate();
        
    }
    public void modificarEvento() throws SQLException, Exception{
        String update= "update evento set lugar = ?, fecha = ?,horaInicio = ?, horaFin = ?, aforo = ?  where nombre = ?";
        PreparedStatement ps=con.prepareStatement(update);
        ps.setString(1, e.getNombre());
        ps.setString(2, e.getLugar());
        ps.setDate(3, convertirDate(e.getFecha()));
        ps.setTime(4,convertirTime(e.getHoraInicio()));
        ps.setTime(5, convertirTime(e.getHoraFin()));
        ps.setInt(6, e.getAforo());
        
        int n = (int) ps.executeLargeUpdate();
           if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
    public Evento buscar(String nombre) throws SQLException, Exception{
        String insert="select * from evento where nombre=?;";
        PreparedStatement ps=con.prepareStatement(insert);
        ps.setString(1, nombre);
        
        ResultSet resultado  = ps.executeQuery();
        if(resultado.next()){
            e.setNombre(resultado.getString("nombre"));
            e.setLugar(resultado.getString("lugar"));
            e.setFecha(resultado.getDate("fecha").toLocalDate());
            e.setHoraInicio(resultado.getTime("horaInicio").toLocalTime());
            e.setHoraFin(resultado.getTime("horaFin").toLocalTime());
            return e;
        }
        else 
            throw new Exception();
    } 


    
   
    
}
