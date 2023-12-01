package ProjetoFinal;

public class PedidoItem {
    private String nomeEvento;
    private int qtdeIngresso;
    private double precoIngresso;

    public PedidoItem(String nomeEvento, int qtdeIngresso, double precoIngresso) {
        this.nomeEvento = nomeEvento;
        this.qtdeIngresso = qtdeIngresso;
        this.precoIngresso = precoIngresso;
    }

    public PedidoItem() {
        // Construtor vazio
    }

    public boolean atualizaEstoqueIngresso() {
        // Lógica para atualizar o estoque do ingresso
        return true; // Exemplo de retorno, adapte conforme a lógica real
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }
// Getters e setters para os atributos
}
