package bl;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class almacenamiento {

    public static ArrayList<usuarios> listaUsuarios = new ArrayList<>();
    public static ArrayList<clinica> listaClinica = new ArrayList<>();
    public static ArrayList<mascotas> listaMascotas = new ArrayList<>();



    private usuarios usuariosActual;

    public almacenamiento() {
    }
    public usuarios getUsuariosActual() {
        return usuariosActual;
    }

    public void setUsuariosActual(usuarios usuariosActual) {
        this.usuariosActual = usuariosActual;
    }
}
