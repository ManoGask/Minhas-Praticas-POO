package questao3;

public class DistrAlimento extends Projeto{
    private String descAlimento;
    private float qtde;

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public DistrAlimento(String nomeProjeto, String descricao, String ecdereco, String dataInicio,
                         String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, ecdereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public boolean validaProjeto(){
        if(getDataFim().isEmpty()){
            return true;
        }
        return false;
    }

    public String imprimeProjeto(){
        return "\n******************************"
                +"\nNome do Projeto: "+getNomeProjeto()
                +"\nDescricao do projeto: "+getDescricao()
                +"\nData incio: "+getDataInicio()
                +"\nData fim: "+getDataFim()
                +"\n Descricao alimeto: "+descAlimento
                +"\nQuantidade: "+qtde
                +"\n******************************";
    }
}
