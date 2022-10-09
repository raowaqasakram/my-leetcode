class Solution {
  
    public int findNumbers(int[] nums) {
         int count = 0;

        for (int number : nums) {
            if (isEvenNumberOfDigits(number)) 
                count++;
        }
        return count;
    }

     private boolean isEvenNumberOfDigits(int number) {
        if (getNumberLength(number) %2 == 0) {
            return true;
        }
        return false;
    }

    private int getNumberLength(int number) {
        if (number < 0) {
            number = number * -1;
        }
        return (int) Math.log10(number) + 1;
    }
}