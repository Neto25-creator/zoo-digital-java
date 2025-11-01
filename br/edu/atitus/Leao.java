package br.edu.atitus;

import br.edu.atitus.interfaces.Corredor;
import br.edu.atitus.interfaces.Predador;

public class Leao extends Mamifero implements Corredor, Predador {
    public Leao(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás de sua presa");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando na savana");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está devorando sua presa");
    }
}