package Easy;

import java.util.HashMap;
import java.util.Map;

public class GFG_test {
    public static void main(String[] args)
    {
        int[] a = { 1, 6, 4, 6, 4, 8, 2, 4, 1, 1 };
        int n = a.length; // size of array

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                int c = map.get(a[i]);
                map.replace(a[i], c + 1);
            }
            else
                map.put(a[i], 1);
        }
        for (Map.Entry<Integer, Integer> i :
                map.entrySet()) {
            if (i.getValue() > 1)
                System.out.println(i.getKey() + " "
                        + i.getValue());
            else
                continue;
        }
    }
}
