package br.com.impacta.meucondominio.application.in.controller;

import br.com.impacta.meucondominio.application.dto.request.LoginRequestDTO;
import br.com.impacta.meucondominio.application.dto.request.SolicitacaoRequestDTO;
import br.com.impacta.meucondominio.application.facade.LoginFacade;
import br.com.impacta.meucondominio.application.facade.SolicitacaoFacade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/solicitacao")
@RequiredArgsConstructor
public class SolicitacaoController {

    private final SolicitacaoFacade solicitacaoFacade;

    @PostMapping
    public ResponseEntity salvar(@RequestBody @Valid SolicitacaoRequestDTO solicitacaoRequestDTO){
        return ResponseEntity.ok(solicitacaoFacade.salvar(solicitacaoRequestDTO));
    }

    @GetMapping("/consultar/{idSolicitacao}")
    public ResponseEntity consultar(@PathVariable String idSolicitacao){
        return ResponseEntity.ok(solicitacaoFacade.consultar(idSolicitacao));
    }

    @GetMapping("/listar/{email}")
    public ResponseEntity listar(@PathVariable String email){
        return ResponseEntity.ok(solicitacaoFacade.listar(email));
    }

}
