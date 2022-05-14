package Aula07; // Encapsulamento através da implementação de interfaces

import javax.swing.JOptionPane;

import Aula07.classes.*;

public class Exe {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5); // O parâmetro do método construtor do circulo é o raio
        Quadrado quadrado = new Quadrado(4); // O parâmetro do método construtor do quadrado é o lado

        AreaTotal areaTotal = new AreaTotal();
        JOptionPane.showMessageDialog(null, "A área total foi : " + areaTotal.somarArea(circulo, quadrado), null, JOptionPane.INFORMATION_MESSAGE);

    }

}
