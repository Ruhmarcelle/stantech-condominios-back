package br.com.impacta.meucondominio.domain.port.out;

import br.com.impacta.meucondominio.domain.model.Estados;
import br.com.impacta.meucondominio.domain.model.Setor;

import java.util.List;

public interface EstadosRepository {

    public List<Estados> consultar();
}
