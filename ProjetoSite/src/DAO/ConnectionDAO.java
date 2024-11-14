package DAO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {

    public Connection connectDB() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/empregabilidadepcd1?user=root&password=230805Ka*";
            conn = DriverManager.getConnection(url);
            System.out.println("Conexão realizada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão: " + e.getMessage());
        }
        return conn;
    }
}
