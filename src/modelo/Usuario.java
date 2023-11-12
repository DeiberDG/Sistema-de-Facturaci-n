package modelo;

public class Usuario {

    // Creación de atributos
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String telefono;
    private String rol;
    private int estado;

    
    // Creacion del constructor
    public Usuario() {
        this.idUsuario = 0;
        this.nombre = "";
        this.apellido = "";
        this.usuario = "";
        this.password = "";
        this.telefono = "";
        this.rol = "";
        this.estado = 0;
    }

    
    // Creacion de los metodos Set y Get idUsuario
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    // Creacion de los metodos Set y Get nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Creacion de los metodos Set y Get apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Creacion de los metodos Set y Get usuario
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Creacion de los metodos Set y Get contraseña
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Creacion de los metodos Set y Get telefono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Creacion de los metodos Set y Get rol
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Creacion de los metodos Set y Get estado
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
