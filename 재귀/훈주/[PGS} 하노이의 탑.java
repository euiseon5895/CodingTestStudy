import java.util.*;

class Solution {

    // 하노이 이동 결과를 저장할 리스트
    // 각 원소: [from, to]
    private List<int[]> moves;

    private void hanoi(int n, int from, int via, int to) {
        // [Base Case] 원판이 1개면 더 쪼갤 수 없다. 바로 옮긴다.
        if (n == 1) {
            moves.add(new int[]{from, to});
            return;
        }

        // [Step 1] 위에 쌓인 n-1개를 목적지(to)가 아닌 보조(via)로 옮겨야
        //          가장 큰 원판(n)을 움직일 수 있다.
        hanoi(n - 1, from, to, via);

        // [Step 2] 가장 큰 원판(n)을 from -> to 로 옮긴다. (이 이동은 반드시 필요)
        moves.add(new int[]{from, to});

        // [Step 3] 보조(via)에 옮겨둔 n-1개를 최종 목적지(to)로 다시 옮겨 쌓는다.
        hanoi(n - 1, via, from, to);
    }

    public int[][] solution(int n) {
        // 총 이동 횟수는 2^n - 1 (n<=15라 int로 안전)
        int totalMoves = (1 << n) - 1;

        // ArrayList는 크기 확장 비용이 있을 수 있으니 미리 capacity를 준다.
        moves = new ArrayList<>(totalMoves);

        // 문제 조건: 1번 기둥의 n개를 3번으로 옮긴다. 보조는 2번.
        hanoi(n, 1, 2, 3);

        // List<int[]> -> int[][]
        return moves.toArray(new int[moves.size()][]);
    }
}