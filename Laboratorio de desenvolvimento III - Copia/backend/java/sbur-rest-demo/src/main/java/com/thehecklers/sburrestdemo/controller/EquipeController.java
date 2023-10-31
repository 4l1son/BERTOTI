package com.thehecklers.sburrestdemo.controller;

import com.thehecklers.sburrestdemo.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/equipes")
public class EquipeController {
    private final EquipeService equipeService;

    @Autowired
    public EquipeController(EquipeService equipeService) {
        this.equipeService = equipeService;
    }

    @GetMapping("/{nomeEquipe}")
    public ResponseEntity<String> getNomeLiderEquipe(@PathVariable String nomeEquipe) {
        Optional<String> liderEquipe = equipeService.getNomeLiderEquipe(nomeEquipe);
        return liderEquipe.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Void> criarEquipe(@RequestParam String nomeEquipe, @RequestParam String nomeLider) {
        equipeService.criarEquipe(nomeEquipe, nomeLider);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{nomeEquipe}")
    public ResponseEntity<Object> atualizarLiderEquipe(@PathVariable String nomeEquipe, @RequestParam String novoLider) {
        Optional<String> updatedLider = equipeService.atualizarLiderEquipe(nomeEquipe, novoLider);
        return updatedLider.map(value -> new ResponseEntity<>(HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{nomeEquipe}")
    public ResponseEntity<Void> excluirEquipe(@PathVariable String nomeEquipe) {
        equipeService.excluirEquipe(nomeEquipe);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
