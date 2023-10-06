package Parte2;

public class TrabalhoVoluntario extends ProjetoSocial {

    private String tipoTrabalho;
    private int duracao;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String dataInicio, String dataFim, String tipoTrabalho, int duracao) {
        super(nomeProjeto, descricao, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracao = duracao;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public boolean validaProjeto(String nomeProjeto) {
        return this.duracao >= 2;
    }

    @Override
    public String imprimeProjeto() {
        return String.format("Nome do projeto: %s\n" +
                        "Descrição: %s\n" +
                        "Data de início: %s\n" +
                        "Data de término: %s\n" +
                        "Tipo de trabalho: %s\n" +
                        "Duração: %d",
                this.getNomeProjeto(),
                this.getDescricao(),
                this.getDataFim(),
                this.getDataFim(),
                this.tipoTrabalho,
                this.duracao);
    }
}
