
import javax.swing.*;

public void main (String[] args) {

    String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
    String apellidoPaterno = JOptionPane.showInputDialog("Ingrese su apellido paterno:");
    String apellidoMaterno = JOptionPane.showInputDialog("Ingrese su apellido materno:");
    int anioNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento:"));
    String carrera = JOptionPane.showInputDialog("Ingrese su carrera:");


    Matricula estudiante = new Matricula(nombre, apellidoPaterno, apellidoMaterno, anioNacimiento, carrera);


    JOptionPane.showMessageDialog(null, "Tu matrícula generada es: " + estudiante.GenerarMatricula());
}





