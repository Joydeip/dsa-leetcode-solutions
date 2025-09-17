// leetcode 6, Zigzag Conversion

class Solution {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        if(numRows == 1)
            return s;
        for(int i = 0; i < numRows; i++) 
        {
            for(int j = i; j < s.length(); j += ((numRows - 1)*2)) 
            {
                sb.append(s.charAt(j));
                if (i > 0 && i < numRows - 1 && (j + ((numRows - 1)*2) - (i*2)) < s.length()) 
                {
                    sb.append(s.charAt(j + ((numRows - 1)*2) - (i*2)));
                }
            }
        }
        return sb.toString();
    }
}