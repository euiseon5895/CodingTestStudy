import java.util.*;
class Solution {
    public int solution(String s) {
        
        // 압축 되는 파트를 저장 근데 중복은 하면 안될듯 하고 
        // 총 길이가 짧은것만? 
        // sudo 코드
        //1. HashMap 에다가 중복되는 코드 저장 아니 근데 중복되는지 우째아노
        // x/2 +1이 최대 줄일 수 있는 길이 
        // 그럼 반복문을 500번 해야하나?
        // 입출력 예 5에 나오네 앞에서부터 자르라네 LZW는 아니네 ㅋㅋ 걍자르면 됨
        // 그럼 이건 파트가 중요함  
        int answer = s.length();

        for (int len = 1; len <= s.length() / 2; len++) {
            StringBuilder sb = new StringBuilder(); // 매우 중요!! 문자열 합칠 때는 무조건 스트링빌더!!

            String prev = s.substring(0, len);
            int count = 1;

            for (int j = len; j + len <= s.length(); j += len) {
                String cur = s.substring(j, j + len);

                if (cur.equals(prev)) {
                    count++;
                } else {
                    if (count > 1) sb.append(count);
                    sb.append(prev);
                    prev = cur;
                    count = 1;
                }
            }

            if (count > 1) sb.append(count);
            sb.append(prev);

            sb.append(s.substring((s.length() / len) * len));

            answer = Math.min(answer, sb.length());
        }

        return answer;
    }
}