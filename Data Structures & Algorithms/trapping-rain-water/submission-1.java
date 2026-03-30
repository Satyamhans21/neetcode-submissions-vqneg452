class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0) return 0;
        int[] leftPrefix=new int[n];
        int[] rightPrefix=new int[n];
        leftPrefix[0]=0;
        for(int i=1;i<n;i++){
            leftPrefix[i]=Math.max(leftPrefix[i-1],height[i-1]);
        }
        rightPrefix[n-1]=0;
        for(int i=n-2;i>=0;i--){
            rightPrefix[i]=Math.max(rightPrefix[i+1],height[i+1]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            max+=Math.max(0,Math.min(leftPrefix[i],rightPrefix[i])-height[i]);

        }
        return max;
    }
}
