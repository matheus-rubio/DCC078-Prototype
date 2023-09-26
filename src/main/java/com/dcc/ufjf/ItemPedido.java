package com.dcc.ufjf;

public class ItemPedido implements Cloneable {
    private String produto;
    private int quantidade;
    private Double precoUnitario;

    public ItemPedido(String produto, int quantidade, Double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

	public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setProduto(String produto) {
		this.produto = produto;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

    public Double calcularTotal() {
        return quantidade * precoUnitario;
    }

    @Override
    public ItemPedido clone() throws CloneNotSupportedException {
        return (ItemPedido) super.clone();
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "produto='" + this.produto + '\'' +
                ", quantidade=" + this.quantidade +
                ", precoUnitario=" + this.precoUnitario +
                ", total=" + this.calcularTotal() +
                '}';
    }
}

