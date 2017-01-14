package AxelMonroyX.chapter1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by axel on 11/01/17.
 * github.com/AxelMonroyX
 */
public class Question1_7_SetZeroColumnRow {
    public int[][] setZero(int[][] originalMatrix) {
        if (originalMatrix == null) return new int[0][0];

        Set<Integer> mycolumns = new HashSet<Integer>();
        Set<Integer> myrows = new HashSet<Integer>();
        boolean findAtLeastOneZero = false;

        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                if (originalMatrix[i][j] == 0) {
                    mycolumns.add(i);
                    myrows.add(j);
                    findAtLeastOneZero = true;
                }

            }
        }

        if (!findAtLeastOneZero) return originalMatrix;


        return getColumnAndRowToZero(originalMatrix, mycolumns, myrows);
    }

    private int[][] getColumnAndRowToZero(int[][] originalMatrix, Set<Integer> mycolumns, Set<Integer> myrows) {
        for (int column : mycolumns) {
            for (int i = 0; i < originalMatrix.length; i++) {
                originalMatrix[column][i] = 0;
            }

        }
        for (int row : myrows) {
            for (int j = 0; j < originalMatrix.length; j++) {
                originalMatrix[j][row] = 0;
            }
        }
        return originalMatrix;
    }


}
