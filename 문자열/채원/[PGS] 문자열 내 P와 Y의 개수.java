class Solution {
    boolean solution(String s) {
        boolean answer = false;

        int p=0;
        int y=0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
       for(int i=0; i<s.length(); i++){
           if(Character.toUpperCase(s.charAt(i))=='P'){
               p+=1;
           }
           else if(Character.toUpperCase(s.charAt(i))=='Y'){
               y+=1;
           }
       }
        if(p==y) answer=true;

        return answer;
    }
}
