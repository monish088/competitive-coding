class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();

        int n1 = word1.length();
        int n2 = word2.length();

        int i = 0;

        while( i < n1 || i < n2){
            if(i < n1){
                res.append(word1.charAt(i));
            }
            if(i < n2){
                res.append(word2.charAt(i));
            }
            i++;
        }
        return res.toString();

       
    }
}