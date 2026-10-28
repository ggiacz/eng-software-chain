package org.example;

public class TipoPedidoAcoes implements TipoPedido {

    private static TipoPedidoAcoes tipoPedidoAcoes = new TipoPedidoAcoes();

    private TipoPedidoAcoes() {};

    public static TipoPedidoAcoes getTipoPedidoAcoes() {
        return tipoPedidoAcoes;
    }
}
