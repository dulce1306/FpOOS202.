import javax.swing.JOptionPane;

public class Administrativo extends Empleado {
    private String departamento;

    // Constructor
    public Administrativo(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    // Sobrescribir el método mostrarInfo para incluir el departamento
    @Override
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre + "\n" +
                        "ID: " + id + "\n" +
                        "Salario: $" + salario + "\n" +
                        "Departamento: " + departamento);
    }
}