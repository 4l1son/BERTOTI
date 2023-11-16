package com.thehecklers.sburrestdemo.model;

public class FuncionarioModel {
    private Long id;
    private String name;

    public FuncionarioModel() {}

    public FuncionarioModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
