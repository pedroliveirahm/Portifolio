package UpAula01;

import java.io.PrintStream;
import java.util.Scanner;

public class Celular {
    public static void main(String[] args) {
        // Criando objetos - instancia de uma classe
        Celular iphone = new Celular("Iphone", "Ciano");
        iphone.setArmazenamento(512);
        iphone.setTamanhoTela(5.92f);
        iphone.setProcessador("M1");

        Celular galaxy = new Celular("Galaxy", "Black");
        galaxy.setArmazenamento(256);
        galaxy.setTamanhoTela(6.12f);
        galaxy.setProcessador("12RAM");

        Celular xioami = new Celular("Xioami", "Silver");
        xioami.setArmazenamento(1000);
        xioami.setTamanhoTela(6.02f);
        xioami.setProcessador("16RAM");

        // Chamada de Métodos
        iphone.descreverCelular();
    }

    // Atributos
    private String nome, processador, cor;
    private int armazenamento;
    private float tamanhoTela;

    // Objetos
    PrintStream sysout = new PrintStream(System.out);
    Scanner sysin = new Scanner(System.in);

    // Método Construtor
    private Celular(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    // Métodos Específicos
    public void ligar(String remetente) {
        sysout.format("Ligando para %s...", remetente);
    }

    public void descreverCelular() {
        sysout.format(
                "As características do %s cor %s são : \nProcessador %s\nArmazenamento de %dgb\nTamanho de tela %.2fpolegadas",
                this.nome, this.cor, this.processador,
                this.armazenamento, this.tamanhoTela);
    }

    // Métodos Getters e Setters
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public float getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(float tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }
}
