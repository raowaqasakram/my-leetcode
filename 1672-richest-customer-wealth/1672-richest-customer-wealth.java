class Solution {
   public int maximumWealth(int[][] accounts) {
        int maximumWealth = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int wealthOfAPerson = 0;
            for (int money = 0; money < accounts[person].length; money++) {
                wealthOfAPerson += accounts[person][money];
            }

            if (wealthOfAPerson > maximumWealth) {
                maximumWealth = wealthOfAPerson;
            }
        }
        return maximumWealth;
    }
}