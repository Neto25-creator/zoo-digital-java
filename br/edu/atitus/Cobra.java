package br.edu.atitus;

import br.edu.atitus.interfaces.Corredor;
import br.edu.atitus.interfaces.Predador;

public class Cobra extends Reptil implements Corredor, Predador {
    public Cobra(String nome, int idade) {
        super(nome,  idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está rastejando rapidamente");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando suas presas silenciosamente");
    }
}