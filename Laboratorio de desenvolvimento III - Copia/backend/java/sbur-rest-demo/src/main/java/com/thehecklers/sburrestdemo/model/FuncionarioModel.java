package com.thehecklers.sburrestdemo.model;

import java.util.UUID;


public class FuncionarioModel {
    private final String id;
    private String name;
    private boolean leader;

    public FuncionarioModel(String id, String name, boolean leader) {
        this.id = id;
        this.name = name;
        this.leader = leader;
    }

    public FuncionarioModel(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.leader = false; // Definimos leader como false por padrão
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLeader() {
        return leader;
    }

    public void setLeader(boolean leader) {
        this.leader = leader;
    }

    public void setId(String string) {
    }
}
