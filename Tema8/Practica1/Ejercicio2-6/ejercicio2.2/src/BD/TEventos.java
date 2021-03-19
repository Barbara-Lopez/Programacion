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
        
        int n = ps.executeUpdate();
        
        
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
        
        int n = ps.executeUpdate();
        
    }
    public void modificarEvento(Evento e) throws SQLException, Exception{
        String update= "update evento set lugar = ?, fecha = ?,HoraInicio = ?, horaFin = ?, aforo = ?  where nombre = ?";
        PreparedStatement ps=con.prepareStatement(update);
        ps.setString(6, e.getNombre());
        ps.setString(1, e.getLugar());
        ps.setDate(2, convertirDate(e.getFecha()));
        ps.setTime(3,convertirTime(e.getHoraInicio()));
        ps.setTime(4, convertirTime(e.getHoraFin()));
        ps.setInt(5, e.getAforo());
        
        int n = ps.executeUpdate();
           if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
    public Evento buscar(String nombre) throws Exception{
        String insert="select * from evento where nombre=?;";
        PreparedStatement ps=con.prepareStatement(insert);
        ps.setString(1, nombre);
        
        ResultSet resultado  = ps.executeQuery();
        if(resultado.next()){
            e=new Evento();
            e.setNombre(resultado.getString("Nombre"));
            e.setLugar(resultado.getString("Lugar"));
            e.setFecha(resultado.getDate("Fecha").toLocalDate());
            e.setHoraInicio(resultado.getTime("HoraInicio").toLocalTime());
            e.setHoraFin(resultado.getTime("HoraFin").toLocalTime());
            e.setAforo(resultado.getInt("Aforo"));
            return e;
        }
        else 
            throw new Exception();
    } 


    
   
    
}
