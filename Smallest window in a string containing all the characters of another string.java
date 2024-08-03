
class Solution
{
    public static String smallestWindow(String s, String p)
    {
        if (s.length() < p.length()) {
            return "-1";
        }
        HashMap<Character, Integer> required = new HashMap<>();
        for (char c : p.toCharArray()) {
            required.put(c, required.getOrDefault(c, 0) + 1);
        }

        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;
        int left = 0;
        int count = 0;
        HashMap<Character, Integer> window = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            window.put(currentChar, window.getOrDefault(currentChar, 0) + 1);

            if (required.containsKey(currentChar) &&
                window.get(currentChar).intValue() == required.get(currentChar).intValue()) {
                count++;
            }

            while (count == required.size()) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (required.containsKey(leftChar) &&
                    window.get(leftChar).intValue() < required.get(leftChar).intValue()) {
                    count--;
                }
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "-1" : s.substring(minLeft, minLeft + minLength);
    }
}
