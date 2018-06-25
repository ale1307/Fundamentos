package figuras;

public class TrinaguloEquilatero extends Figura {

    private double base;
    private double altura;

    public TrinaguloEquilatero(double base, double altura) {
        super("Triangulo Equilatero");
        this.setBase(base);
        this.setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcPerimeter() {
        double perimeter = this.base * 3;
        return perimeter;
    }

    public double calcArea() {
        double area = (this.base * this.altura) / 2;
        return area;

    }

}
