class Solution {
 public static String longestCommonPrefix(String[] strs) {
        
     // Arrays.sort(strs);
        char[] firstString = strs[0].toCharArray();
        StringBuilder prefix = new StringBuilder();
        StringBuilder tempPrefixString = new StringBuilder();
        for (char c : firstString) {
            tempPrefixString.append(c);

            for (String string:strs) {
                if (!string.startsWith(String.valueOf(tempPrefixString))) {
                     return prefix.toString();
                }  
            }
                prefix.append(c);
            
        }
        return prefix.toString();
    }


}