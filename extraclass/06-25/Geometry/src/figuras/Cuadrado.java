package figuras;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcPerimeter() {
        double perimeter = this.lado * 4;
        return perimeter;
    }

    public double calcArea() {
        double area = this.lado * this.lado;
        return area;
    }

}
