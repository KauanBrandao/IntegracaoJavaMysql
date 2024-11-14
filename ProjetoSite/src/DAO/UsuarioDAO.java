package DAO;

import DTO.UsuarioDTO;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void cadastrarUsuario(UsuarioDTO usuario) {
        String sql = "INSERT INTO usuarios(nome, email, cpf, telefone, datanascimento, tipo_deficiencia, formacao, experiencia, habilidades, curriculo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = new ConnectionDAO().connectDB();
            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getCpf());
            pstm.setString(4, usuario.getTelefone());
            pstm.setString(5, usuario.getData_nascimento());
            pstm.setString(6, usuario.getTipo_deficiencia());
            pstm.setString(7, usuario.getFormacao());
            pstm.setString(8, usuario.getExperiencia());
            pstm.setString(9, usuario.getHabilidades());
            pstm.setString(10, usuario.getCurriculo());

            pstm.executeUpdate();

            pstm.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuário: " + e.getMessage());
        }
    }
}