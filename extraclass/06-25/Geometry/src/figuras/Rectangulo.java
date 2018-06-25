package figuras;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectangulo");
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
       double perimeter = this.altura*2+this.base*2;
       return perimeter;

    }

    public double calcArea() {
        double area = this.altura*this.base;
        return area;
    }

}
