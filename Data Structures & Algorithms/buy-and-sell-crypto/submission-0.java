class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar=prices[0];
        int max=0;
        for(int num:prices){
            minSoFar=Math.min(minSoFar,num);

            max=Math.max(max,num-minSoFar);
            
            
        }
        return max;
        
    }
}
