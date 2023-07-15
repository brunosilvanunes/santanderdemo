package br.com.alura.santanderdemo.controller;

import br.com.alura.santanderdemo.exception.ClienteNaoEncontradoException;
import br.com.alura.santanderdemo.model.ClienteDTO;
import br.com.alura.santanderdemo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping("/listar")
    public List<ClienteDTO> listaClientes() {

        return service.listar();
    }

    @PostMapping
    public ClienteDTO cadastro(@RequestBody ClienteDTO clienteDTO) {
        return service.cadastro(clienteDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteDTO> atualizar(@PathVariable("id") Long id, @RequestBody ClienteDTO clienteDTO) throws ClienteNaoEncontradoException {
        return ResponseEntity.ok(service.atualiza(id, clienteDTO));
    }
    @DeleteMapping("/{id}")
    public void deletaCliente(@PathVariable("id") Long id){
        service.deleta(id);
    }
}
