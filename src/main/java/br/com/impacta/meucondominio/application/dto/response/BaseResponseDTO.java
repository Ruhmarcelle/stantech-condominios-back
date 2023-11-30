package br.com.impacta.meucondominio.application.dto.response;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder(toBuilder = true)
public class BaseResponseDTO implements Serializable {

    private static final long serialVersionUID = -2464565578720059696L;
    private int id;
    private String nome;
}
