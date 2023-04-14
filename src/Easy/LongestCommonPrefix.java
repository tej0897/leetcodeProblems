package Easy;

//    First we will find the shortest string and its length.
//    Secondly, we will take the first string and match it's each character
//          one by one with all the other strings.
//    As soon as we encounter a character which does not match, we will break out of loop.

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strings = {"flower","flow","flight"};
        System.out.println("The common prefix in the given Array of Strings is: " + checkPrefix(strings));
    }

    private static String checkPrefix(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();

        if (strings == null || strings.length == 0){
            return stringBuilder.toString();
        }
        // Find the minimum length string from the array
        int minLength = strings[0].length();
        for (int i = 0; i < strings.length; i++){
            minLength = Math.min(minLength, strings[i].length());
        }
        // Loop for the minimum length

        for (int i = 0; i < minLength; i++){
            char current = strings[0].charAt(i);

            for (String str : strings){
                if (str.charAt(i) != current){
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(current);
        }
        return stringBuilder.toString();
    }
}
