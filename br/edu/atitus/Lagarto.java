package br.edu.atitus;

import br.edu.atitus.interfaces.Corredor;
import br.edu.atitus.interfaces.Predador;

public class Lagarto extends Reptil implements Corredor, Predador {
    public Lagarto(String nome, int idade) {
        super(nome,  idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo um som sibilante");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo rapidamente sobre a areia");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos insetos");
    }
}