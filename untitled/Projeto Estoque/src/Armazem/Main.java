package Armazem;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

import java.awt.desktop.ScreenSleepEvent;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int id, estoque;
        String produto;
        double preco;
        System.out.println("Id: ");
        id = ler.nextInt();
        System.out.println("Nome do Produto: ");
        produto = ler.nextLine();
        produto = ler.nextLine();
        System.out.println("Preço do Produto: ");
        preco = ler.nextDouble();
        System.out.println("Estoque Inicial: ");
        estoque = ler.nextInt();

        Estoque x1 = new Estoque(id,produto,estoque,preco);

        System.out.println("Digite a quantidade para acrescentar: ");
        int qtde = ler.nextInt();
        x1.Acrescimo(qtde);

        System.out.println("Digite a quantidade para baixa: ");
        qtde = ler.nextInt();
        x1.Baixa(qtde);

        System.out.println(x1.consultaEstoque());














       /* Estoque e1 = new Estoque(1,"Arroz", 10, 25.00);
        Estoque f2 = new Estoque(2, "Feijão", 5, 5.65);
        Estoque g3 = new Estoque(3, "Acuçar", 500, 16.00);
        e1.Acrescimo(100);
        System.out.println(e1.consultaEstoque());
        f2.Baixa(3);
        System.out.println(f2.consultaEstoque());
        g3.Baixa(450);
        g3.TotalEstoque();
        System.out.println(g3.consultaEstoque());
        System.out.println(g3.TotalEstoque());*/



    }

}