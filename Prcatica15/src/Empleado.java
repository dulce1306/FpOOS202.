import javax.swing.JOptionPane;

public class Empleado {
    protected String nombre;
    protected int id;
    protected double salario;

    // Constructor
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    // Método para mostrar la información del empleado
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre + "\n" +
                        "ID: " + id + "\n" +
                        "Salario: $" + salario);
    }
}