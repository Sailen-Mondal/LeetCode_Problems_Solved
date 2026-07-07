class Solution {
    public long sumAndMultiply(int n) {
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        long multi = 0;

        if(n == 0)
            return 0;

        for(int i = 0; i < s.length(); i++){
            int ch = s.charAt(i);

            if(ch != '0'){
                sb.append(s.charAt(i));
                int temp = ch - 48;
                sum += temp;
            }
        }

        s = sb.toString();
        long temp = Integer.parseInt(s);

        multi = sum * temp;

    return multi;
    }
}