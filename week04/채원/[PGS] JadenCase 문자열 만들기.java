import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean t=true;
        for(int i=0; i<s.length(); i++){
             if(s.charAt(i)==' '){
              t=true;
                answer.append(s.charAt(i));
            }
            else{
            if(t==true){
              answer.append(Character.toUpperCase(s.charAt(i)));
                t=false;  
            }  
            else{
                answer.append(Character.toLowerCase(s.charAt(i)));
            }
            }
        }
        return answer.toString();
    }
}