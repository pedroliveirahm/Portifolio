package Aula04; // Mais bem feito do que o Festa.java

import Aula04.contas.ContaNetflix;

public class Netflix {
    public static void main(String[] args) {
        // Criação do objeto conta
        ContaNetflix conta = new ContaNetflix();
        
        // Chamada de métodos
        conta.assistirFilme("Venom 2");
    }
}