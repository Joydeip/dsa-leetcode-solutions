// leetcode 68, Text Justification

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;
        int n = words.length;
        
        while (index < n) {
            int totalChars = words[index].length();
            int last = index + 1;
            
            // Find how many words can fit in current line
            while (last < n) {
                if (totalChars + words[last].length() + 1 > maxWidth) break;
                totalChars += words[last].length() + 1;
                last++;
            }
            
            StringBuilder sb = new StringBuilder();
            int numWords = last - index;
            int totalSpaces = maxWidth - totalChars + (numWords - 1);
            
            // If last line or only one word in line - left justified
            if (last == n || numWords == 1) {
                for (int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if (i < last - 1) sb.append(' ');
                }
                // Add remaining spaces at the end
                while (sb.length() < maxWidth) {
                    sb.append(' ');
                }
            } else {
                // Fully justified
                int spacesBetween = totalSpaces / (numWords - 1);
                int extraSpaces = totalSpaces % (numWords - 1);
                
                for (int i = index; i < last; i++) {
                    sb.append(words[i]);
                    
                    if (i < last - 1) {
                        int spacesToAdd = spacesBetween + (extraSpaces-- > 0 ? 1 : 0);
                        for (int j = 0; j < spacesToAdd; j++) {
                            sb.append(' ');
                        }
                    }
                }
            }
            
            result.add(sb.toString());
            index = last;
        }
        
        return result;
    }
}