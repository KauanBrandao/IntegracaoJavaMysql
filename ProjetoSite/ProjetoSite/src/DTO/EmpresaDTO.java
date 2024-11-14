package DTO;

public class EmpresaDTO {
    private int id_empresa;
    private String nome_empresa;
    private String cnpj;
    private String email_contato;
    private String telefone_contato;
    private String setor;
    private String politica_inclusao;


    public EmpresaDTO(String nome_empresa, String cnpj, String email_contato, String telefone_contato, String setor, String politica_inclusao ) {
    this.nome_empresa = nome_empresa;
    this.cnpj = cnpj;
    this.email_contato = email_contato;
    this.telefone_contato = telefone_contato;
    this.setor = setor;
    this.politica_inclusao = politica_inclusao;
}

    public EmpresaDTO() {

    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail_contato() {
        return email_contato;
    }

    public void setEmail_contato(String email_contato) {
        this.email_contato = email_contato;
    }

    public String getTelefone_contato() {
        return telefone_contato;
    }

    public void setTelefone_contato(String telefone_contato) {
        this.telefone_contato = telefone_contato;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getPolitica_inclusao() {
        return politica_inclusao;
    }

    public void setPolitica_inclusao(String politica_inclusao) {
        this.politica_inclusao = politica_inclusao;
    }
}
