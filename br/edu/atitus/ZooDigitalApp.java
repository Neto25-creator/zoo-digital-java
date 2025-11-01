package br.edu.atitus;

import br.edu.atitus.interfaces.Corredor;
import br.edu.atitus.interfaces.Nadador;
import br.edu.atitus.interfaces.Voador;
import br.edu.atitus.interfaces.Predador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDigitalApp {
    private static final List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean executando = true;

            while (executando) {
                exibirMenu();
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                switch (opcao) {
                    case 1 -> cadastrarAnimal(scanner);
                    case 2 -> listarTodosAnimais();
                    case 3 -> listarAnimaisCorredores();
                    case 4 -> listarAnimaisNadadores();
                    case 5 -> listarAnimaisVoadores();
                    case 6 -> listarAnimaisPredadores();
                    case 7 -> exibirTotalAnimais();
                    case 0 -> executando = false;
                    default -> System.out.println("Opção inválida!");
                }
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n=== MENU ZOO DIGITAL ===");
        System.out.println("1. Cadastrar Animal");
        System.out.println("2. Listar Todos Animais");
        System.out.println("3. Listar Animais Corredores");
        System.out.println("4. Listar Animais Nadadores");
        System.out.println("5. Listar Animais Voadores");
        System.out.println("6. Listar Animais Predadores");
        System.out.println("7. Exibir Total de Animais");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static Animal criarMamifero(Scanner scanner, String nome, int idade) {
        System.out.println("Escolha o mamífero:");
        System.out.println("1. Cachorro");
        System.out.println("2. Golfinho");
        System.out.println("3. Leão");
        System.out.println("4. Orca");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        return switch (tipo) {
            case 1 -> {
                System.out.print("Digite a raça do cachorro: ");
                String raca = scanner.nextLine();
                yield new Cachorro(nome, idade, raca);
            }
            case 2 -> new Golfinho(nome, idade);
            case 3 -> new Leao(nome, idade);
            case 4 -> new Orca(nome, idade);
            default -> null;
        };
    }

    private static Animal criarAve(Scanner scanner, String nome, int idade) {
        System.out.println("Escolha a ave:");
        System.out.println("1. Águia");
        System.out.println("2. Avestruz");
        System.out.println("3. Pato");
        System.out.println("4. Pinguim");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        return switch (tipo) {
            case 1 -> new Aguia(nome, idade);
            case 2 -> new Avestruz(nome, idade);
            case 3 -> {
                System.out.print("Digite a cor das penas do pato: ");
                String corPenas = scanner.nextLine();
                yield new Pato(nome, idade, corPenas);
            }
            case 4 -> {
                System.out.print("Digite a cor das penas do pinguim: ");
                String corPenas = scanner.nextLine();
                yield new Pinguim(nome, idade, corPenas);
            }
            default -> null;
        };
    }

    private static Animal criarPeixe(Scanner scanner, String nome, int idade) {
        System.out.println("Escolha o peixe:");
        System.out.println("1. Peixe Morcego");
        System.out.println("2. Piranha");
        System.out.println("3. Traíra");
        System.out.println("4. Tubarão");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        return switch (tipo) {
            case 1 -> new PeixeMorcego(nome, idade);
            case 2 -> new Piranha(nome, idade);
            case 3 -> new Traira(nome, idade);
            case 4 -> new Tubarao(nome, idade);
            default -> null;
        };
    }

    private static Animal criarReptil(Scanner scanner, String nome, int idade) {
        System.out.println("Escolha o réptil:");
        System.out.println("1. Cobra");
        System.out.println("2. Crocodilo");
        System.out.println("3. Lagarto");
        System.out.println("4. Pterodactylo");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        return switch (tipo) {
            case 1 -> new Cobra(nome, idade);
            case 2 -> new Crocodilo(nome, idade);
            case 3 -> new Lagarto(nome, idade);
            case 4 -> new Pterodactylo(nome, idade);
            default -> null;
        };
    }

    private static void cadastrarAnimal(Scanner scanner) {
        System.out.println("\n=== CADASTRO DE ANIMAL ===");
        System.out.println("Escolha o tipo de animal:");
        System.out.println("1. Mamífero (Cachorro, Golfinho, Leão, Orca)");
        System.out.println("2. Ave (Águia, Avestruz, Pato, Pinguim)");
        System.out.println("3. Peixe (Peixe Morcego, Piranha, Traíra, Tubarão)");
        System.out.println("4. Réptil (Cobra, Crocodilo, Lagarto, Pterodactylo)");
        
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Nome do animal: ");
        String nome = scanner.nextLine();
        
        System.out.print("Idade do animal: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Animal animal = switch (tipo) {
            case 1 -> criarMamifero(scanner, nome, idade);
            case 2 -> criarAve(scanner, nome, idade);
            case 3 -> criarPeixe(scanner, nome, idade);
            case 4 -> criarReptil(scanner, nome, idade);
            default -> null;
        };

        if (animal != null) {
            animais.add(animal);
            System.out.println("Animal cadastrado com sucesso!");
        }
    }

    private static void listarTodosAnimais() {
        System.out.println("\n=== TODOS OS ANIMAIS ===");
        for (Animal animal : animais) {
            System.out.println("\nNome: " + animal.getNome());
            System.out.println("Espécie: " + animal.getEspecie());
            System.out.println("Idade: " + animal.getIdade());
            animal.emitirSom();
            animal.comer();
        }
    }

    private static void listarAnimaisCorredores() {
        System.out.println("\n=== ANIMAIS CORREDORES ===");
        for (Animal animal : animais) {
            if (animal instanceof Corredor corredor) {
                System.out.println("\nNome: " + animal.getNome());
                System.out.println("Espécie: " + animal.getEspecie());
                corredor.correr();
            }
        }
    }

    private static void listarAnimaisNadadores() {
        System.out.println("\n=== ANIMAIS NADADORES ===");
        for (Animal animal : animais) {
            if (animal instanceof Nadador nadador) {
                System.out.println("\nNome: " + animal.getNome());
                System.out.println("Espécie: " + animal.getEspecie());
                nadador.nadar();
            }
        }
    }

    private static void listarAnimaisVoadores() {
        System.out.println("\n=== ANIMAIS VOADORES ===");
        for (Animal animal : animais) {
            if (animal instanceof Voador voador) {
                System.out.println("\nNome: " + animal.getNome());
                System.out.println("Espécie: " + animal.getEspecie());
                voador.voar();
            }
        }
    }

    private static void listarAnimaisPredadores() {
        System.out.println("\n=== ANIMAIS PREDADORES ===");
        for (Animal animal : animais) {
            if (animal instanceof Predador predador) {
                System.out.println("\nNome: " + animal.getNome());
                System.out.println("Espécie: " + animal.getEspecie());
                predador.cacar();
            }
        }
    }

    private static void exibirTotalAnimais() {
        System.out.println("\n=== TOTAL DE ANIMAIS ===");
        System.out.println("Total de animais no zoológico: " + Animal.getContador());
    }
}