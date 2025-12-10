class Solution {
    public String reverseWords(String s) {
        StringBuilder word= new StringBuilder(); StringBuilder temp = new StringBuilder();
        for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c!=' ')
				temp = temp.append(c);
			if((c==' '||i==s.length()-1)&& temp.length()>0) {
				word = temp.append(" "+word);
				temp = new StringBuilder();
			}
		}
		return word.toString().trim();
    }
}
