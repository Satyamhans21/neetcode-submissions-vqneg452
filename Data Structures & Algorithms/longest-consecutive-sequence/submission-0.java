class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int max=0;
        for(int num:nums){
            set.add(num);
        }
        for(int i=0;i<nums.length;i++){
            int prev=nums[i]-1;
            int next=nums[i]+1;
            if(set.contains(prev)) continue;
            int count=1;
            while(set.contains(next)){
                count++;
                next++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
