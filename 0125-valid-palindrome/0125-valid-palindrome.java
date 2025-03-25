class Solution {
    public boolean isPalindrome(String s) {
      if(s.isEmpty()) {
        return true;
      }
      int i=0;
      int j=s.length()-1;
      while(i<=j)
      {
        char ichar=s.charAt(i);
        char jchar=s.charAt(j);
        if(!Character.isLetterOrDigit(ichar)){
            i++;
        }
        else if (!Character.isLetterOrDigit(jchar)){
                j--;
            }
            else{
                if(Character.toLowerCase(ichar)!=Character.toLowerCase(jchar)) {
                    return false;
                }
                i++;
                j--;
            }

        }
        return true;
      }
}