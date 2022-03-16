package br.com.senai.model;

import java.util.ArrayList;

public class Pedido {
    private String descricao;
    private String data;
    private double total;
    private ArrayList<ItensdoPedido> items;

    public Pedido(){
        items = new ArrayList<>();
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public void setItem(Produto produto, int qtde){

        ItensdoPedido itensdoPedido = new ItensdoPedido();
        itensdoPedido.setProdutos(produto);
        itensdoPedido.setQuantidade(qtde);
        total += produto.getPreco() * qtde;

        items.add(itensdoPedido);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "descricao:'" + descricao + '\'' +
                ", data:'" + data + '\'' +
                ", preço a pagar: " + total +
                ",  " + items +
                '}';
    }
}
