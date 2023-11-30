package br.com.impacta.meucondominio.domain.port.out;

import br.com.impacta.meucondominio.domain.model.Setor;
import br.com.impacta.meucondominio.domain.model.Solicitacao;

import java.util.List;

public interface SetorRepository {

    public List<Setor> consultar();
}
