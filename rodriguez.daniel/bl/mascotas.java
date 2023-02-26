package bl;

public class mascotas {
    private String nombre;
    private String nombreDuenno;
    private String Observaciones;

    public mascotas(String nombre, String nombreDuenno, String observaciones) {
        this.nombre = nombre;
        this.nombreDuenno = nombreDuenno;
        this.Observaciones = observaciones;
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

    @Override
    public String toString() {
        return "mascotas{" +
                "nombre='" + nombre + '\'' +
                ", nombreDuenno='" + nombreDuenno + '\'' +
                ", Observaciones='" + Observaciones + '\'' +
                '}';
    }
}
