package lanchonete;

public class Main {
    public static void main(String[] args) {
        // A Interface (Main) interage exclusivamente com o Controlador do sistema
        PedidoController sistemaController = new PedidoController();

        System.out.println("Iniciando simulação do sistema...\n");

        // 1. Interface solicita a criação de um pedido ao Controlador
        Pedido pedido1 = sistemaController.iniciarNovoPedido();

        // 2. Interface envia os dados de entrada para o Controlador coordenar as ações
        sistemaController.adicionarItemAoPedido(pedido1, "Hamburguer Artesanal", 29.90);
        sistemaController.adicionarItemAoPedido(pedido1, "Batata Frita", 12.00);
        sistemaController.adicionarItemAoPedido(pedido1, "Refrigerante 350ml", 6.00);

        // 3. Interface solicita o encerramento e exibição do resumo do pedido
        sistemaController.fecharEExibirResumo(pedido1);
    }
}