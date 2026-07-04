import java.math.BigInteger;
import java.util.ArrayList;

class Solution {

    public int[] plusOne(int[] digits) {

        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // Convert array into a number string.
        for (int digit : digits) {
            sb.append(digit);
        }

        // Convert string to BigInteger and add one.
        BigInteger number = new BigInteger(sb.toString());
        number = number.add(BigInteger.ONE);

        // Convert back to string.
        String result = number.toString();

        // Convert each character back into an integer.
        for (int i = 0; i < result.length(); i++) {
            list.add(result.charAt(i) - '0');
        }

        // Convert ArrayList<Integer> to int[].
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}