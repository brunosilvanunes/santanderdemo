package br.com.alura.santanderdemo.service;

import br.com.alura.santanderdemo.exception.ClienteNaoEncontradoException;
import br.com.alura.santanderdemo.model.ClienteDTO;

import java.util.List;

public interface ClienteService {

    ClienteDTO cadastro(ClienteDTO clienteDTO);
    List<ClienteDTO> listar();
    ClienteDTO atualiza(Long id, ClienteDTO clienteDTO) throws ClienteNaoEncontradoException;
    void deleta(Long id);
}
