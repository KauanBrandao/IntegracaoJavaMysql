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
            JOptionPane.showConfirmDialog(null, "cadastroEmpresaDAO" + e.getMessage());
        }

    }

    public void editarEmpresa (EmpresaDTO empresaEdicao) {

        String sql = "UPDATE empresas SET nome_empresa = ?, email_contato = ?, cnpj = ?, telefone_contato = ?, setor = ?, politica_inclusao = ? ";

        try {
            Connection conn = new ConnectionDAO().connectDB();
            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setString(1, empresaEdicao.getNome_empresa());
            pstm.setString(2, empresaEdicao.getEmail_contato());
            pstm.setString(3, empresaEdicao.getCnpj());
            pstm.setString(4, empresaEdicao.getTelefone_contato());
            pstm.setString(5, empresaEdicao.getSetor());
            pstm.setString(6, empresaEdicao.getPolitica_inclusao());
            pstm.executeUpdate();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "editarEmpresaDAO" + e.getMessage());
        }


    }


}
