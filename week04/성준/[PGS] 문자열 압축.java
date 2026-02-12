/*
    k로 잘라서 체크를 하는데
    1~k.length/2
    
    이전 조각이랑 현조각이 같은지 비교
    같으면 count ++
    다르면 누적
*/
class Solution {
    public int solution(String s) {
        int n = s.length();
        int answer = n;
        for (int k = 1; k<(n/2) + 1; k ++){
            int count = 1;
            int len  = 0;
            
            // 첫번째 조각쓰
            String prev = s.substring(0,k);
            
            // i는 다음 조각 시작 인덱스, k씩점프
            for(int i = k; i< n; i += k){
                String cur;
                if (i + k <= n){
                    cur = s.substring(i, i + k);
                }else{
                    cur = s.substring(i,n);
                }
                
                if (prev.equals(cur)){
                    count++;
                }else{
                    len += prev.length();
                    if(count > 1) len += String.valueOf(count).length();
                    
                    prev = cur;
                    count = 1;
                }
            }
            len += prev.length();
            if (count > 1) len  += String.valueOf(count).length();
            
            answer = Math.min(answer, len);
               
        }
        return answer;
    }
}