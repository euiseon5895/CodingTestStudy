import java.util.*;
class Solution {
    public int[] solution(String s) {
    int[] answer = new int[2];
		String r="";
        int index=0;
        int tmp=0;
        
        while(tmp!=1){
        	
        	int cmp=0;
            //0제거+ 길이= c-> 2진법으로 변환
            for(int i=0; i<s.length(); i++){
            
                if(s.charAt(i)=='0'){
                   answer[1]+=1;
                	
                }
            }
          
            tmp=s.replaceAll("0","").length();
            s=Integer.toString(tmp,2);

            index++;
        }
        answer[0]=index;
        return answer;
        
    }
}
