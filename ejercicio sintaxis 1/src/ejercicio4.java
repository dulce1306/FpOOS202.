import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombreUsuario = sc.nextLine();
        int longitud = nombreUsuario.replace(" ", "").length();
        System.out.println(nombreUsuario.toUpperCase() + " tiene " + longitud + " letras.");
        sc.close();
    }
}
