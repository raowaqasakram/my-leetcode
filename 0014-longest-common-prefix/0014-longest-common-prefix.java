class Solution {
 public static String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        char[] stringWithSmallestLength = strs[0].toCharArray();
        StringBuilder prefix = new StringBuilder();
        for (char c : stringWithSmallestLength) {
            for (String string:strs) {
                if (!string.startsWith(prefix.toString()+c)) {
                     return prefix.toString();
                }  
            }
                prefix.append(c);
            
        }
        return prefix.toString();
    }


}