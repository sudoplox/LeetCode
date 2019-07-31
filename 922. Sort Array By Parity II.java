922. Sort Array By Parity II
https://leetcode.com/problems/sort-array-by-parity-ii/


class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int size=A.length;
        int[] odd=new int[size];
        int[] even=new int[size];
        int[] newa=new int[size];
        int oc=1;
        int ec=0;
        for(int i=0;i<size;i++){
            if(A[i]%2==0){
                newa[ec]=A[i];
                ec+=2;
            }
            else{
                newa[oc]=A[i];
                oc+=2;
            }
        }
        return newa;
    }
}
Runtime: 2 ms, faster than 99.61% of Java online submissions for Sort Array By Parity II.
Memory Usage: 40.8 MB, less than 98.65% of Java online submissions for Sort Array By Parity II.
