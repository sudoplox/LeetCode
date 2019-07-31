344. Reverse String
https://leetcode.com/problems/reverse-string/

class Solution {
    public void reverseString(char[] s) {
        char temp;
        int counter=0;
        
        for(int i=s.length-1; i>=s.length/2; i--){
            temp=s[i];
            s[i]=s[counter];
            s[counter++]=temp;
        }
    }
}