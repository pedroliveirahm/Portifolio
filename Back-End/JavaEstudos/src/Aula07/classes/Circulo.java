package Aula07.classes;

public class Circulo implements FiguraGeometrica {
    // Atributos
    private int raio;

    // Método construtor
    public Circulo(int raio) {
        this.raio = raio;
    }

    // Métodos específicos da classe - trocado por uma implementação

    // Métodos getters e setters
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    // Métodos implementados pela interface
    @Override
    public double calcularArea() { // Math.pow(n,potência) -> elevar numero a uma potencia
        double area = Math.PI * Math.pow(this.raio, 2); // Math é uma classe de matemática do java
        return area;
    }
}
