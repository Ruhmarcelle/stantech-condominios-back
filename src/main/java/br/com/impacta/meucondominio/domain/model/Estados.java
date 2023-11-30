package br.com.impacta.meucondominio.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder(toBuilder = true)
public class Estados extends ModeloBase {
    private String sigla;
}
