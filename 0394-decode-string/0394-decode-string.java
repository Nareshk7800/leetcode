class Solution {
    public String decodeString(String s) {
        Stack<String> stackstr = new Stack<>();
        Stack<Integer> stackint = new Stack<>();
        int num=0;
        String curr = "";
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='['){
                stackstr.push(curr);
                stackint.push(num);
                curr="";
                num=0;
            }
            else if(c==']'){
                int repeat = stackint.pop();
                StringBuilder temp = new StringBuilder(stackstr.pop());
                for(int i=0;i<repeat;i++){
                    temp.append(curr);
                }
                curr=temp.toString();
            }
            else{
                curr+=c;
            }
        }
        return curr;
    }
}