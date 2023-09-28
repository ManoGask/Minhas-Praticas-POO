package questao3;

public class TrabVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duracaoTrabalho;


    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }


    public TrabVoluntario(String nomeProjeto, String descricao, String ecdereco, String dataInicio, String dataFim,
                          String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, ecdereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto(){
        if(duracaoTrabalho>=2){
            return true;
        }
        return false;
    }

    public String imprimeProjeto(){
        return "\n******************************"
                +"\nNome do projeto: "+getNomeProjeto()
                +"\nDescricao: "+getDescricao()
                +"\nData inicio: "+getDataInicio()
                +"\nData fim: "+getDataFim()
                +"\nTipo trabalho: " + tipoTrabalho
                +"\nDuracao trabalho: "+ duracaoTrabalho
                +"\n******************************";
    }

}
