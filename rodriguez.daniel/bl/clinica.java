package bl;

public class clinica {
    private String info;
    private String nombre;
    private String dirreccion;

    public clinica(String info, String nombre, String dirreccion) {
        this.info = info;
        this.nombre = nombre;
        this.dirreccion = dirreccion;
    }
    public clinica () {

    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    @Override
    public String toString() {
        return "clinica{" +
                "info='" + info + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dirreccion='" + dirreccion + '\'' +
                '}';
    }
}
