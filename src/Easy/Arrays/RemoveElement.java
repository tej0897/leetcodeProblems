package Easy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int [] intArray = {3,2,2,3};
        int value = 2;
        removeElement(intArray, value);
    }

    private static void removeElement(int[] intArray, int value) {

        int count = 0;
        // Loop through all the elements of the array
        for (int i = 0; i < intArray.length; i++) {
            // If the element is not val
            if (intArray[i] != value) {
                intArray[count++] = intArray[i];
            }
        }
        System.out.println(count);
        for (int j : intArray){
            System.out.println(intArray[j]);
        }
    }

}
