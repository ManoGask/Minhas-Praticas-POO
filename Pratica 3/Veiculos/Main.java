package Veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Onibus(40, "XYZ123", 2022);
        Veiculo veiculo2 = new Caminhao("ABC456", 2021, 6);

        veiculo1.exibirDados();
        veiculo2.exibirDados();
    }
}






