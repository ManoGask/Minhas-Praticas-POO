package ProjetoFinal;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private ArrayList<PedidoItem> itensPedido; // ArrayList para armazenar os itens do pedido

    // Construtor que recebe todos os atributos como parâmetros
    public Pedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
        this.itensPedido = new ArrayList<>(); // Inicializa o ArrayList
    }

    // Getter e setters para todos os atributos
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    // Método para alterar o status do pedido
    public void alterarStatus(int novoStatus) {
        this.statusPedido = novoStatus;
    }

    // Método para consultar um pedido comparando pelo número do pedido
    public boolean consultarPedido(Pedido pedido) {
        return this.numeroPedido == pedido.getNumeroPedido();
    }

    // Método para inserir um item no pedido
    public void inserirItensPedido(PedidoItem item) {
        this.itensPedido.add(item);
    }

    // Método para excluir um item do pedido
    public void excluirItensPedido(PedidoItem item) {
        this.itensPedido.remove(item);
    }

    // Método para calcular o total a pagar do pedido
    public double calculaTotalPagar() {
        double total = 0;
        for (PedidoItem item : itensPedido) {
            total += item.getPrecoIngresso() * item.getQtdeIngresso();
        }
        return total;
    }

    // Getters e setters para o ArrayList itensPedido (não necessário para o funcionamento, apenas para acesso externo)
    public ArrayList<PedidoItem> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ArrayList<PedidoItem> itensPedido) {
        this.itensPedido = itensPedido;
    }
}
