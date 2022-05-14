package Aula01;

// Premissa (Algoritmo)
            // Iphone 12, tela 6.1", 256gb, Ios -> celularA
            // Galaxy Note 20 Ultra, tela 6.9", 256gb, Android -> celularB
            // Xiomi Mi 11 Pro, tela 6.81", 128gb, Android -> celularC

public class Celular {
    // Atributos
    private String nome;
    private String sistemaOperacional;
    private int armazenamento;
    private float tamanhoTela;

    // Métodos
    private void galaxy() {

        nome = "Galaxy S20 Ultra";
        sistemaOperacional = "Android";
        armazenamento = 256;
        tamanhoTela = 6.9f;
    }

    private void xiaomi() {

        nome = "Xiomi Mi 11 Pro";
        sistemaOperacional = "Android";
        armazenamento = 256;
        tamanhoTela = 6.81f;
    }

    private void iphone() {

        nome = "Iphone";
        sistemaOperacional = "Ios";
        armazenamento = 256;
        tamanhoTela = 6.1f;
    }

    public void descreverCelular(String celular) { // Pede um argumento (celular)
        
        // Condicionais e Operadores Lógicos
        if (celular == "iphone" || celular == "Iphone") {

            iphone();
            System.out.format(
                    "O %s possui as seguintes caracteristicas :\n sistema operacional - %s, armazenamento de %dgb e tela de %.2f polegadas\n",
                    nome, sistemaOperacional, armazenamento, tamanhoTela);

        } else if (celular == "xiaomi mi 11 pro" || celular == "Xiaomi Mi 11 Pro") {

            xiaomi();
            System.out.format(
                    "O %s possui as seguintes caracteristicas :\n sistema operacional - %s, armazenamento de %dgb e tela de %.2f polegadas\n",
                    nome, sistemaOperacional, armazenamento, tamanhoTela);

        } else if (celular == "galaxy s20 ultra" || celular == "Galaxy S20 Ultra") {

            galaxy();
            System.out.format(
                    "O %s possui as seguintes caracteristicas :\n sistema operacional - %s, armazenamento de %dgb e tela de %.2f polegadas\n",
                    nome, sistemaOperacional, armazenamento, tamanhoTela);
        } else {
            System.out.println("Celular descrito incorretamente");
        }
    }
}