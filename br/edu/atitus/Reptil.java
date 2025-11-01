package br.edu.atitus;

public abstract class Reptil extends Animal {
    public Reptil(String nome, int idade) {
        super(nome, "Réptil", idade);
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo como um réptil");
    }
}