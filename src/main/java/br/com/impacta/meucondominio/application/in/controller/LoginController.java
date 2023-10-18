package br.com.impacta.meucondominio.application.in.controller;

import br.com.impacta.meucondominio.application.dto.request.LoginRequestDTO;
import br.com.impacta.meucondominio.application.facade.CadastroFacade;
import br.com.impacta.meucondominio.application.facade.LoginFacade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginFacade loginFacade;

    @PostMapping("/validar")
    public ResponseEntity validar(@RequestBody @Valid LoginRequestDTO loginRequestDTO){
        return ResponseEntity.ok(loginFacade.validar(loginRequestDTO));
    }

    @PostMapping
    public ResponseEntity salvar(@RequestBody @Valid LoginRequestDTO loginRequestDTO){
        return ResponseEntity.ok(loginFacade.salvar(loginRequestDTO));
    }
}
