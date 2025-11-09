class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] prefix = new long[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1] = prefix[i]+nums[i];
        }

        java.util.Deque<Integer>dq = new java.util.ArrayDeque<>();

        int max = Integer.MAX_VALUE;

        for(int i=0;i<=n;i++){
            while(!dq.isEmpty() && prefix[i]-prefix[dq.peekFirst()]>=k){
                max = Math.min(max,i-dq.peekFirst());
                dq.pollFirst();
            }
            while(!dq.isEmpty() && prefix[i]<=prefix[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        return max==Integer.MAX_VALUE?-1:max;
    }
}