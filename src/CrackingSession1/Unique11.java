package CrackingSession1;

/**
 * Created by joao on 21/10/15.
 */
public class Unique11 {

    public boolean isUniqueChars2(String str){
        if(str.length() > 256)
            return false;

        boolean[] char_set = new boolean[256];
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val]){
                return  false;
            }
            char_set[val] = true;


        }
        return true;
    }
}
