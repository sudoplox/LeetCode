1108. Defanging an IP Address
https://leetcode.com/problems/defanging-an-ip-address/

class Solution {
     public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
Runtime: 2 ms, faster than 50.18% of Java online submissions for Defanging an IP Address.
Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Defanging an IP Address.

class Solution {
    public String defangIPaddr(String address) {
        String s="";
        for(int i = 0; i < address.length(); i++)
        {
            if(address.charAt(i)=='.')
            {
                s=s+"[.]";
            }else
            {
                s=s+address.charAt(i);
            }
        }
        return s;
    }
}
Runtime: 0 ms, faster than 100.00% of Java online submissions for Defanging an IP Address.
Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Defanging an IP Address.