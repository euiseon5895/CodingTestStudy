import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 자기 여벌로 해결
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;      // lost도 처리
                    reserve[j] = -1;   // 빌려줄 수 없음 표시
                    break;
                }
            }
        }

        // 친구에게 빌리기
        for (int i = 0; i < lost.length; i++) {
            if (lost[i] == -1) continue; // 이미 해결된 학생 스킵

            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer; 
    }
}
