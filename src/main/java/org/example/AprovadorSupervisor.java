package org.example;

public class AprovadorSupervisor extends Aprovador {

    public AprovadorSupervisor(Aprovador superior) {
        listaPedidos.add(TipoPedidoMaterialEscritorio.getTipoPedidoMaterialEscritorio());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }
}
