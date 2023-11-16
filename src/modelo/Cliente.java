package modelo;

/**
 *
 * @author keyle_dqx9pud
 */
public class Cliente {

    //Creacion atributos
    private int idCliente;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String correo;
    private int estado;

    //Creacion constructor 
    public Cliente() {
        this.idCliente = 0;
        this.nombre = "";
        this.apellido = "";
        this.cedula = "";
        this.direccion = "";
        this.ciudad = "";
        this.telefono = "";
        this.correo = "";
        this.estado = 0;
    }

    //Constructor sobrecargado  
    public Cliente(int idCliente, String nombre, String apellido, String cedula, String direccion, String ciudad, String telefono, String correo, int estado) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    //Creacion de los metodos Set y Get
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getcedula() {
        return cedula;
    }

    public void setcedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getCedula() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
