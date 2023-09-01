package Armazem;

public class Estoque {
    private int id;
    private String produto;
    private int estoque;
    private double preco;

    public Estoque(int id, String produto, int estoque, double preco) {
        this.id = id;
        this.produto = produto;
        this.estoque = estoque;
        this.preco = preco;
    }

    public void Acrescimo(int qtde){
        estoque = estoque + qtde;
    }
    public void Baixa(int qtde) {
        if (qtde <= estoque) ;
        estoque = estoque - qtde;
    }

    public double TotalEstoque(){
        return estoque * preco;
    }
    public String consultaEstoque(){
        return "Produto: " + produto + "\nEstoque: " + estoque + "\n Preço: " + preco;

    }
}
