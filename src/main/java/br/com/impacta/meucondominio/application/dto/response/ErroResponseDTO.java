package br.com.impacta.meucondominio.application.dto.response;

import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class ErroResponseDTO {
	
	private List<String> errors;

	public ErroResponseDTO(List<String> listaErrors){
		this.errors = listaErrors;
	}
	
	public ErroResponseDTO(String menssagemErro){
		this.errors = Arrays.asList(menssagemErro);
	}
	
}

