package com.dcc.ufjf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PedidoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        ItemPedido item1 = new ItemPedido("Produto A", 2, 10.0);
        ItemPedido item2 = new ItemPedido("Produto B", 3, 15.0);

        Pedido pedido = new Pedido(1);
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        Pedido pedidoClone = pedido.clone();
        pedidoClone.setNumeroPedido(2);
        pedidoClone.getItens().get(0).setQuantidade(3);
        pedidoClone.adicionarItem(new ItemPedido("Produto C", 1, 20.0));

        assertEquals("Pedido{numeroPedido=1, itens=[ItemPedido{produto='Produto A', quantidade=2, precoUnitario=10.0, total=20.0}, ItemPedido{produto='Produto B', quantidade=3, precoUnitario=15.0, total=45.0}], total=65.0}", pedido.toString());
        assertEquals("Pedido{numeroPedido=2, itens=[ItemPedido{produto='Produto A', quantidade=3, precoUnitario=10.0, total=30.0}, ItemPedido{produto='Produto B', quantidade=3, precoUnitario=15.0, total=45.0}, ItemPedido{produto='Produto C', quantidade=1, precoUnitario=20.0, total=20.0}], total=95.0}", pedidoClone.toString());
    }
}
