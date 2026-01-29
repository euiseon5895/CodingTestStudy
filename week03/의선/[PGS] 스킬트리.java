package week3;

public class Solution4 {
public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
         for(String temp:skill_trees) {
        		
        	
        	int idx = 0;
        	int flag=0;
        	
        	for(char c:temp.toCharArray()) {
        		
        		int pos = skill.indexOf(c);
        		
        		if(pos==-1) continue;
        		
        		if(pos!=idx) {
        			flag = 1;
        			break;
        		}
        		idx++;
        	}
        	if(flag==0) answer++;
        	
        	
        	
        }
        
        
        
        
        
        return answer;
    }
}
