package br.edu.atitus;

import br.edu.atitus.interfaces.Nadador;
import br.edu.atitus.interfaces.Predador;

public class Orca extends Mamifero implements Nadador, Predador {
    public Orca(String nome, int idade) {
        super(nome, idade, false);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo sons de ecolocalização");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em grupo");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando em grupo no oceano");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está se alimentando de peixes e focas");
    }
}