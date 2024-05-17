package Easy.Arrays;

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        int length = names.length;
        for (int i=0; i<length-1;i++){
            if (heights[i] < heights[i+1]){
                String temp = names[i];
                names[i] = names[i+1];
                names[i+1] = temp;
            }
        }
        return names;
    }


    public static void main(String[] args) {
        String [] names = {"Mary","John","Emma"};
        int [] heights = {180,165,170};
        for (String s : sortPeople(names, heights)){
            System.out.println(s);
        }
    }
}
