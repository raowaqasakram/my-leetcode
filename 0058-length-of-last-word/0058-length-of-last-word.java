class Solution {
    public int lengthOfLastWord(String s) {
        
    String[] arrayOfStrings=s.split(" ");
        return arrayOfStrings[arrayOfStrings.length-1].length();
    }
}