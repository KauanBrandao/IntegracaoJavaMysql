package VIEW;

import DAO.*;
import DTO.*;

import java.util.Scanner;

public class Edicao {

    Scanner sc = new Scanner(System.in);

    public void editarUsuario() {
        UsuarioDTO usuarioEdicao = new UsuarioDTO();

        System.out.print("Digite o ID do usuário que deseja editar: ");
        int idUsuario = sc.nextInt();
        sc.nextLine();
        usuarioEdicao.setId_usuario(idUsuario);

        System.out.print("Informe o novo nome (deixe em branco para manter o atual): ");
        String novoNome = sc.nextLine();
        if (!novoNome.isEmpty()) {
            usuarioEdicao.setNome(novoNome);
        }

        System.out.print("Informe o novo email (deixe em branco para manter o atual): ");
        String novoEmail = sc.nextLine();
        if (!novoEmail.isEmpty()) {
            usuarioEdicao.setEmail(novoEmail);
        }

        System.out.print("Informe o novo CPF (deixe em branco para manter o atual): ");
        String novoCpf = sc.nextLine();
        if (!novoCpf.isEmpty()) {
            usuarioEdicao.setCpf(novoCpf);
        }

        System.out.print("Informe o novo telefone (deixe em branco para manter o atual): ");
        String novoTelefone = sc.nextLine();
        if (!novoTelefone.isEmpty()) {
            usuarioEdicao.setTelefone(novoTelefone);
        }

        System.out.print("Informe o tipo de deficiência (deixe em branco para manter o atual): ");
        String novoTipo = sc.nextLine();
        if (!novoTipo.isEmpty()) {
            usuarioEdicao.setTipo_deficiencia(novoTipo);
        }

        System.out.print("Informe a formação (deixe em branco para manter o atual): ");
        String novaFormacao = sc.nextLine();
        if (!novaFormacao.isEmpty()) {
            usuarioEdicao.setFormacao(novaFormacao);
        }

        System.out.print("Informe a experiência (deixe em branco para manter o atual): ");
        String novaExperiencia = sc.nextLine();
        if (!novaExperiencia.isEmpty()) {
            usuarioEdicao.setExperiencia(novaExperiencia);
        }

        System.out.print("Informe as habilidades (deixe em branco para manter o atual): ");
        String novaHabilidade = sc.nextLine();
        if (!novaHabilidade.isEmpty()) {
            usuarioEdicao.setHabilidades(novaHabilidade);
        }

        System.out.print("Informe o currículo (deixe em branco para manter o atual): ");
        String novoCurriculo = sc.nextLine();
        if (!novoCurriculo.isEmpty()) {
            usuarioEdicao.setCurriculo(novoCurriculo);
        }


        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.editarUsuario(usuarioEdicao);
    }


    public void editarEmpresa() {
        EmpresaDTO empresaEdicao = new EmpresaDTO();

        System.out.print("Digite o ID da empresa que deseja editar: ");
        int id = sc.nextInt();
        sc.nextLine();
        empresaEdicao.setId_empresa(id);

        System.out.println("Informe o novo nome da empresa (deixe em branco para manter o atual): ");
        String novoNome = sc.nextLine();
        if (!novoNome.isEmpty()) {
            empresaEdicao.setNome_empresa(novoNome);
        }

        System.out.println("Informe o novo CNPJ da empresa (deixe em branco para manter o atual): ");
        String novoCnpj = sc.nextLine();
        if (!novoCnpj.isEmpty()) {
            empresaEdicao.setCnpj(novoCnpj);
        }

        System.out.println("Informe o novo e-mail para contato da empresa (deixe em branco para manter o atual): ");
        String novoEmail = sc.nextLine();
        if (!novoEmail.isEmpty()) {
            empresaEdicao.setEmail_contato(novoEmail);
        }

        System.out.println("Informe o novo telefone para contato da empresa (deixe em branco para manter o atual): ");
        String novoTelefone = sc.nextLine();
        if (!novoTelefone.isEmpty()) {
            empresaEdicao.setTelefone_contato(novoTelefone);
        }

        System.out.println("Informe o novo setor da empresa (deixe em branco para manter o atual): ");
        String novoSetor = sc.nextLine();
        if (!novoSetor.isEmpty()) {
            empresaEdicao.setSetor(novoSetor);
        }

        System.out.println("Informe a nova política de inclusão da empresa (deixe em branco para manter o atual): ");
        String novaPoliticaInclusao = sc.nextLine();
        if (!novaPoliticaInclusao.isEmpty()) {
            empresaEdicao.setPolitica_inclusao(novaPoliticaInclusao);
        }

        DAO.EmpresaDAO empresaDAO = new EmpresaDAO();
        empresaDAO.editarEmpresa(empresaEdicao);
        System.out.println("Empresa atualizada com sucesso!");
    }

