class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int val : prices){
            if(val<min){
                min = val;
            }
            else if(val-min>max){
                max = val-min;
            }
        }
        return max;
    }
}