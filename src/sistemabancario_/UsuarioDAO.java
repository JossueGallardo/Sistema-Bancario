/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario_;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UsuarioDAO {
    public void registrarUsuario(String nombre, String cedula, int edad, String usuario, String contrasena) {
        String sql = "INSERT INTO usuarios (nombre, cedula, edad, usuario, contrasena) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Loggin.DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, cedula);
            stmt.setInt(3, edad);
            stmt.setString(4, usuario);
            stmt.setString(5, contrasena);
            stmt.executeUpdate();
            System.out.println("Usuario registrado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
