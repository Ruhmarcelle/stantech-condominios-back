package br.com.impacta.meucondominio.application.mapper;

import br.com.impacta.meucondominio.application.dto.response.AreaComumResponseDTO;
import br.com.impacta.meucondominio.domain.model.AreaComum;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationAreaComumMapper {
    public List<AreaComumResponseDTO> areaComumToAreaComumResponseDTO(List<AreaComum> listAareaComum) {
        return (List<AreaComumResponseDTO>) listAareaComum.stream().map(e -> {
            return AreaComumResponseDTO.builder()
                    .id(e.getId())
                    .nome(e.getNome())
                    .build();
        }).toList();
    }
}
