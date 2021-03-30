package BD;

import Clases.Cliente;
import java.sql.*;
import java.util.ArrayList;

public class TCliente {
    
    private Connection con;
    private Cliente cli;
    private ArrayList<Cliente> listaCliente;
    
    public TCliente(Connection con) {
        this.con=con;
    }
    
    

    public void eliminar() throws SQLException {
        String delete="delete from cliente where dni=?;";
        PreparedStatement ps=con.prepareStatement(delete);
        ps.setString(1, cli.getDni());
        
        int n = ps.executeUpdate();
    }
    public Cliente confirmar(String dni) throws SQLException, Exception {
        String select="select * from cliente where dni=?;";
        PreparedStatement ps=con.prepareStatement(select);
        ps.setString(1, dni);
        
        ResultSet resultado=ps.executeQuery();
        if(resultado.next()){
            cli=new Cliente();
            cli.setDni(resultado.getString("dni"));
            cli.setNombre(resultado.getString("nombre"));
            cli.setApellido(resultado.getString("apellido"));
            cli.setTelefono(resultado.getInt("telefono"));
            cli.setCorreo(resultado.getString("correo"));
            return cli;
        }
        else
            throw new Exception();
        
    }

    public void alta(Cliente cli) throws SQLException {
        String insert="insert into cliente values(?,?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(insert);
        ps.setString(1, cli.getDni());
        ps.setString(2, cli.getNombre());
        ps.setString(3, cli.getApellido());
        ps.setInt(4, cli.getTelefono());
        ps.setString(5, cli.getCorreo());
        
        int n = ps.executeUpdate();

    }

    public void modificar(Cliente cli) throws SQLException {
        String insert="update cliente set nombre=?, apellido=?, telefono=?, correo=? where dni=?;";
        PreparedStatement ps=con.prepareStatement(insert);
        ps.setString(5, cli.getDni());
        ps.setString(1, cli.getNombre());
        ps.setString(2, cli.getApellido());
        ps.setInt(3, cli.getTelefono());
        ps.setString(4, cli.getCorreo());
        
        int n = ps.executeUpdate();
    }

    public void consultar(Cliente cliente) throws SQLException {
       
        String condicion="";
        
        if(cliente.getDni().isEmpty())
            condicion=condicion;
        else
            condicion="dni="+cliente.getDni();
        
        if(cliente.getNombre().isEmpty())
            condicion=condicion;
        else{
            if(condicion.isEmpty())
                condicion="nombre="+cliente.getNombre();
            else
                 condicion=",nombre="+cliente.getNombre();
        }
        
        if(cliente.getApellido().isEmpty())
            condicion=condicion;
        else{
            if(condicion.isEmpty())
                condicion="apellido="+cliente.getApellido();
            else
                 condicion=",apellido="+cliente.getApellido();
        }
        
        if(cliente.getTelefono()==0)
            condicion=condicion;
        else{
            if(condicion.isEmpty())
                condicion="telefono="+cliente.getTelefono();
            else
                 condicion=",telefono="+cliente.getTelefono();
        }
        
        if(cliente.getCorreo().isEmpty())
            condicion=condicion;
        else{
            if(condicion.isEmpty())
                condicion="correo="+cliente.getCorreo();
            else
                 condicion=",correo="+cliente.getCorreo();
        }
        
        String select="select * from cliente where "+ condicion;
        PreparedStatement ps=con.prepareStatement(select);
          
        ResultSet resultado=ps.executeQuery();
        while(resultado.next()){
            cli=new Cliente();
            cli.setDni(resultado.getString("dni"));
            cli.setNombre(resultado.getString("nombre"));
            cli.setApellido(resultado.getString("apellido"));
            cli.setTelefono(resultado.getInt("telefono"));
            cli.setCorreo(resultado.getString("correo"));
            listaCliente.add(cli);
        }
        
        
        
        
    }
}
