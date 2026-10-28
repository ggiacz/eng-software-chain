package org.example;

public class AprovadorPresidente extends Aprovador {

    public AprovadorPresidente(Aprovador superior) {
        listaPedidos.add(TipoPedidoImovel.getTipoPedidoImovel());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Presidente";
    }
}
