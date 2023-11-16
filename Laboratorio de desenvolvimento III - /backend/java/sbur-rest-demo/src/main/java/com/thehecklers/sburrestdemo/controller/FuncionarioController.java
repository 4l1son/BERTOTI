package com.thehecklers.sburrestdemo.controller;

import com.thehecklers.sburrestdemo.model.FuncionarioModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")

@RequestMapping("/funcionario")
public class FuncionarioController {

    private List<FuncionarioModel> funcionarios = new ArrayList<>();

    @PostMapping
    public FuncionarioModel cadastrarFuncionario(@RequestBody FuncionarioModel funcionario) {
        funcionarios.add(funcionario);
        return funcionario;
    }

    @GetMapping
    public List<FuncionarioModel> getFuncionarios() {
        return funcionarios;
    }

    @GetMapping("/{id}")
    public FuncionarioModel getFuncionarioById(@PathVariable Long id) {
        return funcionarios.stream()
                .filter(func -> func.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PutMapping("/{id}")
    public FuncionarioModel editarFuncionario(@PathVariable Long id, @RequestBody FuncionarioModel funcionario) {
        for (FuncionarioModel func : funcionarios) {
            if (func.getId().equals(id)) {
                func.setName(funcionario.getName());
                return func;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarFuncionario(@PathVariable Long id) {
        funcionarios.removeIf(funcionario -> funcionario.getId().equals(id));
    }
}
