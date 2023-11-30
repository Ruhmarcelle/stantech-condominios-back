package br.com.impacta.meucondominio.application.mapper;

import br.com.impacta.meucondominio.application.dto.response.SetorResponseDTO;
import br.com.impacta.meucondominio.domain.model.Setor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@NoArgsConstructor
public class ApplicationSetorMapper {
    public List<SetorResponseDTO> setorToSetorResponseDTO(List<Setor> listSetor) {
        return (List<SetorResponseDTO>) listSetor.stream().map(e -> {
             return SetorResponseDTO.builder()
                    .id(e.getId())
                    .nome(e.getNome())
                    .build();
        }).toList();
    }
}
