package Aula06;

import javax.swing.JOptionPane;

import Aula06.classes.Personagem;

public class Game {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Nome do personagem");
        String classe = JOptionPane.showInputDialog(null, "Classe do personagem");

        Personagem melee = new Personagem(nome, classe);

        melee.mostrarStatus();
    }
}
