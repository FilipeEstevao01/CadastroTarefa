package com.example.CadastroTarefa.repository;

import com.example.CadastroTarefa.entity.CadastroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CadastroRepository extends JpaRepository<CadastroEntity, Long> {

    void deleteAllById(Long id);

    void setStatus(String concluida);
}




