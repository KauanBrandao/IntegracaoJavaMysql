package DTO;

public class FeedbacksDTO {
    private int id_feedback;
    private int id_usuario;
    private int id_empresa;
    private String conteudo;
    private String data_feedback;

    public FeedbacksDTO(int id_usuario, int id_empresa, String conteudo, String data_feedback) {
        this.id_usuario = id_usuario;
        this.id_empresa = id_empresa;
        this.conteudo = conteudo;
        this.data_feedback = data_feedback;
    }

    public FeedbacksDTO() {

    }

    public int getId_feedback() {
        return id_feedback;
    }

    public void setId_feedback(int id_feedback) {
        this.id_feedback = id_feedback;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getData_feedback() {
        return data_feedback;
    }

    public void setData_feedback(String data_feedback) {
        this.data_feedback = data_feedback;
    }
}
