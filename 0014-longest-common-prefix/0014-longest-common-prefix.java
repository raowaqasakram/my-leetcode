class Solution {
 public static String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
char[] firstString = strs[0].toCharArray();
        StringBuilder prefix = new StringBuilder();
        StringBuilder tempPrefixString = new StringBuilder();
        for (char c : firstString) {
            boolean doesPrefixExist = false;
            tempPrefixString.append(c);

            for (String string:strs) {
                if (string.startsWith(String.valueOf(tempPrefixString))) {
                    doesPrefixExist = true;
                } else {
                    doesPrefixExist = false;
                    break;

                }
            }

            if (doesPrefixExist) {
                prefix.append(c);
            }
        }
        return prefix.toString();
    }


}