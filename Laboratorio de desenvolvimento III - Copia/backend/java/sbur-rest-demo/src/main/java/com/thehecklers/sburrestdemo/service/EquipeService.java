package com.thehecklers.sburrestdemo.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;


@Service
public class EquipeService {
    private Map<String, String> equipes = new HashMap<>();

    public Optional<String> getNomeLiderEquipe(String nomeEquipe) {
        return Optional.ofNullable(equipes.get(nomeEquipe));
    }

    public void criarEquipe(String nomeEquipe, String nomeLider) {
        equipes.put(nomeEquipe, nomeLider);
    }

    public Optional<String> atualizarLiderEquipe(String nomeEquipe, String novoLider) {
        if (equipes.containsKey(nomeEquipe)) {
            equipes.put(nomeEquipe, novoLider);
            return Optional.of(novoLider);
        }
        return Optional.empty();
    }

    public void excluirEquipe(String nomeEquipe) {
        equipes.remove(nomeEquipe);
    }
}
