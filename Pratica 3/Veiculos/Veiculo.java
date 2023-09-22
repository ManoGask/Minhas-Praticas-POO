package Veiculos;


import javax.swing.*;

public abstract class Veiculo {
    private String placa;
    private int ano;

    // Construtor sem parâmetros
    public Veiculo() {
        this("", 0);
    }

    // Construtor com parâmetros
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    // Método para exibir os dados
    public void exibirDados() {
        String mensagem = "Placa: " + placa + "\nAno: " + ano;
        JOptionPane.showMessageDialog(null, mensagem, "Dados do Veículo", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo() {
            @Override
            public void exibirDados() {

            }
        };
                Veiculo veiculo2 = new Veiculo("ABC1234", 2020) {
                    @Override
                    public void exibirDados() {

                    }
                };
        veiculo1.exibirDados();
        veiculo2.exibirDados();
    }
}
