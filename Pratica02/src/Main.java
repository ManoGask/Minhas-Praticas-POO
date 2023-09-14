public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde) {
        if (qtde <= qtdAtual) {
            qtdAtual -= qtde;
            System.out.println("Baixa de " + qtde + " unidades realizada no estoque.");
        } else {
            System.out.println("Quantidade em estoque insuficiente.");
        }
    }

    public String mostra() {
        return "Nome: " + nome + "\nQuantidade atual: " + qtdAtual + "\nQuantidade mínima: " + qtdMinima;
    }

    public boolean precisaRepor() {
        return qtdAtual < qtdMinima;
    }

    public static void main(String[] args) {
        // Criando um objeto Estoque com os dados fornecidos pelo construtor
        Estoque estoque = new Estoque("Produto A", 50, 10);

        System.out.println("Informações iniciais do estoque:");
        System.out.println(estoque.mostra());
        System.out.println();

        // Movimentando o estoque
        estoque.darBaixa(20);
        estoque.darBaixa(40);
        estoque.darBaixa(10);
        System.out.println();

        // Exibindo informações atualizadas do estoque
        System.out.println("Informações atualizadas do estoque:");
        System.out.println(estoque.mostra());
        System.out.println();

        // Verificando se é necessário repor o estoque
        if (estoque.precisaRepor()) {
            System.out.println("É necessário repor o estoque.");
        } else {
            System.out.println("Não é necessário repor o estoque.");
        }
    }
}