package DTO;

public class VagasDTO {
    private int id_vaga;
    private String titulo;
    private String descricao;
    private String requisitos;
    private Double salario;
    private String tipo_contratacao;
    private String localizacao;
    private int id_empresa;


    public VagasDTO(String titulo, String descricao, String requisitos, Double salario, String tipo_contratacao, String localizacao, int id_empresa) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.requisitos = requisitos;
        this.salario = salario;
        this.tipo_contratacao = tipo_contratacao;
        this.localizacao = localizacao;
        this.id_empresa = id_empresa;
    }

    public VagasDTO() {

    }

    public int getId_vaga() {
        return id_vaga;
    }

    public void setId_vaga(int id_vaga) {
        this.id_vaga = id_vaga;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getTipo_contratacao() {
        return tipo_contratacao;
    }

    public void setTipo_contratacao(String tipo_contratacao) {
        this.tipo_contratacao = tipo_contratacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }
}
