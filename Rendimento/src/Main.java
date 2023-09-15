import pratica2questao2.Rendimento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do Rendimento: ");
        double vrInicial = ler.nextDouble();

        System.out.println("Digite a taxa de Juros: ");
        double txJuros = ler.nextDouble();

        System.out.println("Digite o numero de meses para o Rendimento: ");
        int numMeses = ler.nextInt();

        Rendimento r1 = new Rendimento(vrInicial,txJuros,numMeses);
        r1.calculaRendimento();
        
    }
}
