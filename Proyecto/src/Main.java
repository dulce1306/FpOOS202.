import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Merks and Spen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        String[] opciones = {
                "Usuario", "Inventario", "Administrar artículos",
                "Administrar usuarios", "Solicitar artículos", "Cerrar sesión"
        };

        int y = 30;
        for (String opcion : opciones) {
            JButton boton = new JButton(opcion);
            boton.setBounds(100, y, 200, 40);
            frame.add(boton);
            y += 45;

            boton.addActionListener(e -> {
                if (opcion.equals("Usuario")) {
                    mostrarOpcionesUsuario(frame); // muestra opciones de usuario
                } else if (opcion.equals("Cerrar sesión")) {
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(frame, "Seleccionaste: " + opcion);
                }
            });
        }

        frame.setVisible(true);
    }
//  metodo para mostrar opciones de usuario (Login o Registro)

    private static void mostrarOpcionesUsuario(JFrame mainFrame) {
        String[] opciones = {"Iniciar Sesión", "Registrarse", "Cancelar"};
        int seleccion = JOptionPane.showOptionDialog(
                mainFrame,
                "¿Qué deseas hacer?",
                "Opciones de Usuario",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (seleccion == 0) {
            Usuario.mostrarLogin(mainFrame); // Este apartado abre la ventana de Login
        } else if (seleccion == 1) {
            Usuario.mostrarRegistro(); //   Este apartado abre la ventana de Registro
        }
    }
}

