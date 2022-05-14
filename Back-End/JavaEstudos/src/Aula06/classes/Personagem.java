package Aula06.classes; // Ordem da construção da classe

import javax.swing.JOptionPane;

public class Personagem {

    // Atributos da classe
    private String nome;
    private int nivel;
    private int vida;
    private int forca;
    private String classe;

    // Método construtor
    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.nivel = 5;
        this.vida = 100;
        this.classe = classe;
        this.forca = nivel * vida;
        // mostrarStatus();
    }

    // Métodos específicos -> È o que não é construtor e nem getters e setters
    public void mostrarStatus() {

        String status = String.format("Nome : %s\n Nivel : %d\n Vida : %d\n Classe : %s\n Forca : %d ",
                nome, nivel, vida, classe, forca);
        JOptionPane.showMessageDialog(null, status, "Status do Personagem",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}

// E - Encapsulamento -> protege o código do programador através dos modificadores de acesso
// H - Herança -> Criar classes que podem herdar informações de outras
// P - Polimorfismo -> Quando um objeto pode se comportar de formas diferentes para determinada ação
// A - Abstração -> Pegar informações que são relevantes, Ex : class Pessoa {nome, idade, altura}   