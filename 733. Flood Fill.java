733. Flood Fill
https://leetcode.com/problems/flood-fill/


class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image==null || image.length==0 || image[0].length==0)return image;
        
        help(image,sr,sc,image[sr][sc],newColor);
        return image;
    }
    public void help(int[][] image, int sr, int sc, int oc,int nc){
        if(sr<0 || sc <0 ||sr>=image.length || sc>=image[0].length ||  image[sr][sc]!=oc){
            return ;
        }
        if(image[sr][sc]==nc)return; //to solve: causing overflow because it kept going back and forth to change color to newColor even though it was already newColor
        
        
            image[sr][sc]=nc;
            help(image , sr-1 , sc   , oc, nc);
            help(image , sr   , sc-1 , oc, nc);
            help(image , sr   , sc+1 , oc, nc);
            help(image , sr+1 , sc   , oc, nc);
            
        
        
        return ;
    }
}
Runtime: 1 ms, faster than 91.29% of Java online submissions for Flood Fill.
Memory Usage: 45.2 MB, less than 54.96% of Java online submissions for Flood Fill.