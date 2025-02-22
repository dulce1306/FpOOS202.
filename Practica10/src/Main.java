import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // Solicitar al usuario los parámetros para la generación de la
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("ingrese la longitud de la contraseña (por defecto 8):","8"));
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

