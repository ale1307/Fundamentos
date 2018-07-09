/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author ulacit
 */
public class MatrixHelper {

    public void print(String[][] matrix) {
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean checkWinner(String[][] matrix) {
        return checkSameRows(matrix) || checkSameCols(matrix); || checkDiagonalA(matrix) || checkDiagonalB(matrix);
    }

    private boolean checkSameRows(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String initial = matrix[i][0];
            boolean same = true;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != initial) {
                    same = false;
                }
            }
            if (same) {
                return same;
            }
        }
        return false;
    }

    private boolean checkSameCols(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String initial = matrix[0][i];
            boolean same = true;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[j][i] != initial) {
                    same = false;
                }
            }
            if (same) {
                return same;
            }
        }
        return false;
    }

    private boolean checkDiagonalA(String[][] matrix) {
        String nDiagonal = 0;
        boolean hasAssignedNDiagonal = false;
        boolean diagonalOk = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    if (!hasAssignedNDiagonal) {
                        hasAssignedNDiagonal = true;
                        nDiagonal = matrix[i][j];
                    }
                } else if (nDiagonal != matrix[i][j]) {
                    diagonalOk = false;
                }
                if (nDiagonal){
                    return nDiagonal;
                }
            }
            
