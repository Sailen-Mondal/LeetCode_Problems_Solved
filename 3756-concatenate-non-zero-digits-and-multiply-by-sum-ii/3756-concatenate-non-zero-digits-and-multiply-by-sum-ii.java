class Solution {
    private static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        int[] nonZeroCount = new int[n + 1];
        int totalNonZero = 0;

        for (int i = 0; i < n; i++) {
            nonZeroCount[i + 1] = nonZeroCount[i];
            if (s.charAt(i) != '0') {
                nonZeroCount[i + 1]++;
                totalNonZero++;
            }
        }

        long[] power10 = new long[totalNonZero + 1];
        power10[0] = 1;
        for (int i = 1; i <= totalNonZero; i++) {
            power10[i] = (power10[i - 1] * 10) % MOD;
        }

        long[] prefixValue = new long[totalNonZero + 1];
        long[] prefixDigitSum = new long[totalNonZero + 1];

        int index = 0;
        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            if (digit == 0) {
                continue;
            }

            prefixValue[index + 1] = (prefixValue[index] * 10 + digit) % MOD;
            prefixDigitSum[index + 1] = prefixDigitSum[index] + digit;
            index++;
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            int start = nonZeroCount[left];
            int end = nonZeroCount[right + 1];
            int length = end - start;

            if (length == 0) {
                answer[i] = 0;
                continue;
            }

            long value = prefixValue[end]
                    - (prefixValue[start] * power10[length]) % MOD;

            if (value < 0) {
                value += MOD;
            }

            long digitSum = prefixDigitSum[end] - prefixDigitSum[start];
            answer[i] = (int) ((value * (digitSum % MOD)) % MOD);
        }

        return answer;
    }
}