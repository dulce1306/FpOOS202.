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
 import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
// resultset contiene el resultado de una consulta  
public class UserCRUD {
   
    private Connection conexion;
    
    public UserCRUD (){
    
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean crearusuario( String nom, String corr, String contra){
      
        String sqlInsert = "INSERT INTO Usuarios (nombre,correo,contraseña) VALUE(?,?,?)";
        
        try{
           PreparedStatement ps = conexion.prepareStatement(sqlInsert);
           ps.setString(1,nom);
           ps.setString(2,corr);
           ps.setString(3,contra);
           return ps.executeUpdate() > 0;
        }
 /* el catch es para que si hay algun error el cache el error y te arrogue cual es el problema que es el manejo de la esepciones*/   
catch(SQLException e){
    System.out.println("Error al intentar insertar: "+ e.getMessage());
    return false;
    
}
}//fin del insert 
    
    public ResultSet obtenerUsuarioPorId(int id){
      String selectSql = "SELECT * FROM usuarios WHERE id = ?"; 
      
      try{
          PreparedStatement ps = conexion.prepareStatement(selectSql);
          ps.setInt(1, id);  
          return ps.executeQuery();
      }
      
      catch (SQLException e){
        System.out.println("Error al intentar Consultar: "+ e.getMessage());
        return null;  
      }
     
   
        
    } // FIN OBTENER USUARIO POR ID
    
    public ResultSet obtenerTodos(){
        String sqlTodo="SELECT * FROM Usuarios";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlTodo); 
          return ps.executeQuery();
        }
        catch(SQLException w){
            System.out.println("Error al consular"+ w.getMessage());
            return null;
        
        }
    } // fin de obtener todos
    public boolean actualizarUsuario( String id,String nom, String corr, String contra){
      
        String sqlUpdate = "UPDATE  Usuarios SET nombre=?,correo=?,contraseña=? WHERE id=?";
        
        try{
           PreparedStatement ps = conexion.prepareStatement(sqlUpdate);
           ps.setString(1,nom);
           ps.setString(2,corr);
           ps.setString(3,contra);
           ps.setString(4,id);
           return ps.executeUpdate() > 0;
        }
 /* el catch es para que si hay algun error el cache el error y te arrogue cual es el problema que es el manejo de la esepciones*/   
catch(SQLException e){
    System.out.println("Error al intentar actualizar: "+ e.getMessage());
    return false;
    
}
    
    }
}
