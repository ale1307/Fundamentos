package figuras;

public class TrianguloIsoceles extends Figura {

    private double lado;
    private double base;
    private double altura;

    public TrianguloIsoceles(double lado, double base, double altura) {
        super ("Triangulo Isoceles");
        this.setLado(lado);
        this.setBase(base);
        this.setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calcPerimeter() {
        double perimeter = this.lado * 2 + this.base;
        return perimeter;

    }

    public double calcArea() {
        double area = (this.base * this.altura) / 2;
        return area;
    }
}
