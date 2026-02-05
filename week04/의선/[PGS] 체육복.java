package week4;

public class solution5 {
	public int solution(int n, int[] lost, int[] reserve) {

		int[] student = new int[n + 2];

		Arrays.fill(student, 1);

		for (int l : lost)
			student[l]--;

		for (int r : reserve)
			student[r]++;

		for (int i = 1; i <= n; i++) {
			if (student[i] == 0) {
				if (student[i - 1] == 2) {
					student[i - 1]--;
					student[i]++;
				} else if (student[i + 1] == 2) {
					student[i + 1]--;
					student[i]++;
				}
			}
		}

		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (student[i] >= 1)
				answer++;
		}

		return answer;
	}
}
