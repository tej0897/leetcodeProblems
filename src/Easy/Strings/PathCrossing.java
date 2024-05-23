package Easy.Strings;

public class PathCrossing {

    public static boolean isPathCrossing(String path) {
        int length = path.length();
        int count;
        if (length < 4){
            return false;
        }
        char string[] = path.toCharArray();

        for(int i = 0; i < length; i++) {
            count = 1;
            for (int j = i + 1; j < length; j++) {

                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                }
            }
            if (count > 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "NESWW";
        System.out.println(isPathCrossing(input));
    }

}
