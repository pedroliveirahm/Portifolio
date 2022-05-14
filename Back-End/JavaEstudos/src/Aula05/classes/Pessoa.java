package Aula05.classes;

public class Pessoa {

    // Atributos de classe sempre como private
    private String nome;
    private int idade;
    private double altura;  

    // Métodos getters e setters
    // Estrutura : <modificador-acesso> <retorno> <nome-método>() {}
    public void setNome(String nome) { // Método void não retorna nada
        this.nome = nome; // O this é usado para se referir ao atributo(nome) da Classe
                          // e não ao parâmetro(nome) do método
    }     
    
    public String getNome() { // Método de tipo primitivo são métodos de retorno
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
}
