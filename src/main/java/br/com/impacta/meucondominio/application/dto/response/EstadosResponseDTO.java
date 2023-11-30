package br.com.impacta.meucondominio.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
@Builder
public class EstadosResponseDTO implements Serializable {

    private static final long serialVersionUID = 5861770353373330863L;
    private int id;
    private String nome;
    private String sigla;
}
