package br.edu.atitus;

import br.edu.atitus.interfaces.Nadador;
import br.edu.atitus.interfaces.Predador;

public class Crocodilo extends Reptil implements Nadador, Predador {
    public Crocodilo(String nome, int idade) {
        super(nome,  idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rosnando");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando silenciosamente na água");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando na beira do rio");
    }
}