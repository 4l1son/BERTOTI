package com.thehecklers.sburrestdemo.controller;

import com.thehecklers.sburrestdemo.model.FuncionarioModel;
import com.thehecklers.sburrestdemo.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@CrossOrigin("*")
@RequestMapping("/funcionarios")
public class FuncionarioController {
    private final FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public Iterable<FuncionarioModel> getFuncionarios() {
        return funcionarioService.getFuncionarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioModel> getFuncionarioById(@PathVariable String id) {
        Optional<FuncionarioModel> funcionario = funcionarioService.getFuncionarioById(id);
        return funcionario.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public FuncionarioModel postFuncionario(@RequestBody FuncionarioModel funcionario) {
        return funcionarioService.postFuncionario(funcionario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionarioModel> putFuncionario(@PathVariable String id, @RequestBody FuncionarioModel funcionario) {
        return funcionarioService.putFuncionario(id, funcionario);
    }

    @PutMapping("/{id}/set-leader")
    public ResponseEntity<Void> setLeader(@PathVariable String id, @RequestBody Boolean isLeader) {
        return funcionarioService.setLeader(id, isLeader);
    }

    @DeleteMapping("/{id}")
    public void deleteFuncionario(@PathVariable String id) {
        funcionarioService.deleteFuncionario(id);
    }
}
