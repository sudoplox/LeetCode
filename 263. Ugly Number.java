263. Ugly Number
https://leetcode.com/problems/ugly-number/


class Solution {
    public boolean isUgly(int num) {
        if(num==1){
            return true;
        }
        if(num==0) return false;
        while(num%2==0)num=num/2;
        while(num%3==0)num=num/3;
        while(num%5==0)num=num/5;

        return num==1;
    }
}

concise:
class Solution {
    public boolean isUgly(int num) {
        if(num==1){
            return true;
        }
        if(num==0) return false;
        int[] ar=new int[]{2,3,5};
        for(int x:ar){
            while(num%x==0)num/=x;
        }
        
        return num==1;
    }
}