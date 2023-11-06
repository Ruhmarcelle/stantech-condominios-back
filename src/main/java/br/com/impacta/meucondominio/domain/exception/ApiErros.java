package br.com.impacta.meucondominio.domain.exception;

import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class ApiErros {
	
	private List<String> errors;

	public ApiErros(List<String> listaErrors){
		this.errors = listaErrors;
	}
	
	public ApiErros(String menssagemErro){
		this.errors = Arrays.asList(menssagemErro);
	}
	
}

