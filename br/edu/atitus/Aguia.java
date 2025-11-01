package br.edu.atitus;

import br.edu.atitus.interfaces.Voador;
import br.edu.atitus.interfaces.Predador;

public class Aguia extends Ave implements Voador, Predador {
    public Aguia(String nome, int idade) {
        super(nome, idade, "Marrom");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo um grito agudo");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está planando em grandes altitudes");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando do alto das montanhas");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está se alimentando de pequenos mamíferos");
    }
}