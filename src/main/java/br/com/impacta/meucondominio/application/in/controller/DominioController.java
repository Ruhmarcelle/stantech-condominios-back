package br.com.impacta.meucondominio.application.in.controller;

import br.com.impacta.meucondominio.application.dto.request.LoginRequestDTO;
import br.com.impacta.meucondominio.application.facade.LoginFacade;
import br.com.impacta.meucondominio.domain.enums.EstadosEnum;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dominio")
//@RequiredArgsConstructor
public class DominioController {

    @GetMapping("/estados")
    public ResponseEntity consultar(){
        return ResponseEntity.ok(EstadosEnum.getEstados());
    }
}
