package Aula01; // Classes, Variáveis, Objetos e Atributos

public class App {
    public static void main(String[] args) throws Exception {

        // Criação e Instanciação de um objeto
        Celular celular = new Celular();

        // Atributos
        // A modificação de um atributo de uma classe é feita através de getters e
        // setters, não da forma a seguir :

        // celularA.nome = "Iphone 12";
        // celularA.tamanhoTela = 6.1f;
        // celularA.armazenamento = 256;
        // celularA.sistemaOperacional = "Ios";

        // celularB.nome = "Galaxy Note 20 Ulta";
        // celularB.tamanhoTela = 6.9f;
        // celularB.armazenamento = 256;
        // celularB.sistemaOperacional = "Android";

        // celularC.nome = "Xiomi M1 11 Pro";
        // celularC.tamanhoTela = 6.81f;
        // celularC.armazenamento = 128;
        // celularC.sistemaOperacional = "Android";

        // Chamada do método
        celular.descreverCelular("xiaomi mi 11 pro");
        celular.descreverCelular("Iphone");
        celular.descreverCelular("galaxy s20 ultra");

        celular.criarCelular("Teste", "IOS", 526, 6.125f);
    }
}
