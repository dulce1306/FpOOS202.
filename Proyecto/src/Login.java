import javax.swing.*;

public class Login {
    public static boolean mostrarLogin() {
        JTextField txtCorreo = new JTextField();
        JPasswordField txtContrasena = new JPasswordField();

        Object[] campos = {
                "Correo:", txtCorreo,
                "Contraseña:", txtContrasena
        };

        while (true) {
            // Opciones personalizadas en el cuadro de diálogo
            Object[] opciones = {"Login", "Cancelar"};
            int opcion = JOptionPane.showOptionDialog(
                    null,
                    campos,
                    "Login - Merks and Spen",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (opcion == 1 || opcion == JOptionPane.CLOSED_OPTION) {
                return false; // Si el usuario cancela, cerrar la ventana
            }

            String correo = txtCorreo.getText().trim();
            String contrasena = new String(txtContrasena.getPassword());

            // Simulación de usuario válido
            String usuarioValido = "admin@gmail.com";
            String contrasenaValida = "1234";

            if (correo.equals(usuarioValido) && contrasena.equals(contrasenaValida)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}



