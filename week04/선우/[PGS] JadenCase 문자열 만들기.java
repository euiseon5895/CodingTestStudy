import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String n;
        char c;
        s = s.toLowerCase();
        String[] tmp = s.split(" ");
        for(int i = 0; i < tmp.length ; i++){
            n = tmp[i];
            c = tmp[i].charAt(0);
            if(c <'0' || c>'9'){
                String a = c + "";
                a= a.toUpperCase();
                n = a + n.substring(1);
            }
            answer = answer + " " + n;
        }
        answer = answer.substring(1);
        return answer;
    }
}