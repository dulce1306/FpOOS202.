import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = null;
        Conductor conductor = null;
        Envio envio = null;
        Entrega entrega = null;

        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n" +
                            "1. Crear Vehículo\n" +
                            "2. Crear Conductor\n" +
                            "3. Asignar Conductor a Vehículo\n" +
                            "4. Crear Envío\n" +
                            "5. Registrar Entrega\n" +
                            "6. Actualizar Estado de Entrega\n" +
                            "7. Salir");

            switch (opcion) {
                case "1":
                    String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    double capacidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga:"));
                    vehiculo = new Vehiculo(placa, modelo, capacidad,conductor);
                    JOptionPane.showMessageDialog(null, "Vehículo creado con éxito.");
                    break;

                case "2":
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                    String identificacion = JOptionPane.showInputDialog("Ingrese la identificación:");
                    String licencia = JOptionPane.showInputDialog("Ingrese el número de licencia:");
                    conductor = new Conductor(nombre, identificacion, licencia);
                    JOptionPane.showMessageDialog(null, "Conductor creado con éxito.");
                    break;

                case "3":
                    if (vehiculo != null && conductor != null) {
                        vehiculo.asignarConductor(conductor);
                        JOptionPane.showMessageDialog(null, "Conductor asignado al vehículo.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe crear un vehículo y un conductor primero.");
                    }
                    break;

                case "4":
                    envio = Envio.crearEnvio();
                    JOptionPane.showMessageDialog(null, "Envío registrado con éxito.");
                    break;

                case "5":
                    if (envio != null) {
                        String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía:");
                        entrega = new Entrega(numeroGuia, entrega.getEstado());
                        JOptionPane.showMessageDialog(null, "Entrega registrada con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe registrar un envío antes.");
                    }
                    break;

                case "6":
                    if (entrega != null) {
                        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito / Entregado):");
                        entrega.actualizarEstado(nuevoEstado);
                        JOptionPane.showMessageDialog(null, "Estado actualizado a: " + entrega.getEstado());
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe registrar una entrega antes.");
                    }
                    break;

                case "7":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        }
    }
}
