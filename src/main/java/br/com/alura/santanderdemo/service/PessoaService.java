package br.com.alura.santanderdemo.service;

import br.com.alura.santanderdemo.model.Pessoa;
import br.com.alura.santanderdemo.model.PessoaDTO;
import br.com.alura.santanderdemo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public PessoaDTO cadastrar(PessoaDTO pessoaDTO) {
        Pessoa pessoa = new Pessoa();

        pessoa.setEmail(pessoaDTO.getEmail());
        pessoa.setNome(pessoaDTO.getNome());
        pessoa.setSenha(pessoaDTO.getSenha());
        pessoa.setTelefone(pessoaDTO.getTelefone());

        repository.save(pessoa);

        return pessoaDTO;
    }
}
