public class Calculadora {

    public static void main(String[] args) {
        // integer.parseInt converte string em inteiro
        int n1 = Integer.parseInt(args[1]);
        int n2 = Integer.parseInt(args[2]);

        // condicionais
        if (args[0].equals("somar")) {
            soma(n1, n2);

        } else if (args[0].equals("subtrair")) {
            subtração(n1, n2);

        } else if (args[0].equals("multiplicar")) {
            multiplicação(n1, n2);

        } else if (args[0].equals("dividir")) {
            divisão(n1, n2);

        } else { // else é usado quando nenhuma instrução anterior é requisitada
            System.out.println("Nenhuma instrução foi definida");
        }
    }

        // funções | métodos : static void nomeDaFunção
    static void soma(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    static void subtração(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    static void multiplicação(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    static void divisão(int n1, int n2) {
        System.out.println(n1 / n2);
    }
}
