package br.com.alura.santanderdemo.service.impl;

import br.com.alura.santanderdemo.exception.ClienteNaoEncontradoException;
import br.com.alura.santanderdemo.model.ClienteDTO;
import br.com.alura.santanderdemo.model.ClienteEntity;
import br.com.alura.santanderdemo.repository.ClienteRepository;
import br.com.alura.santanderdemo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public List<ClienteDTO> listar() {
        List<ClienteEntity> clienteEntities = repository.findAll();

        List<ClienteDTO> clienteDTOS = new ArrayList<>();

        // teste teste teste

        clienteEntities.forEach(clienteEntity -> {
            ClienteDTO clienteDTO = new ClienteDTO();

            clienteDTO.setNome(clienteEntity.getNome());
            clienteDTO.setCpf(clienteEntity.getCpf());
            clienteDTO.setRg(clienteEntity.getRg());
            clienteDTO.setAgencia(clienteEntity.getAgencia());
            clienteDTO.setConta(clienteEntity.getConta());
            clienteDTO.setGerente(clienteEntity.getGerente());

            clienteDTOS.add(clienteDTO);
        });
        return clienteDTOS;
    }

    @Override
    public ClienteDTO atualiza(Long id, ClienteDTO clienteDTO) throws ClienteNaoEncontradoException {
        //Optional<ClienteEntity> clienteEntitiy = repository.findById(id);

        ClienteEntity cliente = repository.findByCpf(clienteDTO.getCpf());

        // cpf não encontrado !!!!!

//        if (!cliente.isPresent()) {
//            throw new ClienteNaoEncontradoException();
//        }

        cliente.setNome(clienteDTO.getNome());
        cliente.setCpf(clienteDTO.getCpf());
        cliente.setRg(clienteDTO.getRg());
        cliente.setAgencia(clienteDTO.getAgencia());
        cliente.setConta(clienteDTO.getConta());
        cliente.setGerente(clienteDTO.getGerente());

        repository.save(cliente);

        return clienteDTO;
    }

    @Override
    public void deleta(Long id){
        repository.deleteById(id);
    }

    @Override
    public ClienteDTO cadastro(ClienteDTO clienteDTO) {
        ClienteEntity cliente = new ClienteEntity();

        cliente.setNome(clienteDTO.getNome());

        cliente.setCpf(clienteDTO.getCpf());

        cliente.setRg(clienteDTO.getRg());
        cliente.setAgencia(clienteDTO.getAgencia());
        cliente.setConta(clienteDTO.getConta());
        cliente.setGerente(clienteDTO.getGerente());

        repository.save(cliente);

        return clienteDTO;
    }
}
