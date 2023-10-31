package com.thehecklers.sburrestdemo.model;

import java.util.List;

public class EquipeModel {
    
    private String nomeLider;
    private List<FuncionarioModel> funcionarios;
    
    public String getNomeLider() {
        return nomeLider;
    }
    public void setNomeLider(String nomeLider) {
        this.nomeLider = nomeLider;
    }
    public List<FuncionarioModel> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(List<FuncionarioModel> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
