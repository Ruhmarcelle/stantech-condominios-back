package br.com.impacta.meucondominio.infrastructure.mapper;

import br.com.impacta.meucondominio.domain.model.Login;
import br.com.impacta.meucondominio.infrastructure.entity.LoginEntity;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class InfrastructureLoginMapper {

    public Login LoginEntityToLogin(LoginEntity loginEntity){

        return Login.builder()
                .senha(loginEntity.getSenha())
                .build();
    }

    public LoginEntity loginToLoginEntity(Login login){

        return LoginEntity.builder()
                .id(login.getId())
                .email(login.getEmail())
                .senha(login.getSenha())
                .build();
    }
}
