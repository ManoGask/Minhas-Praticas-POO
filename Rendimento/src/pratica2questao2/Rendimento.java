package pratica2questao2;


import java.text.NumberFormat;

public class Rendimento {

    private double invetimentoinicial;
    private double taxaderendimento;
    private int numerodemeses;

    public Rendimento(double invetimentoinicial, double taxaderendimento, int numerodemeses) {
        this.invetimentoinicial = invetimentoinicial;
        this.taxaderendimento = taxaderendimento;
        this.numerodemeses = numerodemeses;
    }

    public double getInvetimentoinicial() {
        return invetimentoinicial;
    }

    public void setInvetimentoinicial(double invetimentoinicial) {
        this.invetimentoinicial = invetimentoinicial;
    }

    public double getTaxaderendimento() {
        return taxaderendimento;
    }

    public void setTaxaderendimento(double taxaderendimento) {
        this.taxaderendimento = taxaderendimento;
    }

    public int getNumerodemeses() {
        return numerodemeses;
    }

    public void setNumerodemeses(int numerodemeses) {
        this.numerodemeses = numerodemeses;
    }

    public void calculaRendimento() {

        double rendimentoMes;

        rendimentoMes=getInvetimentoinicial();
        System.out.println("Valor Inicial: " + NumberFormat.getCurrencyInstance().format(getInvetimentoinicial()));
        System.out.println("Taxa de Juros: " + NumberFormat.getPercentInstance().format(getTaxaderendimento()/100));
        for (int i=0;i<getNumerodemeses();i++)
        {
            rendimentoMes=rendimentoMes*getTaxaderendimento()/100+rendimentoMes;
            System.out.println("Mes" + (i+1) + ":" + NumberFormat.getCurrencyInstance().format(rendimentoMes));

        }
    }



}

