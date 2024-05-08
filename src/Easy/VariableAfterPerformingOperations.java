package Easy;

public class VariableAfterPerformingOperations {
    public static void main(String[] args) {


        String [] operations = {"++X","++X","X++"};
        int x = 0;
        for(int i=0; i< operations.length; i++){
                switch(operations[i]){
                    case "--X" : case "X--":
                        x = x - 1;
                    break;
                    case "++X" : case "X++":
                        x = x + 1;
                        break;
                }
        }
        System.out.println(x);

    }
}


/**
 * Better Solution:
 *
 * class Solution {
 *     func finalValueAfterOperations(_ operations: [String]) -> Int {
 *         operations.reduce(0) { partialResult, operation in
 *             operation == "++X" || operation == "X++" ? partialResult + 1 : partialResult - 1
 *         }
 *     }
 * }
 */