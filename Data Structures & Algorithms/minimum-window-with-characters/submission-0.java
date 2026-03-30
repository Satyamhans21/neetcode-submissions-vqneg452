class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        Map<Character,Integer> need=new HashMap<>();
        for(char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> window=new HashMap<>();
        int left=0;
        int right=0;
        int required=need.size();
        int formed=0;
        int minLength=Integer.MAX_VALUE;
        int start=0;
        while(right<s.length()){
            char c=s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);

            if(need.containsKey(c) && need.get(c).equals(window.get(c))){
                formed++;
            }
            while(left<=right && formed==required){
                if(right-left+1<minLength){
                    minLength=right-left+1;
                    start=left;
                }
                char remove=s.charAt(left);
                window.put(remove,window.get(remove)-1);
                
                if(need.containsKey(remove) && window.get(remove)<need.get(remove)){
                    formed--;
                }
                left++;
            }
            right++;
        }
        return minLength==Integer.MAX_VALUE?"": s.substring(start,start+minLength);
    }
}
