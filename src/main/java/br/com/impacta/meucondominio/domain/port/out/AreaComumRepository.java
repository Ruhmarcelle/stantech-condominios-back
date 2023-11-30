package br.com.impacta.meucondominio.domain.port.out;

import br.com.impacta.meucondominio.domain.model.AreaComum;

import java.util.List;

public interface AreaComumRepository {

    public List<AreaComum> consultar();
}
