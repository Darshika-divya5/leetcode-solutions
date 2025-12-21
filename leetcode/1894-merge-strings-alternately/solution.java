class Solution {
    public String mergeAlternately(String word1, String word2) {
       String res= ""; int i=0;
        while(i<word1.length() && i<word2.length()){
            res= res + word1.charAt(i) + word2.charAt(i);
        i++;
        }
        return i <word1.length()?res+word1.substring(i):res +word2.substring(i);
    }  
        
 }

