import javax.swing.*;
import java.awt.*;

public class Usuario {
    public static void mostrarUsuario(JFrame mainFrame) {
        JFrame frame = new JFrame("Perfil - Merks and Spen");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        // 🔹 Colores personalizados
        Color fondoVerde = new Color(0, 102, 51); // Verde oscuro
        Color textoBlanco = Color.WHITE;
        Color botonColor = new Color(0, 51, 25); // Verde más oscuro
        Color bordeVerdeClaro = new Color(0, 150, 100); // Verde más claro

        // 🔹 Panel de fondo
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 700, 400);
        panel.setBackground(fondoVerde);
        panel.setLayout(null);
        frame.add(panel);

        // 🔹 Botón de regresar
        JButton btnRegresar = new JButton("←");
        btnRegresar.setBounds(10, 10, 50, 30);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setForeground(textoBlanco);
        btnRegresar.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(btnRegresar);

        // 🔹 Imagen de usuario (simulación con un JLabel)
        JLabel imgUsuario = new JLabel();
        imgUsuario.setBounds(50, 70, 150, 150);
        imgUsuario.setOpaque(true);
        imgUsuario.setBackground(Color.WHITE);
        imgUsuario.setBorder(BorderFactory.createLineBorder(bordeVerdeClaro, 3));
        panel.add(imgUsuario);

        // 🔹 Nombre del empleado
        JLabel lblNombre = new JLabel("Nombre Empleado");
        lblNombre.setBounds(250, 80, 400, 30);
        lblNombre.setForeground(textoBlanco);
        lblNombre.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(lblNombre);

        // 🔹 Puesto del empleado
        JTextField txtPuesto = new JTextField("Puesto Empleado");
        txtPuesto.setBounds(250, 120, 300, 30);
        txtPuesto.setBackground(Color.WHITE);
        txtPuesto.setForeground(Color.BLACK);
        txtPuesto.setHorizontalAlignment(JTextField.CENTER);
        panel.add(txtPuesto);

        // 🔹 Botón de CORREO
        JButton btnCorreo = new JButton("CORREO");
        btnCorreo.setBounds(250, 170, 150, 30);
        btnCorreo.setBackground(botonColor);
        btnCorreo.setForeground(textoBlanco);
        panel.add(btnCorreo);

        // 🔹 Botón de CONTACTO
        JButton btnContacto = new JButton("CONTACTO");
        btnContacto.setBounds(250, 210, 150, 30);
        btnContacto.setBackground(botonColor);
        btnContacto.setForeground(textoBlanco);
        panel.add(btnContacto);

        // 🔹 Botón de ESTADO
        JButton btnEstado = new JButton("ESTADO");
        btnEstado.setBounds(250, 250, 150, 30);
        btnEstado.setBackground(botonColor);
        btnEstado.setForeground(textoBlanco);
        panel.add(btnEstado);

        // 🔹 Botón de CAMBIAR CONTRASEÑA
        JButton btnCambiarPass = new JButton("CAMBIAR PASS");
        btnCambiarPass.setBounds(250, 290, 150, 30);
        btnCambiarPass.setBackground(botonColor);
        btnCambiarPass.setForeground(textoBlanco);
        panel.add(btnCambiarPass);

        // 🔹 Acción del botón REGRESAR
        btnRegresar.addActionListener(e -> {
            frame.dispose();
            mainFrame.setVisible(true);
        });

        frame.setVisible(true);
    }
}



