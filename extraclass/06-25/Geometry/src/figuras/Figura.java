package figuras;

public class Figura {

    public Figura(String tipo) {
        this.setTipo(tipo);
    }
    
    public Figura() { }
    
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
 public double calcPerimeter() {
        return 0;
    }

    public double calcArea() {
        return 0;

    }
}
