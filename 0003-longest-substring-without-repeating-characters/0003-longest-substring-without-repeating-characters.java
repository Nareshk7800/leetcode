class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        HashSet<Character>hash = new HashSet<>();
        int right=0;
        int max=0;
        for(int left=0;left<s.length();left++){
            char val = s.charAt(left);
            while(hash.contains(val)){
                hash.remove(s.charAt(right));
                right++;
            }
            hash.add(val);
            max=Math.max(max,left-right+1);
        }
        return max;
    }
}