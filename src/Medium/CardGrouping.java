package Medium;

import java.util.TreeMap;

public class CardGrouping {

    public static boolean isPossibleToRearrange(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false; // If the total number of cards is not divisible by groupSize, return false
        }

        TreeMap<Integer, Integer> cardCountMap = new TreeMap<>();
        for (int card : hand) {
            cardCountMap.put(card, cardCountMap.getOrDefault(card, 0) + 1);
        }

        while (!cardCountMap.isEmpty()) {
            int firstCard = cardCountMap.firstKey();
            for (int i = 0; i < groupSize; i++) {
                int currentCard = firstCard + i;
                if (!cardCountMap.containsKey(currentCard)) {
                    return false;
                }
                int count = cardCountMap.get(currentCard);
                if (count == 1) {
                    cardCountMap.remove(currentCard);
                } else {
                    cardCountMap.put(currentCard, count - 1);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] hand1 = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize1 = 3;
        System.out.println(isPossibleToRearrange(hand1, groupSize1)); // Output: true

        int[] hand2 = {1, 2, 3, 4, 5};
        int groupSize2 = 4;
        System.out.println(isPossibleToRearrange(hand2, groupSize2)); // Output: false
    }
}
