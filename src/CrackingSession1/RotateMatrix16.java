package CrackingSession1;

/**
 * Created by joao on 21/10/15.
 */
public class RotateMatrix16 {

    public int[][] rotate(int[][] matrix){

        for (int i = 0; i<matrix.length; i++){
            for(int j = i+1; j< matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return matrix;
    }
}
