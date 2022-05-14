package UpAula02;

import java.util.Random;

// Premissa (Algoritmo)
    // Criar os personagens
    // Criar um calculador de dano 
    // Criar uma forma de ataque que se relaciona com o dano

public class Personagem {
    // Atributos
    private String nome;
    private int nivel;
    private int forca;

    // Métodos
    private void gladiador() {
        nome = "Hercules";
        nivel = 50;
        forca = 300;
    }

    private void arqueiro() {
        nome = "Ashe";
        nivel = 60;
        forca = 330;
    }

    private void mago() {
        nome = "Wyzard";
        nivel = 70;
        forca = 350;
    }

    public void escolherPersonagem(String heroi) {
        if (heroi == "Gladiador" || heroi == "gladiador") {

            gladiador();

            System.out.format("Voce escolheu o personagem : %s que possui (lv %d) e forca %d\n",
                    nome, nivel, forca);

        } else if (heroi == "Arqueiro" || heroi == "arqueiro") {

            arqueiro();

            System.out.format("Voce escolheu o personagem : %s que possui (lv %d) e forca %d\n",
                    nome, nivel, forca);

        } else if (heroi == "Mago" || heroi == "mago") {

            mago();

            System.out.format("Voce escolheu o personagem : %s que possui (lv %d) e forca %d\n",
                    nome, nivel, forca);

        } else {
            System.out.format("Personagem : %s inexiste", heroi);
        }
    }

    private int calcularDano() {

        Random gerador = new Random(); // Classe que gera um nmr aleatórios

        int dado50Faces = 1 + gerador.nextInt(49); //nextInt() diz de 0 à Xnúmeros aleatório vão ser gerados
        int dano = dado50Faces * nivel + forca;

        return dano; // retornará o dano
    }

    public void atacar(String alvo, String habilidade) {

        int danoCausado = calcularDano();
        
        // "" (string vazia), o .length (tamanho) é == 0 (igual a 0)
        if (habilidade.length() == 0) { // Caso a string seja vazia

            System.out.format("'%s' : atacou '%s' e causou '%d' de dano\n", nome,
                    alvo, danoCausado);

        } else {

            System.out.format("'%s' : usou '%s' contra o inimigo '%s' e causou '%d' de dano\n",
                    nome, habilidade, alvo, danoCausado);

        }
    }
}
