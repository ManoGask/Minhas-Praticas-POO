package questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Menu: "+
                    "\n<1> Cadastar Projeto Distribuir Alimentos"+
                    "\n<2> Cadastar Projejo Trabalho Voluntário"+
                    "\n<3> Sair.");
            int escolha = sc.nextInt();

            if(escolha == 1){
                System.out.print("Nome: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Descricao: ");
                String desc = sc.nextLine();
                System.out.print("Endereco: ");
                String endereco = sc.nextLine();
                System.out.print("Data de incio: ");
                String dataInit = sc.next();
                System.out.print("Data termino: ");
                String dataEnd = sc.next();
                System.out.print("Descricao do alimento: ");
                sc.nextLine();
                String descAlimento = sc.nextLine();
                System.out.print("Quantidade: ");
                int qtde = sc.nextInt();
                DistrAlimento prjAlimento = new DistrAlimento(name, desc, endereco, dataInit, dataEnd, descAlimento, qtde);

                boolean validacao2 = prjAlimento.validaProjeto();
                System.out.println("");
                if (validacao2== false){
                    System.out.println("Proejto validado.");
                }else{
                    System.out.println("Projeto recusado. O projeto deve conter uma data fim.");
                }
                System.out.println(prjAlimento.imprimeProjeto());
            }else if(escolha == 2){
                System.out.print("Nome: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Descricao: ");
                String desc = sc.nextLine();
                System.out.print("Endereco: ");
                String endereco = sc.nextLine();
                System.out.print("Data de incio: ");
                String dataInit = sc.next();
                System.out.print("Data termino: ");
                String dataEnd = sc.next();
                System.out.print("Tipo de trabalho: ");
                sc.nextLine();
                String tipoTrabalho = sc.nextLine();
                System.out.print("Duracao do trabalho em meses: ");
                int duracaoTrabalho = sc.nextInt();
                TrabVoluntario prjAlimento = new TrabVoluntario(name, desc, endereco, dataInit, dataEnd, tipoTrabalho, duracaoTrabalho);

                boolean validacao1 = prjAlimento.validaProjeto();
                System.out.println("");
                if (validacao1 == false){
                    System.out.println("Projeto validado.");
                }else{
                    System.out.println("Projeto recusado. O projeto deve conter uma data fim.");
                }
                System.out.println(prjAlimento.imprimeProjeto());
            }else if(escolha == 3){
                System.out.println("Saindo");
                break;
            }
        }
        sc.close();
    }
}
