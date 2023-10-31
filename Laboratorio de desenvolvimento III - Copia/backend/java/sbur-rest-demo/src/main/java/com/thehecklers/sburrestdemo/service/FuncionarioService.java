package com.thehecklers.sburrestdemo.service;


import com.thehecklers.sburrestdemo.model.FuncionarioModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FuncionarioService {
    private List<FuncionarioModel> funcionarios = new ArrayList<>();

    public FuncionarioService() {
        funcionarios.addAll(List.of(
            new FuncionarioModel("Funcionário 1"),
            new FuncionarioModel("Funcionário 2"),
            new FuncionarioModel("Funcionário 3"),
            new FuncionarioModel("Funcionário 4")
        ));
    }

    public Iterable<FuncionarioModel> getFuncionarios() {
        return funcionarios;
    }

    public Optional<FuncionarioModel> getFuncionarioById(String id) {
        return funcionarios.stream()
            .filter(funcionario -> funcionario.getId().equals(id))
            .findFirst();
    }

    public FuncionarioModel postFuncionario(FuncionarioModel funcionario) {
        funcionario.setId(UUID.randomUUID().toString()); // Gere um novo ID
        funcionarios.add(funcionario);
        return funcionario;
    }

    public ResponseEntity<FuncionarioModel> putFuncionario(String id, FuncionarioModel funcionario) {
        Optional<FuncionarioModel> existingFuncionario = getFuncionarioById(id);

        if (existingFuncionario.isPresent()) {
            FuncionarioModel existing = existingFuncionario.get();
            existing.setName(funcionario.getName());
            return new ResponseEntity<>(existing, HttpStatus.OK);
        } else {
            funcionario.setId(UUID.randomUUID().toString()); // Gere um novo ID
            funcionarios.add(funcionario);
            return new ResponseEntity<>(funcionario, HttpStatus.CREATED);
        }
    }

    public ResponseEntity<Void> setLeader(String id, boolean isLeader) {
        Optional<FuncionarioModel> funcionarioOptional = getFuncionarioById(id);

        if (funcionarioOptional.isPresent()) {
            FuncionarioModel funcionario = funcionarioOptional.get();
            funcionario.setLeader(isLeader);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public void deleteFuncionario(String id) {
        funcionarios.removeIf(funcionario -> funcionario.getId().equals(id));
    }
}
