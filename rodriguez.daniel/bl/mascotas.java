package bl;

import java.util.ArrayList;

public class mascotas {
    private String nombre;
    private String nombreDuenno;
    private String Observaciones;
    private String Foto;
    private String dirreccion;
    private ArrayList<Integer> duenno;


    public mascotas(String nombre, String nombreDuenno, String observaciones, String foto, String Dirreccion, ArrayList<Integer> duenno) {
        this.nombre = nombre;
        this.nombreDuenno = nombreDuenno;
        this.Observaciones = observaciones;
        this.Foto = foto;
        this.dirreccion = Dirreccion;
        this.duenno = duenno;
    }
    public mascotas() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDuenno() {
        return nombreDuenno;
    }

    public void setNombreDuenno(String nombreDuenno) {
        this.nombreDuenno = nombreDuenno;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        this.Foto = foto;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public ArrayList<Integer> getDuenno() {
        return duenno;
    }

    public void setDuenno(ArrayList<Integer> duenno) {
        this.duenno = duenno;
    }

    @Override
    public String toString() {
        return "mascotas{" +
                "nombre='" + nombre + '\'' +
                ", nombreDuenno='" + nombreDuenno + '\'' +
                ", Observaciones='" + Observaciones + '\'' +
                ", Foto='" + Foto + '\'' +
                ", dirreccion='" + dirreccion + '\'' +
                ", duenno=" + duenno +
                '}';
    }
}
