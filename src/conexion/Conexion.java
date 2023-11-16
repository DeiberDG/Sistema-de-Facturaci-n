package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {
    public static Connection conectar(){
        
        try{
            
            Connection conex = DriverManager.getConnection("jdbc:mysql://localhost/bd_GoFacPOS", "root", "1234");
            return conex; // Aqui se hace la coneccion con la base de datos
            
        }catch (SQLException e){
            System.out.println("Error en la conexion local" + e);
        }
        return null;
    }
}
