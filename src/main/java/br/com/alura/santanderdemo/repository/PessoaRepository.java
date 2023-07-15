package br.com.alura.santanderdemo.repository;


import br.com.alura.santanderdemo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
