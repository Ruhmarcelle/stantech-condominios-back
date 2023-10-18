package br.com.impacta.meucondominio.application.mapper;

import br.com.impacta.meucondominio.application.dto.request.LoginRequestDTO;
import br.com.impacta.meucondominio.application.dto.response.LoginResponseDTO;
import br.com.impacta.meucondominio.domain.model.Login;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class ApplicationLoginMapper {

    public Login LoginRequestDTOToLogin(LoginRequestDTO loginRequestDTO){
        return Login.builder()
                .email(loginRequestDTO.getEmail())
                .senha(loginRequestDTO.getSenha())
                .build();
    }

    public LoginResponseDTO LoginToLoginResponseDTO(Login Login){
        return LoginResponseDTO.builder()
                .mensagem(Login.getMensagem())
                .build();
    }
}
