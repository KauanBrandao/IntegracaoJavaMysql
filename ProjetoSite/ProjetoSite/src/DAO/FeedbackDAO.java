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

        }catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "cadastroFeedbackDAO" + e.getMessage());
        }
    }

    public void editarFeedback (FeedbacksDTO feedbackEdicao) {

        String sql = "UPDATE feedbacks SET id_usuario = ?, id_empresa = ?, conteudo = ? WHERE id_feedback = ?";

        try {
            Connection conn = new ConnectionDAO().connectDB();

            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setInt(1, feedbackEdicao.getId_usuario());
            pstm.setInt(2, feedbackEdicao.getId_empresa());
            pstm.setString(3, feedbackEdicao.getConteudo());
            pstm.setInt(4, feedbackEdicao.getId_feedback());
        } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, "cadastroFeedbackDAO" + e.getMessage());
        }
    }
}
