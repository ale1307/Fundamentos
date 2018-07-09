package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5}
        };
        int nDiagonal = 0;
        boolean hasAssignedNDiagonal = false;
        boolean diagonalOk = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j){
                if (!hasAssignedNDiagonal) {
                        hasAssignedNDiagonal = true;
                        nDiagonal = matriz[i][j];
                    }
                }else if (nDiagonal != matriz [i][j]){
                    diagonalOk = false; 
                    }
            }
            System.out.println("Diagonal: " +(diagonalOk ));
        }
     
    }

}
