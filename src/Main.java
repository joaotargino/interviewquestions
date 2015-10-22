import CrackingSession1.*;
import org.junit.Test;

import java.util.Random;


/**
 * Created by joao on 21/10/15.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Ola");
        Unique11 u = new Unique11();

        System.out.println("Questao 1.1 do cracking: " + u.isUniqueChars2("abcdefghijklmnopqrstuvwxyz"));


        Permutation13 permutation13 = new Permutation13();
        System.out.println("Questao 1.3 do cracking: " + permutation13.isPermutation( "Hello I'm Ben.", ".neB m'I olleH"));
        System.out.println("Questao 1.3 do cracking: " + permutation13.isPermutation( "Hello!", "hello!"));


        ReplaceSpace14 replaceSpace14 = new ReplaceSpace14();
        System.out.print("Questao 1.4 do cracking: ");
        replaceSpace14.replaceSpaces("Hello my name is Jao");
        System.out.println();

        System.out.print("Questao 1.4 do cracking: ");
        replaceSpace14.replaceSpaces("Hello my name is Jao          ");
        System.out.println();

        System.out.print("Questao 1.4 do cracking: ");
        replaceSpace14.replaceSpaces("");
        System.out.println();

        System.out.print("Questao 1.4 do cracking: ");
        replaceSpace14.replaceSpaces(" ");
        System.out.println();


        StringCompression15 stringCompression15 = new StringCompression15();
        System.out.println("Questao 1.5 do cracking(aabccccaaa = a2b1c4a3): " + stringCompression15.compressedString("aabccccaaa"));
        System.out.println("Questao 1.5 do cracking(aabcCccaaa = a2b1c1C1c2a3): " + stringCompression15.compressedString("aabcCccaaa"));
        System.out.println("Questao 1.5 do cracking(a = a1): " + stringCompression15.compressedString("X"));
        System.out.println("Questao 1.5 do cracking(abcdef = a1b1c1d1e1f1): " + stringCompression15.compressedString("abcdef"));

        System.out.println("Questao 1.6 do cracking: ");
        test16();
        System.out.println("");

        System.out.println("Questao 1.7 do cracking: ");
        test17();
        System.out.println("");

        IsSubstring18 isSubstring18 = new IsSubstring18();
        System.out.println("Questao 1.8 do cracking: " + isSubstring18.isSubstring("waterbottle", "erbottlewat"));
        System.out.println("Questao 1.8 do cracking: " + isSubstring18.isSubstring("banana", "nana"));
        System.out.println("Questao 1.8 do cracking: " + isSubstring18.isSubstring("armaria", "mariara"));



    }

    @Test
    public static void test16() {
        RotateMatrix16 rotation = new RotateMatrix16();
        Random random = new Random();

        int N = 3;
        int i = 0, j = 0;
        int[][] matrix = new int[N][N];
        for(i = 0; i < 3; ++i) {
            for(j = 0; j < 3; ++j) {
                int randomNumber = random.nextInt(11 - 0) + 0;
                matrix[i][j] = randomNumber;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");


        int[][] newMatrix = rotation.rotate(matrix);
        for(i = 0; i < 3; ++i) {
            for(j = 0; j < 3; ++j) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    @Test
    public static void test17() {
        ModifyMatrix17 obj = new ModifyMatrix17();
        int N = 4, M = 4;	// M rows, N columns.
        Random rdm = new Random();
        int[][] matrix = new int[M][N];
        for(int i = 0; i < M; ++i) {
            for(int j = 0; j < N; ++j) {
                int number = rdm.nextInt(11);
                matrix[i][j] = number;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Solution: ");
        int[][] ans = obj.modify(matrix);
        for(int r = 0; r < M; ++r) {
            for(int c = 0; c < N; ++c) {
                System.out.print(ans[r][c] + " ");
            }
            System.out.println("");
        }
    }
}
