package exceptions;

public class Exceptions {

    private static double divide(int n1, int n2) {
        if (n1 == 0) {
            throw new NumberFormatException("0 is not expected");
        }
        return n1 / n2;
    }

    public static void main(String[] args) {
        try {
            double res = divide(25, 0);
            System.out.println("Resultado" + res);
        } catch (NumberFormatException ex) {
            System.out.println("Ocurrio un error en el numero");
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println("Excepcion generica");
            System.out.println(ex.getMessage());
        }
    }
}




