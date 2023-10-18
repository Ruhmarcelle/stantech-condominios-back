package br.com.impacta.meucondominio.domain.port.out;

import br.com.impacta.meucondominio.domain.model.Solicitacao;
import br.com.impacta.meucondominio.infrastructure.entity.SolicitacaoEntity;

public interface SolicitacaoRepository {

    public void salvar(Solicitacao solicitacao);
    public Solicitacao consultar(String idSolicitacao);
}
