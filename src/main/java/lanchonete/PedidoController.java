package lanchonete;

import java.util.ArrayList;
import java.util.List;

/**
 * [APLICAÇÃO DO PADRÃO GRASP: CONTROLLER]
 * 
 * Justificativa: A classe 'PedidoController' atua como o primeiro objeto 
 * além da interface de usuário (UI) que recebe e coordena uma operação do sistema.
 * Ela isola a lógica de negócio e as regras do sistema da camada de apresentação (Main), 
 * garantindo que a interface não trate diretamente com a criação e manipulação pesada de dados.
 */
public class PedidoController {
    private List<Pedido> listaPedidos;
    private int proximoId;

    public PedidoController() {
        this.listaPedidos = new ArrayList<>();
        this.proximoId = 1;
    }

    // Coordena a criação de um novo pedido no sistema
    public Pedido iniciarNovoPedido() {
        Pedido novoPedido = new Pedido(proximoId++);
        listaPedidos.add(novoPedido);
        return novoPedido;
    }

    // Coordena a inserção de itens a um pedido específico de forma indireta
    public void adicionarItemAoPedido(Pedido pedido, String nomeItem, double precoItem) {
        if (pedido != null) {
            // Delega a criação final para a classe Pedido, que possui o papel de Creator
            pedido.adicionarItem(nomeItem, precoItem); 
        }
    }

    // Exibe os detalhes do pedido coordenado pelo controlador
    public void fecharEExibirResumo(Pedido pedido) {
        System.out.println("--- RESUMO DO PEDIDO #" + pedido.getId() + " ---");
        for (ItemPedido item : pedido.getItens()) {
            System.out.println("- " + item.getNome() + ": R$ " + item.getPreco());
        }
        System.out.println("Total do Pedido: R$ " + pedido.calcularTotal());
        System.out.println("--------------------------------\n");
    }
}
