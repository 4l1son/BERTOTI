package com.thehecklers.sburrestdemo.model;

public class EmpresaModel {

    private Long id;
    private String nome;
    private String ramo;

    public EmpresaModel() {
        // Construtor padrão necessário para deserialização JSON
    }

    public EmpresaModel(Long id, String nome, String ramo) {
        this.id = id;
        this.nome = nome;
        this.ramo = ramo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }
}
