package week3;

import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int cnt = (nums.length)/2;
        
     
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++) {
        	set.add(nums[i]);
        }
        
        int po = set.size();
        
        
        
        answer = cnt>=po?po:cnt;
        
        
        
        return answer;
    }
}