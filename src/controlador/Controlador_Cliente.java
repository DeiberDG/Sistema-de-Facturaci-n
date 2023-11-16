package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import modelo.Cliente;

public class Controlador_Cliente {

    //Creacion del constructor
    public Controlador_Cliente() {

    }

    /**
     *
     * @param objeto
     * @return
     */

    //Creacion del metodo guardar clientes
    public boolean guardar(Cliente objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_cliente values (?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//Id  
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getCedula());
            consulta.setString(5, objeto.getDireccion());
            consulta.setString(6, objeto.getCiudad());
            consulta.setString(7, objeto.getTelefono());
            consulta.setString(8, objeto.getCorreo());
            consulta.setInt(9, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cliente: " + e);
        }
        return respuesta;
    }

    //Metodo para consultar si existen los clientes
    public boolean existeCliente(String cedula) {
        boolean respuesta = false;
        String sql = "select cedula from tb_cliente where cedula = '" + cedula + "'; + categoria";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar cliente: " + e);
        }
        return respuesta;
    }
}
