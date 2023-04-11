package Medium;

public class RemovingStarsFromString {
    public static void main(String[] args) {
        String s = deleteS("leet**cod*e");
        System.out.println(s);
    }

    public static String deleteS(String s){
        StringBuilder sb = new StringBuilder(s);
        int lastStarPosition;
        do {
            lastStarPosition = sb.lastIndexOf("*");
            if (lastStarPosition > 1 && lastStarPosition + 1 < sb.length()) {
                sb.replace(lastStarPosition - 1, lastStarPosition + 2, "");
            } else {
                if (lastStarPosition + 1 == sb.length()) {
                    sb.replace(lastStarPosition - 1, lastStarPosition + 1, "");
                } else {
                    if (lastStarPosition > 0) {
                        sb.replace(lastStarPosition - 1, lastStarPosition + 2, "");
                    } else {
                        if (lastStarPosition > -1) {
                            sb.replace(lastStarPosition, lastStarPosition + 2, "");
                        }
                    }
                }
            }
        } while (lastStarPosition > -1);
        return sb.toString();
    }
}
