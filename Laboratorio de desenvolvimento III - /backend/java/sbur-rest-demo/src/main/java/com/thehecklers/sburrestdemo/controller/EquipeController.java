package com.thehecklers.sburrestdemo.controller;

import com.thehecklers.sburrestdemo.model.EquipeModel;
import com.thehecklers.sburrestdemo.model.FuncionarioModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin("*")

@RequestMapping("/equipe")
public class EquipeController {

    private List<EquipeModel> equipes = new ArrayList<>();

    @PostMapping
    public EquipeModel cadastrarLider(@RequestBody EquipeModel equipe) {
        equipes.add(equipe);
        return equipe;
    }

    @GetMapping
    public List<EquipeModel> getEquipes() {
        return equipes;
    }

    @GetMapping("/{id}")
    public EquipeModel getEquipeById(@PathVariable Long id) {
        return equipes.stream()
                .filter(equipe -> equipe.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PutMapping("/{id}")
    public EquipeModel editarLider(@PathVariable Long id, @RequestBody EquipeModel equipe) {
        for (EquipeModel eq : equipes) {
            if (eq.getId().equals(id)) {
                eq.setLiderNome(equipe.getLiderNome());
                return eq;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarEquipe(@PathVariable Long id) {
        equipes.removeIf(equipe -> equipe.getId().equals(id));
    }

    @PostMapping("/{id}/adicionar-funcionario")
    public EquipeModel adicionarFuncionario(@PathVariable Long id, @RequestBody FuncionarioModel funcionario) {
        for (EquipeModel equipe : equipes) {
            if (equipe.getId().equals(id)) {
                equipe.getFuncionarios().add(funcionario);
                return equipe;
            }
        }
        return null;
    }
}
