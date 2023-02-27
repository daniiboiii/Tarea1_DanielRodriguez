package UI;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    public static void main(String[] args) throws IOException {
        log_in();
        int opcion = -1;
        do{
            mostrarMenu();
            opcion = seleccionarOpcion();
            procesarOpcion(opcion);
        } while (opcion !=0);
    }
    static int seleccionarOpcion() throws IOException{
        out.println("Digite la opción que desea");
        return Integer.parseInt(in.readLine());
    }
    static void mostrarMenu(){
        out.println("MENÚ PRINCIPAL");
        out.println("1.Listar padecimientos");
        out.println("2.Registrar Usuarios.");
        out.println("3.Listar Mascotas.");
        out.println("4.Modificar citas");
        out.println("4.Modificar reservas");
        out.println("0.Log out");
    }
    public static void procesarOpcion(int pOpcion) {
        switch (pOpcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                out.println("Gracias por usar el programa");
            default:
                out.println("Opción inválida");
        }
    }
    public static void log_in() {
        String username = "123";
        String password = "123";
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario:");
        String enteredUsername = input.nextLine();
        System.out.println("Ingrese contrasenna:");
        String enteredPassword = input.nextLine();
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Log in exitoso");
        } else {
            System.out.println("Login failed. Please try again.");
            System.exit(0);
        }
    }
}