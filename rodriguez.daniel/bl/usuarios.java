package bl;

import java.util.ArrayList;

public class usuarios {
    private String nombre;
    private int cedula;
    private String telefono;
    private String dirreccion;
    private String foto;
    private boolean estado;
    private String rol;

    public usuarios(String nombre, int cedula, String telefono, String dirreccion, String foto, boolean estado, String rol) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.dirreccion = dirreccion;
        this.foto = foto;
        this.estado = estado;
        this.rol = rol;
    }

    public usuarios () {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "usuarios{" +
                "nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                ", telefono='" + telefono + '\'' +
                ", dirreccion='" + dirreccion + '\'' +
                ", foto='" + foto + '\'' +
                ", estado=" + estado +
                ", rol='" + rol + '\'' +
                '}';
    }
}
