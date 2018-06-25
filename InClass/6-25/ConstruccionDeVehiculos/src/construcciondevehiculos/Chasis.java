package construcciondevehiculos;

public class Chasis {

    int lenght;
    Scanner sc = 

    public Chasis(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
        System.out.println("Ingrese el largo");
        if (lenght >= 7 || lenght < 12 && lenght > 12){
            System.out.print("-o--o-'");
        }
    }

}

