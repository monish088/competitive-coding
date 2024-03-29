class Solution {
    public String removeStars(String s) {
        // Stack<Character> stack = new Stack<>();

        // for (char c : s.toCharArray()) {
        //     if (c == '*') {
        //         // Remove the closest non-star character to the left (if it exists)
        //         if (!stack.isEmpty() && stack.peek() != '*') {
        //             stack.pop();
        //         }
        //     } else {
        //         stack.push(c);
        //     }
        // }

        // StringBuilder result = new StringBuilder();
        // for (char c : stack) {
        //     result.append(c);
        // }

        // return result.toString(); 
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                // Remove the closest non-star character to the left (if it exists)
                if (result.length() > 0 && result.charAt(result.length() - 1) != '*') {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}