class Solution {
    public int compress(char[] chars) {
        int i = 0;      // Read pointer
        int index = 0;  // Write pointer

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            // Count consecutive same characters
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // Write the character
            chars[index++] = current;

            // Write the count if > 1
            if (count > 1) {
                String num = String.valueOf(count);
                for (char c : num.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}