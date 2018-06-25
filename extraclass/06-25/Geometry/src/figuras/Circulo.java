package figuras;

public class Circulo extends Figura {

    private double radio;
    

    public Circulo(double radio) {
        super("Circulo");
        this.setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcPerimeter() {
        double perimeter = 2 * Math.PI * this.radio;
        return perimeter;
    }

    public double calcArea() {
        double area = Math.pow(this.radio, 2) * Math.PI;
        return area;
    }

}
