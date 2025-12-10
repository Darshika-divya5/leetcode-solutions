class Solution {
    public String reverseWords(String s) {
        String word = "";
        String temp = "";
        for(int i = 0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c!=' ')
            temp = c + temp;
            if(c==' '||i==s.length()-1){
                word = word + " " + temp;
                temp="";
            }
        }
        return word.trim();
        
    }
}
