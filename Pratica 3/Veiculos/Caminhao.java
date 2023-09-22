package Veiculos;
import javax.swing.*;

public class Caminhao extends Veiculo {
    private int eixos;
    private String placa;
    private int ano;


    // Construtor da subclasse Caminhao
    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
        this.ano = ano;
        this.placa = placa;
    }

    public int getEixos() {
        return eixos;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    // Método para exibir os dados

    public void exibirDados() {
        String mensagem1 = "Placa: " + getPlaca() + "\nAno: " + getAno();
        String mensagem2 = "Eixos: " + eixos;

        JOptionPane.showMessageDialog(null, mensagem1, "Dados do Caminhão - Parte 1", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, mensagem2, "Dados do Caminhão - Parte 2", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("DEF4567", 2021, 4);
        caminhao.exibirDados();
    }
}
