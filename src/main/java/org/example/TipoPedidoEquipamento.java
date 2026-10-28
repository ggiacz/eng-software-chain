package org.example;

public class TipoPedidoEquipamento implements TipoPedido {

    private static TipoPedidoEquipamento tipoPedidoEquipamento = new TipoPedidoEquipamento();

    private TipoPedidoEquipamento() {};

    public static TipoPedidoEquipamento getTipoPedidoEquipamento() {
        return tipoPedidoEquipamento;
    }
}
