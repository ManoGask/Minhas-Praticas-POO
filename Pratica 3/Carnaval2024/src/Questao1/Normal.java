package Questao1;

import org.w3c.dom.ls.LSOutput;

public class Normal extends Ingresso{
     public Normal(double valorIngresso) {
        super(valorIngresso);

    }

    public void imprimeIngresso() {
        System.out.println("Pista : " + getValorIngresso());
    }
}
