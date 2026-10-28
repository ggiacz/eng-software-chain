import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PedidoTest {
    AprovadorPresidente presidente;
    AprovadorDiretor diretor;
    AprovadorGerente gerente;
    AprovadorSupervisor supervisor;

    @BeforeEach
    void setUp() {
        presidente = new AprovadorPresidente(null);
        diretor = new AprovadorDiretor(presidente);
        gerente = new AprovadorGerente(diretor);
        supervisor = new AprovadorSupervisor(gerente);
    }

    @Test
    void deveRetornarSupervisorParaPedidoMaterialEscritorio() {
        assertEquals("Supervisor", supervisor.aprovarPedido(new Pedido(TipoPedidoMaterialEscritorio.getTipoPedidoMaterialEscritorio())));
    }

    @Test
    void deveRetornarGerenteParaPedidoEquipamento() {
        assertEquals("Gerente", supervisor.aprovarPedido(new Pedido(TipoPedidoEquipamento.getTipoPedidoEquipamento())));
    }

    @Test
    void deveRetornarDiretorParaPedidoVeiculo() {
        assertEquals("Diretor", supervisor.aprovarPedido(new Pedido(TipoPedidoVeiculo.getTipoPedidoVeiculo())));
    }

    @Test
    void deveRetornarPresidenteParaPedidoImovel() {
        assertEquals("Presidente", supervisor.aprovarPedido(new Pedido(TipoPedidoImovel.getTipoPedidoImovel())));
    }

    @Test
    void deveRetornarSemAprovacaoParaPedidoAcoes() {
        assertEquals("Sem aprovação", supervisor.aprovarPedido(new Pedido(TipoPedidoAcoes.getTipoPedidoAcoes())));
    }

}
