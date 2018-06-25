package main;

import figuras.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] mainMenu = {"1. Calcular Area", "2. Calcular Perimetro", "3. Salir"};
        String[] figureMenu = {"1. Circulo", "2. Cuadrado", "3. Rectangulo", "4. Triangulo Equilatero", "5. Triangulo Isoceles", "6. Pentagono Regular", "7. Cancelar"};
        boolean resul = true;
        do {
            int opcMenu = showMenu(mainMenu);
            if (opcMenu != -1) {
                int opcFigure = showMenu(figureMenu);
                if (opcFigure != -1) {
                    resul = executeAction(opcMenu, opcFigure);
                }
            } else {
                resul = false;
            }
        } while (resul);
    }

    public static int readMenuOption() {
        System.out.println("------------------------");
        System.out.println("Seleccione la opcion");
        int opc = 0;
        try {
            opc = Integer.parseInt(in.readLine());
        } catch (Exception excepcion) {
            opc = readMenuOption();
        }
        System.out.println("------------------------");
        return opc;
    }

    public static int showMenu(String[] menu) {
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
        int opc = readMenuOption();
        if (opc >= menu.length || opc < 1) {
            opc = -1;
        }
        return opc;
    }

    public static boolean executeAction(int menu, int figure) {
        boolean resul = true;
        Figura figura = new Figura();
        switch (figure) {
            case 1:
                try {
                    System.out.println("Ingrese el radio");
                    double radio = Double.parseDouble(in.readLine());
                    figura = new Circulo(radio);
                } catch (Exception excepcion) {
                    System.out.println("Error. Valor invalido");
                }
                break;
            case 2:
                try {
                    System.out.println("Ingrese el lado");
                    double lado = Double.parseDouble(in.readLine());
                    figura = new Cuadrado(lado);
                } catch (Exception excepcion) {
                    System.out.println("Error. Valor invalido");
                }
                break;
            case 3:
                try {
                    System.out.println("Ingrese la base");
                    double base = Double.parseDouble(in.readLine());
                     System.out.println("Ingrese la altura");
                    double altura = Double.parseDouble(in.readLine());
                    figura = new Rectangulo(base, altura);

                } catch (Exception excepcion) {
                    System.out.println("Error. Valor invalido");
                }
                break;
            case 4:
                try {
                    System.out.println("Ingrese la base");
                    double base = Double.parseDouble(in.readLine());
                    System.out.println("Ingrese la altura");
                    double altura = Double.parseDouble(in.readLine());                    
                    figura = new TrinaguloEquilatero(base, altura);
                } catch (Exception excepcion) {
                    System.out.println("Error. Valor invalido");
                }
                break;
            case 5:
                try {
                    System.out.println("Ingrese el lado");
                    double lado = Double.parseDouble(in.readLine());
                    System.out.println("Ingrese la base");
                    double base = Double.parseDouble(in.readLine());
                    System.out.println("Ingrese la altura");
                    double altura = Double.parseDouble(in.readLine());
                    figura = new TrianguloIsoceles(lado, base, altura);
                } catch (Exception excepcion) {
                    System.out.println("Error. Valor invalido");
                }
                break;
            case 6:
                try {
                    System.out.println("Ingrese el lado");
                    double lado = Double.parseDouble(in.readLine());
                    System.out.println("Ingrese el apotema");
                    double apotema = Double.parseDouble(in.readLine());
                    figura = new PentagonoRegular(lado, apotema);
                } catch (Exception excepcion) {
                    System.out.println("Error. Valor invalido");
                }
                break;
        }
        double result = 0;

        switch (menu) {
            case 1:
                result = figura.calcArea();
                break;
            case 2:
                result = figura.calcPerimeter();
                break;
        }
        System.out.println(result);

        return resul;
    }

}
