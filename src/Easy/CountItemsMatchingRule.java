package Easy;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {

    /**
     *
     * [type, color, name]
     */
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int len = items.size();
//        for (int i =0; i < len; i++){
//           if (ruleKey == "type"){
//                int j = 0;
//                if (items.get(i) == ruleValue){
//
//                }
//           } else if( ruleKey == "color"){
//               int j =1;
//           } else {
//                int j = 2;
//           }
//        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = List.of(
                List.of("phone","blue","pixel"),
                List.of("computer","silver","lenovo"),
                List.of("phone","gold","iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));

    }
}
