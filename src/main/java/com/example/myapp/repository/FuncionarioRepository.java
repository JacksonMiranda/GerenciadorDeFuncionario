package com.example.myapp.repository;

import com.example.myapp.model.Funcionario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class FuncionarioRepository {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public List<Funcionario> findAll() {
        return new ArrayList<>(funcionarios);
    }

    public void save(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void deleteByName(String nome) {
        funcionarios.removeIf(f -> f.getNome().equalsIgnoreCase(nome));
    }

    public Funcionario findByNome(String nome) {
        return funcionarios.stream()
                .filter(f -> f.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
