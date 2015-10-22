package CrackingSession1;

/**
 * Created by joao on 21/10/15.
 */
public class StringCompression15 {

    public String compressedString(String str){
        if(str.isEmpty()) return "";
        else if(str.length() == 1){
            return str.charAt(0) + "1";
        }
        String newString = "";
        int count = 1;
        char last = str.charAt(0);

        for(int i = 1; i < str.length(); i++){
            if(last == str.charAt(i)){
                count++;
            }
            else{
                newString += last + "" + count;
                last = str.charAt(i);
                count = 1;
            }

        }

        return newString + last + count;
    }
}
