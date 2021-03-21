package BD;

import java.sql.*;
import Clases.*;

public class TEmpresa {
    private Connection con;

    public TEmpresa(Connection con) {
        this.con = con;
    }
    
    public void insetar(Empresa emp){
        String insert="insert into personas values (?,?,?,?,?)";
        
    }
}
