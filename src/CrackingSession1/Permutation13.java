package CrackingSession1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by joao on 21/10/15.
 */
public class Permutation13 {

    public boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        char[] ord1 = str1.toCharArray();
        char[] ord2 = str2.toCharArray();

        Arrays.sort(ord1);
        Arrays.sort(ord2);


        return Arrays.equals(ord1,ord2);
    }
}
