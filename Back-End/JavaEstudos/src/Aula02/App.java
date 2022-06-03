package Aula02; // Métodos e Condicionais

public class App {
    public static void main(String[] args) {

        // Criação dos objetos e métodos, respectivamente
            // Era melhor ter passado nome, nível e força como parâmetro do método
            // construtor da classe personagem
        Personagem gladiador = new Personagem();
        gladiador.nome = "Hercules";
        gladiador.nivel = 8;
        gladiador.forca = 16;

        Personagem arqueiro = new Personagem();
        arqueiro.nome = "Saati";
        arqueiro.nivel = 6;
        arqueiro.forca = 12;

        Personagem mago = new Personagem();
        mago.nome = "Weezy";
        mago.nivel = 10;
        mago.forca = 19;

        // Chamada do método mostrarStatus
        gladiador.mostrarStatus();

        // Chamada do método atacar e foi passado como argumento uma string
        gladiador.atacar("Hydra", "Machadada");

        App pessoa = new App();
        String[] pessoas = new String[5];
        pessoas[0] = pessoa.nacionalidade;

        pessoa.idade = 15;
    }

    // Atributos
    String nome, nacionalidade;
    int idade;
    float altura, peso;
}
