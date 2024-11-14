package DAO;

import DTO.EmpresaDTO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpresaDAO {

    public void cadastrarEmpresa (EmpresaDTO empresa) {

        String sql = "INSERT INTO empresas(nome_empresa, email_contato, cnpj, telefone_contato, setor, politica_inclusao) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = new ConnectionDAO().connectDB();
            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setString(1, empresa.getNome_empresa());
            pstm.setString(2, empresa.getEmail_contato());
            pstm.setString(3, empresa.getCnpj());
            pstm.setString(4, empresa.getTelefone_contato());
            pstm.setString(5, empresa.getSetor());
            pstm.setString(6, empresa.getPolitica_inclusao());
            pstm.executeUpdate();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "EmpresaDAO" + e.getMessage());
        }

    }

}
