class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length()<p.length())
        return res;
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(char c : p.toCharArray()){
            count2[c-'a']++;
        }
        int window = p.length();

        for(int i=0;i<s.length();i++){
            count1[s.charAt(i)-'a']++;
            if(i>=window){
                count1[s.charAt(i-window)-'a']--;
            }
            if(Arrays.equals(count1,count2)){
                res.add(i-window+1);
            }
        }
        return res;

    }
}