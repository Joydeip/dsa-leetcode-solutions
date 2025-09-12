// leetcode 45, Jump Game II

class Solution {
    public int jump(int[] nums) {
        int l = nums.length-1;
        int p = 0;
        int jump = 0;
        while(p<l){
            int mid=0;
            for (int i = 0 ;i <= p; i++) {
                 mid=Math.max(mid,nums[i]+i);   
            }
            int i=p+1;
                p=mid;
                jump++;
        }
        return jump;

    }
}