package DTO;

public class CandidaturaDTO {
    private int id_candidatura;
    private int id_usuario;
    private int id_vaga;
    private String data_aplicacao;
    private String status;

    public CandidaturaDTO(int id_usuario, int vaga, String data_aplicacao, String status)  {
        this.id_usuario = id_usuario;
        this.id_vaga = id_vaga;
        this.data_aplicacao = data_aplicacao;
        this.status = status;

    }

    public CandidaturaDTO() {

    }

    public int getId_candidatura() {
        return id_candidatura;
    }

    public void setId_candidatura(int id_candidatura) {
        this.id_candidatura = id_candidatura;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_vaga() {
        return id_vaga;
    }

    public void setId_vaga(int id_vaga) {
        this.id_vaga = id_vaga;
    }

    public String getData_aplicacao() {
        return data_aplicacao;
    }

    public void setData_aplicacao(String data_aplicacao) {
        this.data_aplicacao = this.data_aplicacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