    public void editarCandidatura() {
        CandidaturaDTO candidaturaEdicao = new CandidaturaDTO();

        System.out.print("Digite o ID da candidatura que deseja editar: ");
        int id = sc.nextInt();
        candidaturaEdicao.setId_candidatura(id);

        sc.nextLine();

        System.out.println("Informe o novo ID do usuário (deixe em branco para manter o atual): ");
        String novoIdUsuario = sc.nextLine();
        if (!novoIdUsuario.isEmpty()) {
            candidaturaEdicao.setId_usuario(Integer.parseInt(novoIdUsuario));
        }

        System.out.println("Informe o novo ID da vaga (deixe em branco para manter o atual): ");
        String novoIdVaga = sc.nextLine();
        if (!novoIdVaga.isEmpty()) {
            candidaturaEdicao.setId_vaga(Integer.parseInt(novoIdVaga));
        }

        System.out.println("Informe a nova data de aplicação (formato: yyyy-mm-dd, deixe em branco para manter a atual): ");
        String novaDataAplicacao = sc.nextLine();
        if (!novaDataAplicacao.isEmpty()) {
            candidaturaEdicao.setData_aplicacao(novaDataAplicacao);
        }

        System.out.println("Informe o novo status da candidatura (deixe em branco para manter o atual): ");
        String novoStatus = sc.nextLine();
        if (!novoStatus.isEmpty()) {
            candidaturaEdicao.setStatus(novoStatus);
        }

        CandidaturaDAO objCandidaturaDAO = new CandidaturaDAO();
        objCandidaturaDAO.editarCandidatura(candidaturaEdicao);

        System.out.println("Candidatura atualizada com sucesso!");
    }

    public void editarVaga() {
        VagasDTO vagaEdicao = new VagasDTO();

        System.out.print("Digite o ID da vaga que deseja editar: ");
        int id = sc.nextInt();
        vagaEdicao.setId_vaga(id);

        sc.nextLine();

        System.out.println("Informe o novo título da vaga (deixe em branco para manter o atual): ");
        String novoTitulo = sc.nextLine();
        if (!novoTitulo.isEmpty()) {
            vagaEdicao.setTitulo(novoTitulo);
        }

        System.out.println("Informe a nova descrição da vaga (deixe em branco para manter a atual): ");
        String novaDescricao = sc.nextLine();
        if (!novaDescricao.isEmpty()) {
            vagaEdicao.setDescricao(novaDescricao);
        }

        System.out.println("Informe os novos requisitos da vaga (deixe em branco para manter os atuais): ");
        String novosRequisitos = sc.nextLine();
        if (!novosRequisitos.isEmpty()) {
            vagaEdicao.setRequisitos(novosRequisitos);
        }

        System.out.println("Informe o novo salário da vaga (deixe em branco para manter o atual): ");
        String novoSalario = sc.nextLine();
        if (!novoSalario.isEmpty()) {
            vagaEdicao.setSalario(Double.parseDouble(novoSalario));
        }

        System.out.println("Informe o novo tipo de contratação da vaga (deixe em branco para manter o atual): ");
        String novoTipoContratacao = sc.nextLine();
        if (!novoTipoContratacao.isEmpty()) {
            vagaEdicao.setTipo_contratacao(novoTipoContratacao);
        }

        System.out.println("Informe a nova localização da vaga (deixe em branco para manter a atual): ");
        String novaLocalizacao = sc.nextLine();
        if (!novaLocalizacao.isEmpty()) {
            vagaEdicao.setLocalizacao(novaLocalizacao);
        }

        System.out.println("Informe o novo ID da empresa para a vaga (deixe em branco para manter o atual): ");
        String novoIdEmpresa = sc.nextLine();
        if (!novoIdEmpresa.isEmpty()) {
            vagaEdicao.setId_empresa(Integer.parseInt(novoIdEmpresa));
        }

        VagaDAO objVagaDAO = new VagaDAO();
        objVagaDAO.editarVaga(vagaEdicao);

        System.out.println("Vaga atualizada com sucesso!");
    }

    public void editarFeedback () {
        FeedbacksDTO feedbackEdicao = new FeedbacksDTO();

        System.out.print("Digite o ID do feedback que deseja editar: ");
        int id = sc.nextInt();
        feedbackEdicao.setId_feedback(id);

        sc.nextLine();

        System.out.println("Informe o novo conteúdo do feedback (deixe em branco para manter o atual): ");
        String novoConteudo = sc.nextLine();
        if (!novoConteudo.isEmpty()) {
            feedbackEdicao.setConteudo(novoConteudo);
        }

        System.out.println("Informe a nova data do feedback (formato: yyyy-mm-dd) (deixe em branco para manter a atual): ");
        String novaDataFeedback = sc.nextLine();
        if (!novaDataFeedback.isEmpty()) {
            feedbackEdicao.setData_feedback(novaDataFeedback);
        }

        System.out.println("Informe o novo ID do usuário associado ao feedback (deixe em branco para manter o atual): ");
        String novoIdUsuario = sc.nextLine();
        if (!novoIdUsuario.isEmpty()) {
            feedbackEdicao.setId_usuario(Integer.parseInt(novoIdUsuario));
        }

        System.out.println("Informe o novo ID da empresa associada ao feedback (deixe em branco para manter o atual): ");
        String novoIdEmpresa = sc.nextLine();
        if (!novoIdEmpresa.isEmpty()) {
            feedbackEdicao.setId_empresa(Integer.parseInt(novoIdEmpresa));
        }

        FeedbackDAO objFeedbackDAO = new FeedbackDAO();
        objFeedbackDAO.editarFeedback(feedbackEdicao);

        System.out.println("Feedback atualizado com sucesso!");
    }
}






