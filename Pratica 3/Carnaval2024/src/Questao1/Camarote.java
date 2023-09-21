package Questao1;

public class Camarote extends Ingresso {
    double valorCamarote;
    String localizacao;

    public Camarote(double valorIngresso, double valorCamarote, String localizacao) {
        super(valorIngresso);
        this.valorCamarote = valorCamarote;
        this.localizacao = localizacao;
    }

    public double getValorCamarote() {
        return valorCamarote;
    }

    public void setValorCamarote(double valorCamarote) {
        this.valorCamarote = valorCamarote;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }


    public void imprimeIngresso(){
        System.out.println("Localização do Camarote: " + localizacao + "Valor do Camarote: " + (getValorIngresso()+getValorCamarote()));
    }
}
