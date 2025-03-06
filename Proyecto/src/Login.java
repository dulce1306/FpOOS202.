import javax.swing.*;
import java.awt.*;

public class Login {
    public static void mostrarLogin(JFrame mainFrame) {
        JFrame frame = new JFrame("Login - Merks and Spen");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        // 🔹 Colores personalizados
        Color fondoVerde = new Color(0, 102, 51); // Verde oscuro
        Color textoBlanco = Color.WHITE;
        Color botonColor = new Color(0, 51, 25); // Verde más oscuro

        // 🔹 Panel de fondo
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 500, 350);
        panel.setBackground(fondoVerde);
        panel.setLayout(null);
        frame.add(panel);

        // 🔹 Título LOGIN
        JLabel lblTitulo = new JLabel("LOGIN", SwingConstants.CENTER);
        lblTitulo.setBounds(0, 20, 500, 30);
        lblTitulo.setForeground(textoBlanco);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(lblTitulo);

        // 🔹 Campo de correo
        JLabel lblCorreo = new JLabel("CORREO");
        lblCorreo.setBounds(100, 70, 300, 20);
        lblCorreo.setForeground(textoBlanco);
        lblCorreo.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(lblCorreo);

        JTextField txtCorreo = new JTextField();
        txtCorreo.setBounds(100, 95, 300, 30);
        txtCorreo.setBackground(botonColor);
        txtCorreo.setForeground(textoBlanco);
        panel.add(txtCorreo);

        // 🔹 Campo de contraseña
        JLabel lblContrasena = new JLabel("CONTRASEÑA");
        lblContrasena.setBounds(100, 135, 300, 20);
        lblContrasena.setForeground(textoBlanco);
        lblContrasena.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(lblContrasena);

        JPasswordField txtContrasena = new JPasswordField();
        txtContrasena.setBounds(100, 160, 300, 30);
        txtContrasena.setBackground(botonColor);
        txtContrasena.setForeground(textoBlanco);
        panel.add(txtContrasena);

        // 🔹 Botón LOGIN
        JButton btnLogin = new JButton("LOGIN");
        btnLogin.setBounds(200, 210, 100, 30);
        btnLogin.setBackground(botonColor);
        btnLogin.setForeground(textoBlanco);
        btnLogin.setFocusPainted(false);
        panel.add(btnLogin);

        // 🔹 Botón REGISTRAR (en la esquina superior derecha)
        JButton btnRegistrar = new JButton("REGISTRAR");
        btnRegistrar.setBounds(370, 20, 100, 20);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setForeground(textoBlanco);
        btnRegistrar.setFont(new Font("Arial", Font.BOLD, 12));
        panel.add(btnRegistrar);

        // 🔹 Botón Olvidé mi contraseña
        JButton btnOlvidar = new JButton("OLVIDÉ MI CONTRASEÑA");
        btnOlvidar.setBounds(170, 250, 180, 20);
        btnOlvidar.setBorderPainted(false);
        btnOlvidar.setContentAreaFilled(false);
        btnOlvidar.setForeground(textoBlanco);
        btnOlvidar.setFont(new Font("Arial", Font.PLAIN, 12));
        panel.add(btnOlvidar);

        // 🔹 Acción del botón LOGIN
        btnLogin.addActionListener(e -> {
            String correo = txtCorreo.getText();
            String contrasena = new String(txtContrasena.getPassword());

            // Simulación de credenciales correctas
            String usuarioValido = "admin@example.com";
            String contrasenaValida = "123456";

            if (correo.equals(usuarioValido) && contrasena.equals(contrasenaValida)) {
                JOptionPane.showMessageDialog(frame, "Inicio de sesión exitoso.");
                frame.dispose(); // Cierra la ventana de login
                mainFrame.setVisible(true); // Vuelve al menú principal
            } else {
                JOptionPane.showMessageDialog(frame, "Correo o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // 🔹 Acción del botón REGISTRAR
        btnRegistrar.addActionListener(e -> {
            frame.dispose();
            Usuario.mostrarRegistro();
        });

        frame.setVisible(true);
    }
}

