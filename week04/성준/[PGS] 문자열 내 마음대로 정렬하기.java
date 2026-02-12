import java.util.Arrays;
class Solution {
        public String[] solution(String[] strings, int n) {
            String[] answer = {};

            // 배열 담아둘거
            answer = new String[strings.length];

            // 인덱스 위치 체크
            int count = 0;

            Arrays.sort(strings);

            for (int i = 97; i < 123; i++) {
                for (int j = 0; j < strings.length; j++) {
                    if (strings[j].charAt(n) == (char) i) {
                        answer[count++] = strings[j];
                    }
                }
            }
            return answer;
        }
    }