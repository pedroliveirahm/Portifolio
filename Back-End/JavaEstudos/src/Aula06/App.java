package Aula06; // Método construtor

import Aula06.classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception{
        
        Pessoa pessoa = new Pessoa("Pedro", 20, 1.78f); //nome,idade,altura

        pessoa.setNome("Joana"); // set -> alterar
        pessoa.imprimirDados();
    }
}
