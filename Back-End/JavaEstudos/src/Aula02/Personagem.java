package Aula02;

import java.util.Random;

public class Personagem {

    // Atributos
    String nome;
    int nivel;
    int forca;

    // Métodos -> palavra reservada (void) verbo+Substantivo(parâmetros) {}
    void mostrarStatus() {

        // Premissa -> "Personagem: <nome>, lv <nivel>, com <forca> de força"
        // Identificadores de formatação : String (%s), int (%d), float (%f)
        System.out.format("Personagem : %s, lv %d, com %d de forca\n",
                nome, nivel, forca);
    }

    // Ligado ao danoCausado
    // Como o método calcularDano retornará  apenas uma informação, ele não pode ser void, e
    // sim o tipo daquela informação
    // Chamado de método de retorno
    int calcularDano() {

        Random gerador = new Random(); // A classe Random gera números aleatórios

        int dado20Faces = 1 + gerador.nextInt(19);
        // nextInt() diz a qtd de nmrs que vão ser gerados aleatóriamente
        // nextInt(): 0...n , só que em um dado não existe o n = 0

        int dano = forca + dado20Faces;

        return dano; // retornar o dano
    }

    void atacar(String alvo, String habilidade) {

        int danoCausado = calcularDano();

        // Condicionais
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
