// leetcode question 13. Roman to Integer

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int ans = 0;
        int n = s.length();
        for(int i = 0; i<n ; i++){
            int currval = romanValues.get(s.charAt(i));
            if(i+1<n){
                int nextval = romanValues.get(s.charAt(i+1));
                if(nextval>currval){
                    ans -= currval;
                }else{
                    ans += currval;
                }
            }else{
                ans += currval;
            }
        }
        return ans;
    }
}