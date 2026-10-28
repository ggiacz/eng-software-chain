package org.example;

public class TipoPedidoMaterialEscritorio implements TipoPedido {

    private static TipoPedidoMaterialEscritorio tipoPedidoMaterialEscritorio = new TipoPedidoMaterialEscritorio();

    private TipoPedidoMaterialEscritorio() {};

    public static TipoPedidoMaterialEscritorio getTipoPedidoMaterialEscritorio() {
        return tipoPedidoMaterialEscritorio;
    }
}
