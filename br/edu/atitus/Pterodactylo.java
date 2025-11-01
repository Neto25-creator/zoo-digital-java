package br.edu.atitus;

import br.edu.atitus.interfaces.Voador;
import br.edu.atitus.interfaces.Predador;

public class Pterodactylo extends Reptil implements Voador, Predador {
    public Pterodactylo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo um grito agudo");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está planando nas correntes de ar");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando do alto");
    }
}