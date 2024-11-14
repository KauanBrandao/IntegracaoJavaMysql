package DAO;

import DTO.VagasDTO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VagaDAO {

    public void cadastrarVaga (VagasDTO vaga) {
        String sql = "INSERT INTO vagas(titulo, descricao, requisitos, salario, tipo_contratacao, localizacao, id_empresa) VALUES " +
                "(?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = new ConnectionDAO().connectDB();
            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setString(1, vaga.getTitulo());
            pstm.setString(2, vaga.getDescricao());
            pstm.setString(3, vaga.getRequisitos());
            pstm.setDouble(4, vaga.getSalario());
            pstm.setString(5, vaga.getTipo_contratacao());
            pstm.setString(6, vaga.getLocalizacao());
            pstm.setInt(7, vaga.getId_empresa());
            pstm.executeUpdate();


            pstm.close();
            conn.close();


        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "VagaDAO" + e.getMessage());
        }

    }
}
