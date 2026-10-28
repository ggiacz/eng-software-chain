package org.example;

public class AprovadorDiretor extends Aprovador {

    public AprovadorDiretor(Aprovador superior) {
        listaPedidos.add(TipoPedidoVeiculo.getTipoPedidoVeiculo());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }
}
