package br.com.impacta.meucondominio.application.in.controller.advice;

import br.com.impacta.meucondominio.application.dto.response.ErroResponseDTO;
import br.com.impacta.meucondominio.domain.exception.ApiErros;
import br.com.impacta.meucondominio.domain.exception.LoginException;
import br.com.impacta.meucondominio.domain.exception.RegraNegocioException;
import br.com.impacta.meucondominio.domain.exception.SolicitacaoNaoEncontradaException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ApplicationControllerAdvice {

	@ExceptionHandler(RegraNegocioException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErroResponseDTO handleRegraNegocioException(RegraNegocioException ex) {
		
		String mensagemErro = ex.getMessage();
		
		return new ErroResponseDTO(mensagemErro);
	}

	@ExceptionHandler(SolicitacaoNaoEncontradaException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ApiErros handleTransacaoNotFoundException(SolicitacaoNaoEncontradaException ex) {

		return new ApiErros(ex.getMessage());
	}

	@ExceptionHandler(LoginException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErroResponseDTO handleRegraNegocioException(LoginException ex) {

		String mensagemErro = ex.getMessage();

		return new ErroResponseDTO(mensagemErro);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErroResponseDTO handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		
		List<String> errors = ex.getBindingResult()
			.getAllErrors()
			.stream()
			.map( erro -> erro.getDefaultMessage())
			.collect(Collectors.toList());
		
		return new ErroResponseDTO(errors);
	}
}