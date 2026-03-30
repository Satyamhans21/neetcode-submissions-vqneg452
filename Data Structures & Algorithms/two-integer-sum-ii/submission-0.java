class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],i+1);

        }
        for(int i=0;i<numbers.length;i++){
            int complement=target-numbers[i];
            if(map.containsKey(complement)){
                if(map.get(complement)<i+1){
                    return new int[] {map.get(complement),i+1};
                }
                else{
                    return new int[] {i+1,map.get(complement)};
                }
            }
        }
        return null;
    }
}
