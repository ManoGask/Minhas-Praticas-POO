package ProjetoFinal;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Criando uma Categoria
        Categoria categoria = new Categoria("Esportes");

        // Criando um Evento usando a Categoria criada
        Evento evento = new Evento("Partida de Futebol", new Date(), 50.0, "Final do campeonato", 1000, categoria);

        // Criando um Pedido
        Pedido pedido = new Pedido(1, new Date(), 0.0, 1);

        // Adicionando itens ao pedido
        PedidoItem item1 = new PedidoItem("Partida de Futebol", 2, 50.0);
        PedidoItem item2 = new PedidoItem("Partida de Futebol", 3, 50.0);

        pedido.inserirItensPedido(item1);
        pedido.inserirItensPedido(item2);

        // Alterando o status do pedido
        pedido.alterarStatus(2);

        // Calculando o total a pagar do pedido
        double totalPagar = pedido.calculaTotalPagar();

        // Exibindo informações do pedido
        System.out.println("Número do Pedido: " + pedido.getNumeroPedido());
        System.out.println("Status do Pedido: " + pedido.getStatusPedido());
        System.out.println("Total a Pagar: " + totalPagar);

        // Testando a consulta de um pedido
        Pedido pedidoConsulta = new Pedido(2, new Date(), 50.0, 1);
        boolean consulta = pedido.consultarPedido(pedidoConsulta);
        System.out.println("Consulta de Pedido: " + consulta);

        // Excluindo um item do pedido
        pedido.excluirItensPedido(item1);

        // Atualizando o estoque de ingressos
        boolean atualizacaoEstoque = item2.atualizaEstoqueIngresso();
        System.out.println("Atualização do Estoque: " + atualizacaoEstoque);
    }
}




