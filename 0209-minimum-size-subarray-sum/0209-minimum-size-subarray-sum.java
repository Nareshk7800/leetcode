class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum=0;
        int minlen = Integer.MAX_VALUE;//to check larger number
        for(int right = 0;right<nums.length;right++){
            sum+=nums[right];//add value
        while(sum>=target){
            minlen = Math.min(minlen,right-left+1);//right-left+1(right,left indicates index of each loop) = 4-0+1
            sum-=nums[left];
            left++;
        }
        }
        return(minlen==Integer.MAX_VALUE)? 0:minlen;
    }
}
//two pointer
//left will shrink value
//right make add value
//