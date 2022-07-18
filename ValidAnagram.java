class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        
        Arrays.sort(charS);
        Arrays.sort(charT);
        
        String sortedS = String.copyValueOf(charS);       
        String sortedT = String.copyValueOf(charT);
        
        return sortedS.equals(sortedT);
    }
}
