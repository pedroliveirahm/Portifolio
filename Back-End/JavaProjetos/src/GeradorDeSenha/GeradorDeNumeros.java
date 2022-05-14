import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class GeradorDeNumeros {
    public static void main(String[]args) {
        Random generated = new Random(); // classe do JDK que gera números aleatórios
        PrintStream sysout = new PrintStream(System.out);
        Scanner sysin = new Scanner(System.in);

        int i = 0;
        
        do {
            
            int numeroGerado = generated.nextInt(10);

            sysout.print(numeroGerado);

            i++;
        
        } while (i < 8);
    }





}


