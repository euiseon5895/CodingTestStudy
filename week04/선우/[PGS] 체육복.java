import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n + 1];

        // 1. 기본 1벌
        for (int i = 1; i <= n; i++) {
            clothes[i] = 1;
        }

        // 2. 잃어버림
        for (int l : lost) {
            clothes[l]--;
        }

        // 3. 여벌
        for (int r : reserve) {
            clothes[r]++;
        }

        // 4. 빌려주기 (앞 사람 우선)
        for (int i = 1; i <= n; i++) {
            if (clothes[i] == 0) {
                if (i > 1 && clothes[i - 1] == 2) {
                    clothes[i]++;
                    clothes[i - 1]--;
                } else if (i < n && clothes[i + 1] == 2) {
                    clothes[i]++;
                    clothes[i + 1]--;
                }
            }
        }

        // 5. 정답 계산
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (clothes[i] >= 1) answer++;
        }

        return answer;
    }
}
