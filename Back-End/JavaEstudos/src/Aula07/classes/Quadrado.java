package Aula07.classes;

public class Quadrado implements FiguraGeometrica {
    // Atributos
    private int lado;

    // Método construtor
    public Quadrado(int lado) {
        this.lado = lado;
    }

    // Métodos específicos - trocado por uma implementação
  
    // Métodos getters e setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    // Métodos implementados na interface
    @Override
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }
}
