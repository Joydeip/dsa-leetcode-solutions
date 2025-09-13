// leetcode 58, Length of Last Word

class Solution {
    public int lengthOfLastWord(String s) {
       int count = 0;
       int n = s.length();
       while(s.charAt(n-1)==' '){
        n--;
       }
       for(int i = n-1; i>=0 ; i--){
        if(s.charAt(i)==' '){
            return count;
        }else{
            count++;
        }
       } 
       return count; 
    }
}