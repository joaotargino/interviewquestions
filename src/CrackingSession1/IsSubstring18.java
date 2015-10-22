package CrackingSession1;

/**
 * Created by joao on 21/10/15.
 */
public class IsSubstring18 {

    public boolean isSubstring(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        if (s2.concat(s2).contains(s1)) {
            System.out.println(s1);
            return true;
        } else return false;
    }
}
