package org.example;

public class AprovadorGerente extends Aprovador {

    public AprovadorGerente(Aprovador superior) {
        listaPedidos.add(TipoPedidoEquipamento.getTipoPedidoEquipamento());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}
