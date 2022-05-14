package Aula07.classes;

public class AreaTotal {

    // Quadrado, Circulo
    // Quadrado, Quadrado
    // Circulo, Circulo

    public double somarArea(FiguraGeometrica quadrado,FiguraGeometrica circulo) {
        double areaTotal = quadrado.calcularArea() + circulo.calcularArea();
        return areaTotal;
    }
}