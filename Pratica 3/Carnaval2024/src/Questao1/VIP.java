package Questao1;

public class VIP extends Ingresso{
     double valorAdicional;

    public VIP(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public void imprimeIngresso() {
        System.out.println("Ingresso VIP : " + (getValorIngresso() + getValorAdicional()));
    }
}




