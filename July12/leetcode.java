class Solution {
    public int maximumGain(String s, int x, int y)
    {
        if (x > y)
             return gain(s, "ab", x, "ba", y);
        else
            return gain(s, "ba", y, "ab", x);
    }

    
    int gain(String s, final String high_val, int score_high, final String low_val, int score_low) {
        int points = 0;
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        // Remove "high_val" from s with score_high gain.
        for (final char c : s.toCharArray())
            if (!stack1.isEmpty() && stack1.peek() == high_val.charAt(0) && c == high_val.charAt(1)) {
                stack1.pop();
                points += score_high;
            } else {
                stack1.push(c);
            }

        // Remove "low_val" from s with score_low gain.
        for (final char c : stack1)
            if (!stack2.isEmpty() && stack2.peek() == low_val.charAt(0) && c == low_val.charAt(1)) {
                stack2.pop();
                points += score_low;
            } else {
                stack2.push(c);
            }

        return points;
    }

}