class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
        return "";
        //count all character in s array
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray())
        map.put(c, map.getOrDefault(c,0)+1);

        //unique character
        HashMap<Character, Integer> count = new HashMap<>();
        int left = 0, minlen = Integer.MAX_VALUE;
        int resr = 0,resl = 0;
        int have = 0, mapcount = map.size();

        for(int right = 0;right<s.length();right++){
            char h = s.charAt(right);
            count.put(h,count.getOrDefault(h,0)+1);

            if(map.containsKey(h) && count.get(h).equals(map.get(h)))
            have++;

            while(have==mapcount){
                if(right-left+1<minlen){
                    resl = left;
                    resr = right;
                    minlen = right-left+1;
                }
                char lc = s.charAt(left);
                count.put(lc,count.get(lc)-1);
                if(map.containsKey(lc) && count.get(lc) <map.get(lc)){
                    have--;
                }
                left++;
            }
        }
        return minlen ==Integer.MAX_VALUE ? "":s.substring(resl,resr+1);
    }
}