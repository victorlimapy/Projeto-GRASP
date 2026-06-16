package lanchonete;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private List<ItemPedido> itens;

    public Pedido(int id) {
        this.id = id;
        this.itens = new ArrayList<>();
    }

    /**
     * [APLICAÇÃO DO PADRÃO GRASP: CREATOR]
     * 
     * Justificativa: A classe 'Pedido' possui e agrega uma lista de 'ItemPedido'. 
     * Portanto, de acordo com o princípio Creator, a classe 'Pedido' é a melhor 
     * candidata para ser a responsável por instanciar os objetos de 'ItemPedido'.
     * Em vez de criar o ItemPedido fora e passar para o pedido, o método abaixo 
     * recebe os dados necessários, cria o objeto internamente e o adiciona à lista.
     */
    public void adicionarItem(String nome, double preco) {
        ItemPedido novoItem = new ItemPedido(nome, preco);
        this.itens.add(novoItem);
    }

    public int getId() { 
        return id; 
    }
    
    public List<ItemPedido> getItens() { 
        return itens; 
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}