class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        HashSet<Character>val = new HashSet<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char sum = s.charAt(right);
            while(val.contains(sum)){
                val.remove(s.charAt(left));
                left++;
            }
            val.add(sum);
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}