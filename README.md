# Sistema de Lanchonete - Princípios GRASP

Este projeto consiste em um sistema simples em Java de gerenciamento de pedidos, desenvolvido para consolidar a aplicação prática dos padrões GRASP estudados em aula.

## Padrões GRASP Aplicados

### 1. Creator (Criador)
* **Onde foi aplicado:** Na classe `Pedido.java`, através do método `adicionarItem(String nome, double preco)`.
* **Justificativa:** O princípio GRASP Creator determina que uma classe *A* deve ser responsável por criar instâncias de uma classe *B* se *A* agrega, contém ou registra instâncias de *B*. Como a classe `Pedido` possui uma composição/agregação interna estrita de `ItemPedido`, ela detém o contexto ideal para instanciar e gerenciar o ciclo de vida desse objeto.

### 2. Controller (Controlador)
* **Onde foi aplicado:** Na classe `PedidoController.java`.
* **Justificativa:** O padrão Controller dita que deve existir um objeto não-UI encarregado de receber as mensagens do sistema vindas da camada de apresentação e coordenar as ações necessárias. O `PedidoController` isola o fluxo de regras de negócio da classe `Main.java`, garantindo que a "interface" de simulação não acesse ou manipule dados brutos diretamente.

---
*Projeto acadêmico para a disciplina de Programação Orientada a Objetos.*
