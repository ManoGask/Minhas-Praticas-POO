package Prova1;



public class Encontrar {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Fulano", "fulano@email.com", "1234567890");

        AchadoPerdido achado = new AchadoPerdido("Carteira", "Carteira preta, com carteira de identidade, cartão de crédito e dinheiro", "Shopping Center", "Bolsa", "Encontrado", "", usuario);

        // Exibe o título do achado perdido
        String titulo = achado.buscarTitulo("Carteira");
        System.out.println(titulo);

        // Exibe os detalhes do achado perdido
        achado.visualizaDetalhes();
    }
}