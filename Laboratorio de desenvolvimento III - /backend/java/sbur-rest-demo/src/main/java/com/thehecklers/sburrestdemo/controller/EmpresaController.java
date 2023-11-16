package com.thehecklers.sburrestdemo.controller;

import com.thehecklers.sburrestdemo.model.EmpresaModel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/empresa")
public class EmpresaController {

    private List<EmpresaModel> empresas = new ArrayList<>();

    @PostMapping
    public EmpresaModel criarEmpresa(@RequestBody EmpresaModel empresa) {
        empresas.add(empresa);
        return empresa;
    }

    @GetMapping
    public List<EmpresaModel> obterEmpresas() {
        return empresas;
    }

    @GetMapping("/{id}")
    public EmpresaModel obterEmpresaPorId(@PathVariable Long id) {
        return empresas.stream()
                .filter(empresa -> empresa.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PutMapping("/{id}")
    public EmpresaModel editarEmpresa(@PathVariable Long id, @RequestBody EmpresaModel empresa) {
        for (EmpresaModel emp : empresas) {
            if (emp.getId().equals(id)) {
                emp.setNome(empresa.getNome());
                emp.setRamo(empresa.getRamo());
                return emp;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
public ResponseEntity<?> deletarEmpresa(@PathVariable Long id) {
    EmpresaModel empresaParaDeletar = null;

    for (EmpresaModel emp : empresas) {
        if (emp.getId().equals(id)) {
            empresaParaDeletar = emp;
            break;
        }
    }

    if (empresaParaDeletar != null) {
        empresas.remove(empresaParaDeletar);
        return ResponseEntity.ok().build();
    } else {
        // Caso a empresa não seja encontrada, retorna um status 404 (Not Found)
        return ResponseEntity.notFound().build();
    }
}


}
