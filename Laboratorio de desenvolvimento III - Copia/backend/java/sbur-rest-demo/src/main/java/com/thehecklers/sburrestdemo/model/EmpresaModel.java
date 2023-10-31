package com.thehecklers.sburrestdemo.model;

import java.util.Objects;

public class EmpresaModel {
    private String nome;
    private String ramo;

    public EmpresaModel() {
    }

    public EmpresaModel(String nome, String ramo) {
        this.nome = nome;
        this.ramo = ramo;
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

    @Override
    public String toString() {
        return "EmpresaModel{" +
               "nome='" + nome + '\'' +
               ", ramo='" + ramo + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpresaModel that = (EmpresaModel) o;
        return Objects.equals(nome, that.nome) && Objects.equals(ramo, that.ramo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ramo);
    }
}
