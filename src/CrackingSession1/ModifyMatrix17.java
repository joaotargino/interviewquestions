package CrackingSession1;

/**
 * Created by joao on 21/10/15.
 */
public class ModifyMatrix17 {

    public int[][] modify(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] || column[j])
                    matrix[i][j] = 0;
            }
        }


        return matrix;
    }


}
