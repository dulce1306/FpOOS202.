import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Creamos el JFrame del menú, pero no lo mostramos hasta el login exitoso
        JFrame frame = new JFrame("Merks and Spen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        // Creamos el array de opciones del menú
        String[] opciones = {
                "Usuario", "Administrar artículos",
                "Administrar usuarios", "Solicitar artículos", "Cerrar sesión"
        };

        // Creamos el contenedor de botones para el menú
        JPanel panelMenu = new JPanel();
        panelMenu.setLayout(null);
        panelMenu.setBounds(0, 0, 400, 300); // Necesario para colocar los botones correctamente
        int y = 30;
        for (String opcion : opciones) {
            JButton boton = new JButton(opcion);
            boton.setBounds(100, y, 200, 40);
            panelMenu.add(boton);
            y += 45;

            boton.addActionListener(e -> {
                if (opcion.equals("Usuario")) {
                    // Acción para Usuario (si fuera necesario)
                } else if (opcion.equals("Administrar artículos")) {
                    // Acción para Administrar artículos (si fuera necesario)
                } else if (opcion.equals("Administrar usuarios")) {
                    frame.setVisible(false);
                    AdministrarUsuario.mostrarAdministrarUsuario();
                } else if (opcion.equals("Solicitar artículos")) {
                    // Acción para Solicitar artículos (si fuera necesario)
                } else if (opcion.equals("Cerrar sesión")) {
                    frame.dispose(); // Cierra la aplicación
                } else {
                    JOptionPane.showMessageDialog(frame, "Seleccionaste: " + opcion);
                }
            });
        }

        // Añadir el panel de menú al frame
        frame.add(panelMenu);

        // Primero, mostramos el login
        if (mostrarLogin(frame)) {
            panelMenu.setVisible(true); // Mostramos el menú al iniciar sesión con éxito
        }
    }

    public static boolean mostrarLogin(JFrame frame) {
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
            String usuarioValido = "administrador@gmail.com";
            String contrasenaValida = "123456";

            if (correo.equals(usuarioValido) && contrasena.equals(contrasenaValida)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
                frame.setVisible(true); // Mostramos el frame principal
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
