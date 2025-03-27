/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
 import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.SQLException;
 
 
public class Usercrud {
   
    private Connection conexion;
    
    public Usercrud (){
    
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean crearusuario( String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String contrasena){
      
        String sqlInsert = "INSERT INTO Usuarios (nombre,apellidoPaterno,apellidoMaterno, correo,contrasena) VALUES(?,?,?,?,?)";
        
        try{
           PreparedStatement ps = conexion.prepareStatement(sqlInsert);
           ps.setString(1,nombre);
           ps.setString(2, apellidoPaterno);     
           ps.setString(3, apellidoMaterno);
           ps.setString(4,correo);
           ps.setString(5,contrasena);
           return ps.executeUpdate() > 0;
        }
 /* el catch es para que si hay algun error el cache el error y te arrogue cual es el problema que es el manejo de la esepciones*/   
catch(SQLException e){
    System.out.println("Error al intentar insertar: "+ e.getMessage());
    return false;
    
}
}
}

