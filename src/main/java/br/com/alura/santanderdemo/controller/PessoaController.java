package br.com.alura.santanderdemo.controller;

import br.com.alura.santanderdemo.model.PessoaDTO;
import br.com.alura.santanderdemo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastrar")
@CrossOrigin
public class PessoaController {

        @Autowired
        private PessoaService service;

        @PostMapping()
        public ResponseEntity<PessoaDTO> cadastro(@RequestBody PessoaDTO pessoaDTO) {
                return ResponseEntity.ok(service.cadastrar(pessoaDTO));

        }


}
