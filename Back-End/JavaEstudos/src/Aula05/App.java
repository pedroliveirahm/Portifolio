package Aula05; // Métodos GET e SET

import Aula05.classes.ContaCorrente;
import Aula05.classes.Pessoa;

public class App {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        // pessoa.nome = "lucas";
        // System.out.println(pessoa.nome);
        // Não é possível pois o atributo nome é private

        // set -> alterar
        // get -> retorno

        pessoa.setNome("Pedro");
        System.out.println("Nome : " + pessoa.getNome());

        pessoa.setIdade(18);
        System.out.println("Idade : " + pessoa.getIdade());

        pessoa.setAltura(1.68);
        System.out.println("Altura : " + pessoa.getAltura());

        // ContaCorrente
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.setDepositar(400.50);
        System.out.println("Saldo atual : " + contaCorrente.getSaldo());

    }
}

// Os processos acima são formas de alterar o atributo de uma classe private
// através do get e set

// Existe um atalho para criar getters e setters dos atributos em ação de origem