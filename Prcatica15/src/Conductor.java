import javax.swing.JOptionPane;

public class Conductor extends Empleado {
    private String licencia;

    // Constructor
    public Conductor(String nombre, int id, double salario, String licencia) {
        super(nombre, id, salario);
        this.licencia = licencia;
    }

    // Sobrescribir el método mostrarInfo para incluir la licencia
    @Override
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre + "\n" +
                        "ID: " + id + "\n" +
                        "Salario: $" + salario + "\n" +
                        "Licencia: " + licencia);
    }
}