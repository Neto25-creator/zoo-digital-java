package br.edu.atitus;

import br.edu.atitus.interfaces.Corredor;
import br.edu.atitus.interfaces.Predador;

public class Avestruz extends Ave implements Corredor, Predador {
    public Avestruz(String nome, int idade) {
        super(nome, idade, "Preto e Branco");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo um som grave");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo em alta velocidade");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está procurando pequenos animais e insetos");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está se alimentando de plantas e pequenos animais");
    }
}