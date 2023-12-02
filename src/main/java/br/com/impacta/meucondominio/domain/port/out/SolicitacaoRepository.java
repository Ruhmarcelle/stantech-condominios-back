package br.com.impacta.meucondominio.domain.port.out;

import br.com.impacta.meucondominio.domain.model.Solicitacao;
import br.com.impacta.meucondominio.infrastructure.entity.SolicitacaoEntity;

import java.util.List;

public interface SolicitacaoRepository {

    public void salvar(Solicitacao solicitacao);
    public Solicitacao consultar(String idSolicitacao);

    public List<Solicitacao> listar(String idUsuario);
}
