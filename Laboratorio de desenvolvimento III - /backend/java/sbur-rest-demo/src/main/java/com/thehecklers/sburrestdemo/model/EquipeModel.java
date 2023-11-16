package com.thehecklers.sburrestdemo.model;

import java.util.List;

public class EquipeModel {
    
    private Long id;

    private String liderNome;

    private List<FuncionarioModel> funcionarios;

    // Constructors, getters, and setters

    // Example constructor and getters/setters
    public EquipeModel() {}

    public EquipeModel(String liderNome, List<FuncionarioModel> funcionarios) {
        this.liderNome = liderNome;
        this.funcionarios = funcionarios;
    }

    public List<FuncionarioModel> getFuncionarios() {
        return funcionarios;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLiderNome() {
        return liderNome;
    }

    public void setLiderNome(String liderNome) {
        this.liderNome = liderNome;
    }

    public void setFuncionarios(List<FuncionarioModel> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
