package Parte2;

public class DistribuicaodeAlimento extends ProjetoSocial {

    private String descAlimento;
    private int qtde;

    public DistribuicaodeAlimento(String nomeProjeto, String descricao, String dataInicio, String dataFim, String descAlimento, int qtde) {
        super(nomeProjeto, descricao, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto(String nomeProjeto) {
        return this.getDataFim().equals("");
    }

    @Override
    public String imprimeProjeto() {
        return String.format("Nome do projeto: %s\n" +
                        "Descrição: %s\n" +
                        "Data de início: %s\n" +
                        "Data de término: %s\n" +
                        "Descrição dos alimentos: %s\n" +
                        "Quantidade: %d",
                this.getNomeProjeto(),
                this.getDescricao(),
                this.getDataInicio(),
                this.getDataFim(),
                this.descAlimento,
                this.qtde);
    }
}
