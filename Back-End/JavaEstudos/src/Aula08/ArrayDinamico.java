package Aula08;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDinamico {
    public static void main(String[] args) {
        // Atributo
        int soma = 0;

        // ArrayList - String
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Carlito");
        nomes.add("Romeu");
        nomes.add("Luquita");
        nomes.add("Juliete");

        System.out.println("A quantidade de posições desse array list é : " + nomes.size());

        // Foreach
        System.out.println("As pessoas envolvidas, exceto Carlito, são : " + nomes.remove(0));
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // For() - não recomendado
        // System.out.println("As pessoas envolvidas são : ");
        // for (int i = 0; i < nomes.size(); i++) {
        //     System.out.println(nomes.get(i));
        // }


        // ArrayList - Integer
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(-24);
        numeros.add(-52);
        numeros.add(0);
        numeros.add(92);
        numeros.add(73);

        System.out.println("\nA quantidade de posições(tamanho) desse array list é : " + numeros.size());

        Collections.sort(numeros);

        // Foreach
        System.out.println("Os números envolvidos, em ordem crescente, são : ");
        
        for (Integer numero : numeros) {
            System.out.println(numero);
            soma += numero;
        }
        System.out.println("A soma desses números são : " + soma);

        // For() - não recomendado
        // System.out.println("Os números envolvidos são : ");
        
        // for (int i = 0; i < numeros.size(); i++) {
        //     System.out.println(numeros.get(i));
        //     soma += numeros.get(i);
        // }
        // System.out.println("A soma desses números são : " + soma);
    }
}
