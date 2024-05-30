package Medium;

public class CountTriplets {

    public int countTriplets1(int[] arr) {
        int n = arr.length;
        int[] prefixXOR = new int[n + 1];

        // Compute the prefix XOR array
        for (int i = 0; i < n; i++) {
            prefixXOR[i + 1] = prefixXOR[i] ^ arr[i];
        }

        int count = 0;

        // Iterate through the array to find valid triplets
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j; k < n; k++) {
                    if (prefixXOR[i] == prefixXOR[k + 1]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountTriplets solution = new CountTriplets();
        int[] arr = {2, 3, 1, 6, 7};
        System.out.println(solution.countTriplets1(arr)); // Output: 4
    }
}
