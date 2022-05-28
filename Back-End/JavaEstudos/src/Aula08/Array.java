package Aula08;

public class Array {
    public static void main(String[] args) {

        // Array - int (Tipo Primitivo)
        int[] numeros = new int[4];
        numeros[0] = 916;
        numeros[1] = 528;
        numeros[2] = 983;
        numeros[3] = 791;

        System.out.println("A quantidade de posições(tamanho) desse array é : " + numeros.length);
        
        // Foreach
        System.out.println("Os números envolvidos são : ");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // For() - não recomendado
        // System.out.println("Os números envolvidos são : ");
        // for (int i = 0; i < numeros.length; i++) {
        //     System.out.println(numeros[i]);
        // }

        // Array - String (Wrapper Class) 
        String[] pessoas = new String[5];
        pessoas[0] = "Zé";
        pessoas[1] = "Sere";
        pessoas[2] = "Lepe";
        pessoas[3] = "Cleitinho";
        pessoas[4] = "Lé";

        System.out.println("\nA quantidade de posições(tamanho) desse array é : " + pessoas.length);

        // Foreach
        System.out.println("As pessoas envolvidas são : ");
        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // For() - não recomendado
        // System.out.println("As pessoas envolvidas são : ");
        // for (int i = 0; i < pessoas.length; i++) {
        //     System.out.println(pessoas[i]);
        // }
    }
}
