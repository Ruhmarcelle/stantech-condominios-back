package br.com.impacta.meucondominio.application.mapper;

import br.com.impacta.meucondominio.application.dto.response.EstadosResponseDTO;
import br.com.impacta.meucondominio.domain.model.Estados;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@NoArgsConstructor
public class ApplicationEstadosMapper {
    public List<EstadosResponseDTO> setorToSetorResponseDTO(List<Estados> listEstados) {
        return listEstados.stream().map(e -> {
            return EstadosResponseDTO.builder()
                    .id(e.getId())
                    .nome(e.getNome())
                    .sigla(e.getSigla())
                    .build();
        }).toList();
    }
}
