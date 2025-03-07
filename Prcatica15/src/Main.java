import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            String[] opciones = {"Agregar Empleado", "Listar Empleados", "Salir"};
            int eleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Gestión de Empleados",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (eleccion) {
                case 0:
                    String tipoEmpleado = JOptionPane.showInputDialog("Elige el tipo de empleado (Conductor/Administrativo):");
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("ID:"));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario:"));

                    if (tipoEmpleado.equalsIgnoreCase("Conductor")) {
                        String licencia = JOptionPane.showInputDialog("Licencia:");
                        empleados.add(new Conductor(nombre, id, salario, licencia));
                    } else if (tipoEmpleado.equalsIgnoreCase("Administrativo")) {
                        String departamento = JOptionPane.showInputDialog("Departamento:");
                        empleados.add(new Administrativo(nombre, id, salario, departamento));
                    } else {
                        JOptionPane.showMessageDialog(null, "Tipo de empleado no válido.");
                    }
                    break;

                case 1:
                    StringBuilder listaEmpleados = new StringBuilder();
                    for (Empleado emp : empleados) {
                        emp.mostrarInfo();
                    }
                    break;

                case 2:
                    continuar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intentalo de nuevo .");
                    break;
            }
        }
    }
}