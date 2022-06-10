package com.projetoDU.ProjetoDigitoUnico.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projetoDU.ProjetoDigitoUnico.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}