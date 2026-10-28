package org.example;

public class TipoPedidoImovel implements TipoPedido {

    private static TipoPedidoImovel tipoPedidoImovel = new TipoPedidoImovel();

    private TipoPedidoImovel() {};

    public static TipoPedidoImovel getTipoPedidoImovel() {
        return tipoPedidoImovel;
    }
}
