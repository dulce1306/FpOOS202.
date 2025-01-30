//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String passwordGuardada="1234567890";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu contraseña: ");
        String passwordUsuario = scanner.nextLine();

        if (passwordGuardada.equalsIgnoreCase(passwordUsuario))
        {
            System.out.println("La contraseña coincide");
        }else{

            System.out.println("la contraseña no coincide");
        }
        scanner.close();
    }

}