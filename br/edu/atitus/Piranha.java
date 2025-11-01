package br.edu.atitus;

import br.edu.atitus.interfaces.Nadador;
import br.edu.atitus.interfaces.Predador;

public class Piranha extends Peixe implements Nadador, Predador {
    public Piranha(String nome, int idade) {
        super(nome, idade, "doce");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está movimentando suas mandíbulas");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em cardume");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando em grupo no rio");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está devorando sua presa com seus dentes afiados");
    }
}