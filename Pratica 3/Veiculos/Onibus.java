package Veiculos;

import javax.swing.*;

public class Onibus extends Veiculo {
    private int assentos;
    private String placa;
    private int ano;

    public Onibus(int assentos, String placa, int ano) {
        this.assentos = assentos;
        this.placa = placa;
        this.ano = ano;
    }

    public int getAssentos() {
        return assentos;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    // Método para exibir os dados

    public void exibirDados() {
        String mensagem = "Placa: " + getPlaca() + "\nAno: " + getAno() + "\nAssentos: " + assentos;
        JOptionPane.showMessageDialog(null, mensagem, "Dados do Ônibus", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Onibus onibus = new Onibus(40, "XYZ5678", 2022);
        onibus.exibirDados();
    }
}
