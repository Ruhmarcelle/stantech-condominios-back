package br.com.impacta.meucondominio.application.facade;

import br.com.impacta.meucondominio.application.dto.request.LoginRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.LoginResponseDTO;

public interface LoginFacade {
    public LoginResponseDTO salvar(LoginRequestDTO loginRequestDTO);

    public LoginResponseDTO validar(LoginRequestDTO loginRequestDTO);
}
