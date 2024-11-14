package VIEW;


import DAO.*;
import DTO.*;

import java.sql.Date;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Cadastro {
    Scanner sc = new Scanner(System.in);

    public void cadastrarUsuario () {
        UsuarioDTO usuario = new UsuarioDTO("", "", "", "", "", "", "", "", "", "" );

        System.out.println("Informe o seu nome: ");
        String nome = sc.nextLine();
        usuario.setNome(nome);

        System.out.println("Informe o seu e-mail: ");
        String email = sc.nextLine();
        usuario.setEmail(email);

        System.out.println("Informe o seu cpf: ");
        String cpf = sc.nextLine();
        usuario.setCpf(cpf);

        System.out.println("Informe o seu telefone: ");
        String telefone = sc.nextLine();
        usuario.setTelefone(telefone);

        System.out.println("Informe a sua data de nascimento: ");
        String dataNascimento = sc.nextLine();
        usuario.setData_nascimento(dataNascimento);

        System.out.println("Informe o seu tipo de deficiência: ");
        String tipoDeDeficiencia = sc.nextLine();
        usuario.setTipo_deficiencia(tipoDeDeficiencia);

        System.out.println("Informe a sua formação: ");
        String formacao = sc.nextLine();
        usuario.setFormacao(formacao);

        System.out.println("Informe a sua experiência: ");
        String experiencia = sc.nextLine();
        usuario.setExperiencia(experiencia);

        System.out.println("Informe as suas habilidades: ");
        String habilidades = sc.nextLine();
        usuario.setHabilidades(habilidades);

        System.out.println("Currículo: ");
        String curriculo = sc.nextLine();
        usuario.setCurriculo(curriculo);

        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.cadastrarUsuario(usuario);

    }


    public void cadastrarEmpresa () {
        EmpresaDTO empresa = new EmpresaDTO();

        System.out.println("Informe o nome da empresa: ");
        String nome= sc.nextLine();
        empresa.setNome_empresa(nome);

        System.out.println("Informe o CNPJ da empresa: ");
        String cnpj = sc.nextLine();
        empresa.setCnpj(cnpj);

        System.out.println("Informe o e-mail para contato da empresa: ");
        String email = sc.nextLine();
        empresa.setEmail_contato(email);

        System.out.println("Informe o telefone para contato da empresa: ");
        String telefone = sc.nextLine();
        empresa.setTelefone_contato(telefone);

        System.out.println("Informe o setor da empresa: ");
        String setor = sc.nextLine();
        empresa.setSetor(setor);

        System.out.println("Informe a politica de inclusão da empresa: ");
        String politicaInclusao = sc.nextLine();
        empresa.setPolitica_inclusao(politicaInclusao);

        EmpresaDAO objEmpresaDAO = new EmpresaDAO();
        objEmpresaDAO.cadastrarEmpresa(empresa);

    }


    public void cadastrarCandidatura () {
        CandidaturaDTO candidatura = new CandidaturaDTO();

        System.out.println("Informe o id do usuario: ");
        int id_usuario= sc.nextInt();
        candidatura.setId_usuario(id_usuario);

        System.out.println("Informe o id da vaga: ");
        int id_vaga = sc.nextInt();
        candidatura.setId_vaga(id_vaga);

        sc.nextLine();

        System.out.println("Informe o status da vaga: ");
        String status = sc.nextLine();
        candidatura.setStatus(status);

        CandidaturaDAO objCandidaturaDAO = new CandidaturaDAO();
        objCandidaturaDAO.cadastrarCandidatura(candidatura);
    }


    public void cadastrarVaga () {
        VagasDTO vaga = new VagasDTO();

        System.out.println("Informe o título da vaga: ");
        String titulo = sc.nextLine();
        vaga.setTitulo(titulo);

        System.out.println("Informe a descrição da vaga: ");
        String descricao = sc.nextLine();
        vaga.setDescricao(descricao);

        System.out.println("Informe os requisitos da vaga: ");
        String requisitos = sc.nextLine();
        vaga.setRequisitos(requisitos);

        System.out.println("Informe o salario da vaga: ");
        double salario = sc.nextDouble();
        vaga.setSalario(salario);

        sc.nextLine();

        System.out.println("Informe o tipo de contratação: ");
        String tipo_contratacao = sc.nextLine();
        vaga.setTipo_contratacao(tipo_contratacao);

        System.out.println("Informe a localização da vaga: ");
        String localizacao = sc.nextLine();
        vaga.setLocalizacao(localizacao);


        System.out.println("Informe o id da empresa: ");
        int id_empresa = sc.nextInt();
        vaga.setId_empresa(id_empresa);


        VagaDAO objVagaDAO = new VagaDAO();
        objVagaDAO.cadastrarVaga(vaga);

    }

    public void cadastrarFeedback () {
        FeedbacksDTO feedback = new FeedbacksDTO();


        System.out.println("Informe o id do usuario: ");
        int id_usuario= sc.nextInt();
        feedback.setId_usuario(id_usuario);

        System.out.println("Informe o id da empresa: ");
        int id_empresa = sc.nextInt();
        feedback.setId_empresa(id_empresa);

        sc.nextLine();

        System.out.println("Feedback: ");
        String conteudo = sc.nextLine();
        feedback.setConteudo(conteudo);

        FeedbackDAO objFeedbackDAO = new FeedbackDAO();
        objFeedbackDAO.cadastrarFeedback(feedback);

    }
}
