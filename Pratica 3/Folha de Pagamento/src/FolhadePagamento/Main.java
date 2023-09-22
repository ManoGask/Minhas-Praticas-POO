package FolhadePagamento;

import FolhadePagamento.Comissao;
import FolhadePagamento.Produtividade;
import FolhadePagamento.Padrao;

public class Main {
    public static void main(String[] args) {

    } {

        Padrao fp = new Padrao(1, "Gabriel", 2000);
        System.out.println(fp.toString());

        Comissao fc = new Comissao(2, "Carla", 3000, 5, 10000);
        System.out.println(fc.toString());

        Produtividade fpr = new Produtividade(3, "Pedro", 2000, 4000, 100);
        System.out.println(fpr.toString());

    }
}