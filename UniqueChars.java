/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        String newString = "";
        boolean isExist; // check if the character was appered id the string
        for (int i =0; i<s.length(); i++) {
            isExist = false;
            if(s.charAt(i) != ' ') {
                for(int j = 0; j<newString.length(); j++)
                {
                    if((s.charAt(i) == newString.charAt(j)) ) {
                        isExist = true;
                        break;
                    }
                }
            }
            if (isExist == false) {
                newString += s.charAt(i);
            }

        }
        return newString;
    }
}
