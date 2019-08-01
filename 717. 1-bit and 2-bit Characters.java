717. 1-bit and 2-bit Characters
https://leetcode.com/problems/1-bit-and-2-bit-characters/


class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        for(int i=0;i<bits.length;){
            if(bits[i]==1){
                bits[i]=3;
                bits[i+1]=3;
                i+=2;
                continue;
            }
            if(bits[i]==0){
                bits[i]=2;
                i++;
            }
        }
        return bits[bits.length-1]==2;
        
    }
}
Runtime: 0 ms, faster than 100.00% of Java online submissions for 1-bit and 2-bit Characters.
Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for 1-bit and 2-bit Characters.