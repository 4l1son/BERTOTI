package com.thehecklers.sburrestdemo.service;

import com.thehecklers.sburrestdemo.model.EmpresaModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {
    private List<EmpresaModel> empresas = new ArrayList<>();

    public List<EmpresaModel> getAllEmpresas() {
        return empresas;
    }

    public EmpresaModel getEmpresa(String nome) {
        return empresas.stream()
                .filter(empresa -> empresa.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }

    public void createEmpresa(EmpresaModel empresa) {
        empresas.add(empresa);
    }

    public void updateEmpresa(EmpresaModel empresa) {
        deleteEmpresa(empresa.getNome());
        empresas.add(empresa);
    }

    public void deleteEmpresa(String nome) {
        empresas.removeIf(empresa -> empresa.getNome().equals(nome));
    }
}
