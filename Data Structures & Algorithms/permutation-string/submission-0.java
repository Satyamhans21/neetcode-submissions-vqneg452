class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        int n=s2.length();
        int left=0;
        int[] freq=new int[26];
        int[] freq2=new int[26];
        for(Character c: s1.toCharArray()){
            freq[c-'a']++;
        }
        for(int right=0;right<n;right++){
            
                freq2[s2.charAt(right)-'a']++;

            
            while(right-left+1>k){
                freq2[s2.charAt(left)-'a']--;
                left++;
            }
            if(right-left+1==k){
                if(Arrays.equals(freq,freq2)) return true;
            }

        }
        return false;
    }
}
