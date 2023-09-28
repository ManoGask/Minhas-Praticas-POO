package questao3;

abstract class Projeto {
    private String nomeProjeto;
    private String descricao;
    private String ecdereco;
    private String dataInicio;
    private String dataFim;


    public String getNomeProjeto() {
        return nomeProjeto;
    }
    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getEcdereco() {
        return ecdereco;
    }
    public void setEcdereco(String ecdereco) {
        this.ecdereco = ecdereco;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public String getDataFim() {
        return dataFim;
    }
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
    public Projeto(String nomeProjeto, String descricao, String ecdereco, String dataInicio, String dataFim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.ecdereco = ecdereco;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    public void Projeto(String nome, String descricao, String endereco, String dataInicio, String dataFim){

    }
    public abstract boolean validaProjeto();

    public abstract String imprimeProjeto();


}
