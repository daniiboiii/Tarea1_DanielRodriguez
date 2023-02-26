package bl;

import java.util.ArrayList;

public class usuarios {
    private String nombre;
    private String cedula;
    private String telefono;
    private String dirreccion;
    private boolean estado;
    private ArrayList<Integer> Usuarios;


    public usuarios(String nombre, String cedula, String telefono, String dirreccion, boolean estado, ArrayList<Integer> Usuarios) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.dirreccion = dirreccion;
        this.estado = estado;
        Usuarios = new ArrayList<>();
    }
    public usuarios () {

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "usuarios{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", dirreccion='" + dirreccion + '\'' +
                ", estado=" + estado +
                '}';
    }
}
