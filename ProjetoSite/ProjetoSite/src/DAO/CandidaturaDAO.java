package DAO;

import DTO.CandidaturaDTO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CandidaturaDAO {

    public void cadastrarCandidatura(CandidaturaDTO candidatura) {

        String sql = "INSERT INTO candidaturas(id_usuario, id_vaga, status) VALUES (?, ?, ?)";

        try {
            Connection conn = new ConnectionDAO().connectDB();
            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setInt(1, candidatura.getId_usuario());
            pstm.setInt(2, candidatura.getId_vaga());
            pstm.setString(3, candidatura.getStatus());
            pstm.executeUpdate();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "cadastroCandidaturaDAO" + e.getMessage());
        }
    }


    public void editarCandidatura(CandidaturaDTO candidaturaEdicao) {

        String sql = "UPDATE candidaturas SET id_usuario = ?, id_vaga = ?, status = ? WHERE id_usuario = ?";

        try {
            Connection conn = new ConnectionDAO().connectDB();
            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setInt(1, candidaturaEdicao.getId_usuario());
            pstm.setInt(2, candidaturaEdicao.getId_vaga());
            pstm.setString(3, candidaturaEdicao.getStatus());
            pstm.setInt(4, candidaturaEdicao.getId_usuario());
            pstm.executeUpdate();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "editarCandidaturaDAO" + e.getMessage());
        }

    }
}
