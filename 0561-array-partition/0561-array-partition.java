class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }


        //In this problem first the sort the array and take even indices to archeive the output

        return sum;
    }
}