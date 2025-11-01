package br.edu.atitus;

import br.edu.atitus.interfaces.Nadador;
import br.edu.atitus.interfaces.Predador;

public class Tubarao extends Peixe implements Nadador, Predador {
    public Tubarao(String nome, int idade) {
        super(nome, idade, "salgada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está nadando silenciosamente");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em busca de presas");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando no oceano profundo");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está se alimentando de peixes menores");
    }
}