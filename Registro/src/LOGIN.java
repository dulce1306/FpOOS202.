/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LOGIN extends JFrame {
    private JTextField txtCorreo;
    private JPasswordField txtContrasena;
    private JButton btnLogin, btnRegistro;
    
    public LOGIN() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setBounds(20, 20, 80, 25);
        add(lblCorreo);
        
        txtCorreo = new JTextField();
        txtCorreo.setBounds(100, 20, 150, 25);
        add(txtCorreo);
        
        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(20, 60, 80, 25);
        add(lblContrasena);
        
        txtContrasena = new JPasswordField();
        txtContrasena.setBounds(100, 60, 150, 25);
        add(txtContrasena);
        
        btnLogin = new JButton("Iniciar Sesión");
        btnLogin.setBounds(20, 100, 150, 25);
        add(btnLogin);
        
        btnRegistro = new JButton("Registrarse");
        btnRegistro.setBounds(180, 100, 100, 25);
        add(btnRegistro);
        
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                validarUsuario();
            }
        });
        
        btnRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new fromRegistro().setVisible(true);
                dispose();
            }
        });
    }
    
    private void validarUsuario() {
        String correo = txtCorreo.getText();
        String contrasena = new String(txtContrasena.getPassword());
        
        String sql = "SELECT * FROM Usuarios WHERE correo = ? AND contrasena = ?";
        
        try (Connection conexion= ConexionMySQL.conectar();
             PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            
            pstmt.setString(1, correo);
            pstmt.setString(2, contrasena);
            
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
                // Aquí podrías abrir otra ventana
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LOGIN().setVisible(true);
        });
    }
}