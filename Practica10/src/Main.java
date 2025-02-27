import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int longitud = 8; // Valor por defecto

        try {
            String input = JOptionPane.showInputDialog("Ingrese la longitud de la contraseña (mínimo 4, por defecto 8):", "8");
            if (input != null) { // Verifica que el usuario no haya cancelado
                int valorIngresado = Integer.parseInt(input);
                if (valorIngresado >= 4) { // Verifica que la longitud sea válida
                    longitud = valorIngresado;
                } else {
                    JOptionPane.showMessageDialog(null, "La longitud debe ser al menos 4 caracteres. Se usará el valor por defecto (8).");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Se usará la longitud por defecto (8).");
        }

        int incluirMayusculasOption = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?", "Opciones de Contraseña", JOptionPane.YES_NO_OPTION);
        boolean incluirMayusculas = (incluirMayusculasOption == JOptionPane.YES_OPTION);

        int incluirEspecialesOption = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Opciones de Contraseña", JOptionPane.YES_NO_OPTION);
        boolean incluirEspeciales = (incluirEspecialesOption == JOptionPane.YES_OPTION);

        // Crear una instancia de GeneradorPassword con los parámetros del usuario
        generadorPassword generador = new generadorPassword(longitud, incluirMayusculas, incluirEspeciales);

        // Generar la contraseña
        String password = generador.generarPassword();
        JOptionPane.showMessageDialog(null, "Contraseña generada: " + password);

        // Comprobar la fortaleza de la contraseña
        String fortaleza = generador.comprobarFortaleza(password);
        JOptionPane.showMessageDialog(null, "Fortaleza de la contraseña: " + fortaleza);
    }
}


