package br.com.senai.model;

public class ItensdoPedido {
    private Produto produtos;
    private int quantidade;

    public Produto getProdutos() {
        return produtos;
    }
    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItensdoPedido{" +
                "" + produtos +
                ", quantidade=" + quantidade +
                '}';
    }
}
