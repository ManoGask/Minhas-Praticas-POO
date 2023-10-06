package Parte2;

import javax.swing.*;

public abstract class ProjetoSocial {

    private String nomeProjeto;
    private String descricao;
    private String dataInicio;
    private String dataFim;

    public ProjetoSocial(String nomeProjeto, String descricao, String dataInicio, String dataFim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public abstract boolean validaProjeto(String nomeProjeto);

    public abstract String imprimeProjeto();


    public static void main(String[] args) {

        int opcao = -1;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha a opção que deseja se voluntariar:\n" +
                            "1 - Distribuição de Alimentos\n" +
                            "2 - Trabalho Voluntário\n" +
                            "3 - Sair"));

            switch (opcao) {
                case 1:

                    DistribuicaodeAlimento distribuicaoAlimento = new DistribuicaodeAlimento(
                            JOptionPane.showInputDialog("Nome do projeto:"),
                            JOptionPane.showInputDialog("Descrição do projeto:"),
                            JOptionPane.showInputDialog("Data de início:"),
                            JOptionPane.showInputDialog("Data de término:"),
                            JOptionPane.showInputDialog("Descrição dos alimentos:"),
                            Integer.parseInt(JOptionPane.showInputDialog("Quantidade:")));


                    if (distribuicaoAlimento.validaProjeto(distribuicaoAlimento.getNomeProjeto())) {

                        JOptionPane.showMessageDialog(null, distribuicaoAlimento.imprimeProjeto());
                    } else {
                        JOptionPane.showMessageDialog(null, "Projeto inválido!");
                    }
                    break;
                case 2:

                    TrabalhoVoluntario trabalhoVoluntario = new TrabalhoVoluntario(
                            JOptionPane.showInputDialog("Nome do projeto:"),
                            JOptionPane.showInputDialog("Descrição do projeto:"),
                            JOptionPane.showInputDialog("Data de início:"),
                            JOptionPane.showInputDialog("Data de término:"),
                            JOptionPane.showInputDialog("Tipo de trabalho:"),
                            Integer.parseInt(JOptionPane.showInputDialog("Duração:")));


                    if (trabalhoVoluntario.validaProjeto(trabalhoVoluntario.getNomeProjeto())) {

                        JOptionPane.showMessageDialog(null, trabalhoVoluntario.imprimeProjeto());
                    } else {
                        JOptionPane.showMessageDialog(null, "Projeto inválido!");
                    }
                    break;
                case 3:

                    break;
                default:

                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcao != 3);


        JOptionPane.showMessageDialog(null, "Obrigado por se voluntariar!");
    }
}



