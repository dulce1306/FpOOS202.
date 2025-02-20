
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear un mapa de cuentas simuladas
        Map<Integer, Cuenta> cuentas = new HashMap<>();

        // Agregar cuentas de ejemplo
        cuentas.put(1001, new Cuenta(1001, "Hayde Perez", 25, 5000));
        cuentas.put(1002, new Cuenta(1002, "Dulce Garcia", 30, 7000));
        cuentas.put(1003, new Cuenta(1002, "Antonio1 Garcia", 40, 10000));

        // Pedir número de cuenta al usuario
        int numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de cuenta:"));
        Cuenta cuenta = cuentas.get(numeroCuenta);

        if (cuenta != null) {
            boolean continuar = true;
            while (continuar) {
                String opcion = JOptionPane.showInputDialog(
                        "Seleccione una opción:\n" +
                                "1. Consultar saldo\n" +
                                "2. Ingresar efectivo\n" +
                                "3. Retirar efectivo\n" +
                                "4. Depositar a otra cuenta\n" +
                                "5. Salir");

                switch (opcion) {
                    case "1":
                        JOptionPane.showMessageDialog(null, "Saldo actual: $" + cuenta.consultarSaldo());
                        break;
                    case "2":
                        double deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese monto a depositar:"));
                        cuenta.ingresarEfectivo(deposito);
                        JOptionPane.showMessageDialog(null, "Depósito exitoso. Nuevo saldo: $" + cuenta.consultarSaldo());
                        break;
                    case "3":
                        double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese monto a retirar:"));
                        if (cuenta.retirarEfectivo(retiro)) {
                            JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: $" + cuenta.consultarSaldo());
                        }
                        break;
                    case "4":
                        int cuentaDestinoNum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de cuenta destino:"));
                        Cuenta destino = cuentas.get(cuentaDestinoNum);
                        if (destino != null) {
                            double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese monto a transferir:"));
                            if (cuenta.depositar(destino, monto)) {
                                JOptionPane.showMessageDialog(null, "Transferencia exitosa a " + cuentaDestinoNum +
                                        ". Nuevo saldo: $" + cuenta.consultarSaldo());
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Cuenta destino no encontrada.");
                        }
                        break;
                    case "5":
                        continuar = false;
                        JOptionPane.showMessageDialog(null, "Gracias por usar Caja Popular.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cuenta no encontrada.");
        }
    }
}
