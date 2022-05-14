package Aula06.classes;

public class Pessoa {

    private String nome;
    private int idade;
    private float altura;

    // Método construtor - relacionado a instanciação de um objeto
            // new Pessoa() chama o método construtor
            // O método construtor não tem tipo de retorno (string,int,etc)
    // <modificador-acesso> <nomeClasse(parâmetros) {}
    public Pessoa(String nome, int idade, float altura) { // Aconselha-se de 3 a 4 parâmetros no max
        
        System.out.println("Uma pessoa acaba de nascer! Parabens!");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        //imprimirDados();
    }

    public void imprimirDados() { // Se relaciona com o método construtor

        System.out.format("Nome : %s tem %d anos e possui %.2f de altura\n",
        nome, 
        idade, 
        altura);
    }

    // set -> alterar
    // get -> retorno

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
}
