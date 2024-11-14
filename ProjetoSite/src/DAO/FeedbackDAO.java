package DAO;

import DTO.FeedbacksDTO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedbackDAO {

    public void cadastrarFeedback (FeedbacksDTO feedback) {

        String sql = "INSERT INTO feedbacks(id_usuario, id_empresa, conteudo) VALUES (?, ?, ?)";

        try {
            Connection conn = new ConnectionDAO().connectDB();
            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setInt(1, feedback.getId_usuario());
            pstm.setInt(2, feedback.getId_empresa());
            pstm.setString(3, feedback.getConteudo());
            pstm.executeUpdate();


            pstm.close();
            conn.close();

            JOptionPane.showMessageDialog(null, "Feedback cadastrado com sucesso!");
        }catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "FeedbackDAO" + e.getMessage());
        }
    }
}
