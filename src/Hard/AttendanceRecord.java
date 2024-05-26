package Hard;

public class AttendanceRecord {
    public static int checkRecord(int n) {
        int MOD = 1_000_000_007;
        long[][][] dp = new long[n + 1][2][3];

        // Initialize base case
        dp[0][0][0] = 1; // One way to have an empty record

        for (int i = 1; i <= n; i++) {
            for (int a = 0; a < 2; a++) {
                for (int l = 0; l < 3; l++) {
                    // If we add 'P' (present) at the end
                    dp[i][a][0] = (dp[i][a][0] + dp[i - 1][a][l]) % MOD;

                    // If we add 'A' (absent) at the end
                    if (a > 0) {
                        dp[i][a][0] = (dp[i][a][0] + dp[i - 1][a - 1][l]) % MOD;
                    }

                    // If we add 'L' (late) at the end
                    if (l > 0) {
                        dp[i][a][l] = (dp[i][a][l] + dp[i - 1][a][l - 1]) % MOD;
                    }
                }
            }
        }

        long result = 0;
        for (int a = 0; a < 2; a++) {
            for (int l = 0; l < 3; l++) {
                result = (result + dp[n][a][l]) % MOD;
            }
        }

        return (int) result;
    }

    public static void main(String[] args) {
        int n = 5; // example length of attendance record
        System.out.println("Number of valid attendance records of length " + n + ": " + checkRecord(n));
    }
}
