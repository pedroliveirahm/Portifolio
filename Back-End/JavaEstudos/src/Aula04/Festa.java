package Aula04;

// Modificadores de Acesso
// public
// private
// protected - herança
// default -> conhecido como package prived

import Aula04.festas.Vip;

public class Festa {

    public static void main(String[] args) {

        // Criação e instanciação de um objeto
        Vip festa = new Vip();
        
        festa.qtdCafe = 20; // objeto fazendo uma chamada um atributo, o que não é aconselhável, pois um
                            // atributo deveria ser private
                            // Modificar atributo é através de getters e setters e não dessa forma

        festa.entrar(); // objetado fazendo uma chamada à um método

    }

}
