package car.race;




import java.util.Random;
import java.util.Scanner;

public class Carro {

    Scanner scanner = new Scanner(System.in);

    private String Marca;
    private int Hp;
    private int Year;
    private int Move;

    private static int length = 1000;
    private static int minHp = 100;
    private static int maxHp = 200;
    private static Random generator = new Random();

    public Carro(String Marca, int Hp, int Year) {
        setMarca(Marca);
        setHp(Hp);
        setMove(Move);

    }

    public void moveChange() {
        setMove(Hp * generator.nextInt(1) - 0);

    }

    public Carro(String Marca, int Hp) {
        setMarca(Marca);
        setHp(Hp);

    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int Hp) {
        if (Hp > maxHp) {
            Hp = maxHp;
        } else if (Hp < minHp) {
            Hp = minHp;
        } else {
            this.Hp = Hp;
        }
    }

    public int getMove() {
        return Move;
    }

    public void setMove(int Move) {
        if (Move > length) {
            Move = length;
        } else {
            this.Move = Move;
        }
    }

    public String toString() {

        String result;
        result = "Marca: " + Marca + "Hp: " + Hp + "Year: " + Year;
        return result;
    }
}
