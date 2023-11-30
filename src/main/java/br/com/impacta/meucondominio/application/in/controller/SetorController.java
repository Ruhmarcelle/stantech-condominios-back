package br.com.impacta.meucondominio.application.in.controller;

import br.com.impacta.meucondominio.application.dto.request.SolicitacaoRequestDTO;
import br.com.impacta.meucondominio.application.facade.SetorFacade;
import br.com.impacta.meucondominio.application.facade.SolicitacaoFacade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/setor")
@RequiredArgsConstructor
public class SetorController {

    private final SetorFacade setorFacade;

    @GetMapping("/consultar")
    public ResponseEntity consultar(){
        return ResponseEntity.ok(setorFacade.consultar());
    }
}
