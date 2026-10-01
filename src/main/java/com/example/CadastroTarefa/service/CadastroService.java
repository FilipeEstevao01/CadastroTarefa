package com.example.CadastroTarefa.service;

import com.example.CadastroTarefa.entity.CadastroEntity;
import com.example.CadastroTarefa.repository.CadastroRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Setter
@Service
public class CadastroService {

    private final CadastroRepository cadastroRepository;

    public CadastroService(CadastroRepository cadastroRepository) {
        this.cadastroRepository = cadastroRepository;
    }

    //Cadastrar tarefa
    public CadastroEntity cadastrar(CadastroEntity cadastro) {
        return cadastroRepository.save(cadastro);
    }

    //Consultar tardefa pelo id
    public CadastroEntity consultarPorId(Long id) {
        return cadastroRepository.findById(id).orElse(null);
    }

    //Listar todas as tarefas
    public List<CadastroEntity> listarTodos() {
        return cadastroRepository.findAll();
    }

    //Atualizar tarefa
    public CadastroEntity atualizar(CadastroEntity cadastro) {
        return cadastroRepository.save(cadastro);
    }

    //Excluir tarefa
    public void excluir(Long id) {
        cadastroRepository.deleteById(id);
    }

    //Concluir tarefa
    public CadastroEntity concluir (Long id) {

        CadastroEntity cadastro = cadastroRepository.findById(id).orElse(null);

        if (cadastro != null) {

        //Descobrir por que o setStatus não funcio
        cadastro.setStatus("CONCLUÍDA");
        cadastroRepository.save(cadastro);
    }

  }
}

