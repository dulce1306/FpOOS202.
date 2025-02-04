/* Programa con funciones y un menu que nos permita convertir temperaturas a
 decision del usuario: (fahrenheit -32) * 5/9. | G Fahrenheit = (centigrados * 9/5) + 32 |
 G Kelvin = centigrados + 273.15
 */

    import java.util.Scanner;

public class Main {

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nConversor de Temperaturas");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Celsius a Kelvin");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introdusca la temperatura en Celsius: ");
                    double celsius = scanner.nextDouble();
                    System.out.printf("%.2f°C = %.2f°F\n", celsius, celsiusAFahrenheit(celsius));
                    break;
                case 2:
                    System.out.print("Introdusca la temperatura en Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    System.out.printf("%.2f°F = %.2f°C\n", fahrenheit, fahrenheitACelsius(fahrenheit));
                    break;
                case 3:
                    System.out.print("Introdusca  la temperatura en Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.printf("%.2f°C = %.2fK\n", celsius, celsiusAKelvin(celsius));
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

