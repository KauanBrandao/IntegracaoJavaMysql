package DTO;

public class UsuarioDTO {
    private int id_usuario;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String data_nascimento;
    private String tipo_deficiencia;
    private String formacao;
    private String experiencia;
    private String habilidades;
    private String curriculo;

    public UsuarioDTO(String nome, String email, String cpf, String telefone, String data_nascimento, String tipo_deficiencia,
                   String formacao, String experiencia, String habilidades, String curriculo)  {

        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
        this.tipo_deficiencia = tipo_deficiencia;
        this.formacao = formacao;
        this.experiencia = experiencia;
        this.habilidades = habilidades;
        this.curriculo = curriculo;
    }

    public UsuarioDTO() {

    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UsuarioDTO(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTipo_deficiencia() {
        return tipo_deficiencia;
    }

    public void setTipo_deficiencia(String tipo_deficiencia) {
        this.tipo_deficiencia = tipo_deficiencia;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}

