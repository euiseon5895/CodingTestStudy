import java.util.*;
class Solution {
    public int dfs(int n,String s,int max){
         if (s.length() == 1) {
            return 1;
            }
        if (n>s.length()/2){
            return max;
        }
        
        StringBuilder sb= new StringBuilder();
    
        
        String r= s.substring(0,n);
        int cnt=1; // 중복갯수
        int tmp=0;
        boolean t=false;
            
        for(int i=n;i + n <= s.length(); i=i+n){
             String cur = s.substring(i, i + n);

            if(r.equals(cur)){
                cnt+=1;
                
            }
            else{
                // 먼저 추가부터
                if(cnt>1) sb.append(String.valueOf(cnt));
                sb.append(r);
                r=cur;
                 
                cnt=1;
                }
          
        }        
        if (cnt > 1) sb.append(cnt);
        sb.append(r);
       // 남은 문자열 처리
        if (s.length() % n != 0) {
            sb.append(s.substring(s.length() - (s.length() % n)));
        }

        if(max>sb.length()){
            max=sb.length();
        }
      return dfs(n+1,s,max);
     
    }
    public int solution(String s) {
        /*
        간단한 비손실 압축 방법
        문자열에서 같은 값이 연속해서 나타나는 것=  그문자의 개수와 반복되는 값으로 표현해 더 짧은 문자열로 줄여서 표현
        
        ex) aabbaccc -> 2a2ba3c (문자가 반복되지 않아 한번만 나타난 경우 1은 생략)
        -> 반복되는 문자가 적은 경우 압축률이 낮음
        
        ex2) "ababcdcdacadbdcd"
        문자 1개 단위로 자르면 전혀 압축되지않지만, 2개 단위로 자르면
        -> "2ab2cd2ab2cd"가 된다
        8개 단위 ->"2ababcdcd"가 됨
        
        ex3)
        "abcabcdede"
        2개 단위로 문자를 잘라서 압축 ->"abcabc2de"
        3개 단위로 문자를 잘라서 압축 ->"2abcdede" (가장 짧은 압축 방법)
        ( 3개 단위로 자르고 마지막에 남는 문자열은 그대로 붙여주면 된다.)
        
        압축할 문자열 s가 매개변수로 주어질때 , 1개 이상 단위로 문자열을 잘라 압축하여 
        표현한 문자열 중 가장 짧은 것의 길이를 return
        */
        int answer = dfs(1,s,Integer.MAX_VALUE);
        //s의 길이는 1~10000
        
        return answer;
    }
}