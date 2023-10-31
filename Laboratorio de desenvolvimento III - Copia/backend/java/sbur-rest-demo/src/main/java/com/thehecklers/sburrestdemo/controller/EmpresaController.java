package com.thehecklers.sburrestdemo.controller;

import com.thehecklers.sburrestdemo.model.EmpresaModel;
import com.thehecklers.sburrestdemo.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/empresa")
public class EmpresaController {
    private final EmpresaService empresaService;

    @Autowired
    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping("/{nome}")
    public ResponseEntity<EmpresaModel> getEmpresa(@PathVariable String nome) {
        EmpresaModel empresa = empresaService.getEmpresa(nome);
        if (empresa != null) {
            return new ResponseEntity<>(empresa, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<EmpresaModel>> getAllEmpresas() {
        List<EmpresaModel> empresas = empresaService.getAllEmpresas();
        return new ResponseEntity<>(empresas, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createEmpresa(@RequestBody EmpresaModel empresa) {
        empresaService.createEmpresa(empresa);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{nome}")
    public ResponseEntity<Void> updateEmpresa(@PathVariable String nome, @RequestBody EmpresaModel empresa) {
        EmpresaModel existingEmpresa = empresaService.getEmpresa(nome);
        if (existingEmpresa != null) {
            empresaService.updateEmpresa(empresa);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{nome}")
    public ResponseEntity<Void> deleteEmpresa(@PathVariable String nome) {
        EmpresaModel empresa = empresaService.getEmpresa(nome);
        if (empresa != null) {
            empresaService.deleteEmpresa(nome);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
