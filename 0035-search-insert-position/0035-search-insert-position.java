class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0])
        return 0;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
           // nums[mid]==target;
            if(nums[mid]>target)
                end=mid-1;
            else if(nums[mid]<target)
                start=mid+1;
            else
                return mid;
        }
        return start;
    }
}