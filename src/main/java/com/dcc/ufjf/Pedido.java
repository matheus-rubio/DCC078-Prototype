package com.dcc.ufjf;

import java.util.ArrayList;

public class Pedido implements Cloneable {
    private int numeroPedido;
    private ArrayList<ItemPedido> itens;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }
    
    public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public void setItens(ArrayList<ItemPedido> itens) {
		this.itens = itens;
	}

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

	public Double calcularTotal() {
        Double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.calcularTotal();
        }
        return total;
    }

    @Override
    public Pedido clone() throws CloneNotSupportedException {
        Pedido pedidoClone = (Pedido) super.clone();
        pedidoClone.itens = new ArrayList<>();
        for (ItemPedido item : itens) {
            pedidoClone.itens.add(item.clone());
        }
        return pedidoClone;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + this.numeroPedido +
                ", itens=" + this.itens +
                ", total=" + this.calcularTotal() +
                '}';
    }
}


