package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacaoRepository extends JpaRepository<Educacao, Long> {
    // Adicione métodos personalizados do repositório, se necessário
}
