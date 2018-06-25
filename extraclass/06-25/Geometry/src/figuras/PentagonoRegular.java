package figuras;

public class PentagonoRegular extends Figura {
    
    private double lado;
    private double apotema;

    public PentagonoRegular(double lado, double apotema) {
        super("Pentagono Regular");
        this.setLado(lado);
        this.setApotema(apotema);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double calcPerimeter() {
        double perimeter = this.lado * 5;
        return perimeter;
    }

    public double calcArea() {
        double area = (this.lado * 5 * this.apotema) / 2;
        return area;
    }
}
