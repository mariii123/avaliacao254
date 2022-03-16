package br.com.senai;

import br.com.senai.model.ItensdoPedido;
import br.com.senai.model.Pedido;
import br.com.senai.model.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("agua");
        produto1.setPreco(2.50);

        Produto produto2 = new Produto();
        produto2.setNome("feijao");
        produto2.setPreco(8.50);

        Produto produto3 = new Produto();
        produto3.setNome("pao");
        produto3.setPreco(3);

        Produto produto4 = new Produto();
        produto4.setNome("bolacha");
        produto4.setPreco(2.80);

        Produto produto5 = new Produto();
        produto5.setNome("bolo");
        produto5.setPreco(10.50);

        Produto produto6 = new Produto();
        produto6.setNome("suco");
        produto6.setPreco(4.50);

        Produto produto7 = new Produto();
        produto7.setNome("geladeira");
        produto7.setPreco(1700);

        Produto produto8 = new Produto();
        produto8.setNome("celular");
        produto8.setPreco(540);

        Produto produto9 = new Produto();
        produto9.setNome("batedeira");
        produto9.setPreco(89);

        Produto produto10 = new Produto();
        produto10.setNome("pao de queijo");
        produto10.setPreco(4);

        Produto produto11 = new Produto();
        produto11.setNome("roladinho");
        produto11.setPreco(6);

        Produto produto12 = new Produto();
        produto12.setNome("coxinha");
        produto12.setPreco(6);

        Produto produto13 = new Produto();
        produto13.setNome("cenoura");
        produto13.setPreco(1.70);

        Produto produto14 = new Produto();
        produto14.setNome("alface");
        produto14.setPreco(4.20);

        Produto produto15 = new Produto();
        produto15.setNome("batata");
        produto15.setPreco(2.70);

        Produto produto16 = new Produto();
        produto16.setNome("tomate");
        produto16.setPreco(3);

        Produto produto17 = new Produto();
        produto17.setNome("melancia");
        produto17.setPreco(11.50);

        Produto produto18 = new Produto();
        produto18.setNome("abacaxi");
        produto18.setPreco(2.50);

        Produto produto19 = new Produto();
        produto19.setNome("esponja");
        produto19.setPreco(6);

        Produto produto20 = new Produto();
        produto20.setNome("detergente");
        produto20.setPreco(5);

        Pedido pedido1 = new Pedido();
        pedido1.setData("16/3/22");
        pedido1.setDescricao("uhul");
        pedido1.setItem(produto1,10);

        System.out.println(pedido1);

        Pedido pedido2 = new Pedido();
        pedido2.setData("16/3/22");
        pedido2.setDescricao("luhu");
        pedido2.setItem(produto2,10);

        System.out.println(pedido2);
    }
}
