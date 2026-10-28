package org.example;

public class TipoPedidoVeiculo implements TipoPedido {

    private static TipoPedidoVeiculo tipoPedidoVeiculo = new TipoPedidoVeiculo();

    private TipoPedidoVeiculo() {};

    public static TipoPedidoVeiculo getTipoPedidoVeiculo() {
        return tipoPedidoVeiculo;
    }
}
