// leetcode 151, Reverse Words in a String

class Solution {
    public String reverseWords(String s) {

        String[] ans = new String[10000];
        int len=0;
        String answer = "";

        for(String val: s.trim().split("\\s+")){
            if(val != "\\s+")
                ans[len] = val;
                len++;
        }

        for(int i=len-1;i>=0;i--){
            if(ans[i] != " "){
                if(i!=len-1)
                    answer += " " + ans[i];
                else{
                    answer += ans[i];
                }
            }
        }

        return answer;
    }
}