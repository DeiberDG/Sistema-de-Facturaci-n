package controlador;

import java.sql.Connection;
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Usuario; // Se hace la importacion de la clase Usuario

public class Controlador_Usuario {

    private String Res;

    
    // Creacion del constructor
    public Controlador_Usuario(){
        this.Res = "";
    }
    
    
    // Creacion de metodo para iniciar sesion
    public boolean LoginUsuario (Usuario usuario) {

        boolean respuesta = false;

        // Se declara esta variable de tipo Connection para poder intentar hacer una consulta en la base de datos
        Connection conex = Conexion.conectar();

        // Esta es la consulta SQL
        String sql = "select usuario, password from tb_usuario where usuario = '" + usuario.getUsuario() + "' and password = '" + usuario.getPassword() + "' ";
        Statement str;
        
        try {

            str = conex.createStatement();
            ResultSet resp = str.executeQuery(sql);

            while (resp.next()) {
                respuesta = true;
            }
            
            if (!respuesta){
                Res = "Usuario y/o contraseña incorrecta";
            }
        } catch (SQLException ex) {
            Res = "Usuario y/o contraseña incorrecta";
        }
        return respuesta;
    }

    // Creación de un metodo que retorne si los datos ingresados son correctos
    public String getRes() {
        return Res;
    }
}
