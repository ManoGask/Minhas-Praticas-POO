package Questao1;

public class Main {
    public static void main(String[] args) {
        Normal n1 = new Normal(100);
        n1.imprimeIngresso();

        VIP v1 = new VIP(100,50);
        v1.imprimeIngresso();

        Camarote c1 = new Camarote(200,200,"Setor Camarote: ");
        c1.imprimeIngresso();

    }
}
