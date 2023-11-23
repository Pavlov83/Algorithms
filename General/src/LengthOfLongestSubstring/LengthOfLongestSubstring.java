package LengthOfLongestSubstring;

public class LengthOfLongestSubstring {

    public int resultingLength(String s) {

        int maxLength = 0;
        for (int right = 0, left = 0; right < s.length(); right++) {
            int indexlocationOfFirstAppearance = s.indexOf(s.charAt(right), left);
            if (indexlocationOfFirstAppearance != right) {
                left = indexlocationOfFirstAppearance + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
