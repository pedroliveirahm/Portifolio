package Básico;

// Tanto os métodos setters quanto o método System.in recebem informações do User
// A diferença é que os métodos setters recebem através de parâmetros 

// Tanto os métodos getters quanto o método System.out retornam informações do User

import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        App exe = new App(); // Instanciação de um objeto

        // Chamada de métodos
        exe.comandosBasicos();
        // exe.repeticaoDoWhile();
        // exe.repeticaoFor();
        // exe.looping();
    }

    // Atributos
    private String nome;

    // Objetos
    private PrintStream sysout = new PrintStream(System.out); // O objeto sysout é uma abreviação do system.out
    private Scanner sysin = new Scanner(System.in); // O Objeto sysin é uma abreviação do system.in

    // Método Construtor
    public App() {

    }

    // Métodos Específicos

        // Entrada e Saída de Dados
    public void comandosBasicos() {

        sysout.println("Olá! Qual seu nome?");
        nome = sysin.nextLine(); // Converte o input em string

        sysout.println("Prazer em conhece-lo " + nome + "!");
        sysout.println(nome + ", voce quer jogar comigo ?");
        sysout.println("\nInforme o número da sua opção");
    }

        // Laços de Repetição
    public void repeticaoDoWhile() {

        int x = 0;

        do {

            sysout.println("Laços de repetição DO e WHILE");
            x++;

        } while (x < 5);
    }

    public void repeticaoFor() {

        for (int x = 0; x < 5; x++) { // variável de índice; enquanto; pararLooping

            sysout.println("Laço de repetição FOR");

        }
    }

    public void looping() { // Looping

        for (;;) {

            sysout.println("ABC");
        }
    }
}
