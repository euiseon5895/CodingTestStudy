import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        // 다리상태 나타내는 큐
        // 큐 크기 = bridge_length
        // 각 칸에는 트럭 무게나 0
        Queue<Integer> bridge = new LinkedList<>();
        // 기다리는 트ㅡ럭 큐
        Queue<Integer> trucks = new LinkedList<>();

        // 한칸씩 이동
        for (int i=0; i < bridge_length; i++){
            bridge.offer(0);
        }

        // 트럭 배열을 큐로 변환 -> 순서대로 트럭 처리할라구
        for (int t : truck_weights) {
            trucks.offer(t);
        }

        // 총 걸린 시간 초기화
        int time = 0;
        int currentWeight = 0;

        // 다리가 완전히 빌때까지 반복
        while (!bridge.isEmpty()) {
            time++;
            // 다리 맨 앞칸에서 트럭이 빠져나감
            int out = bridge.poll();

            // 빠져나간 트럭의 무게만큼 무게 감소
            currentWeight -= out;

            // 아직 대기중인 트럭 있고, 올려도 다리 무게제한 안쪽이라면
            if (!trucks.isEmpty() && currentWeight + trucks.peek() <= weight) {

                // 다음 트럭을 다리에 올리기
                int in = trucks.poll();
                bridge.offer(in);

                currentWeight += in;

            } else {
                // 트럭 못올리면 0 추가
                bridge.offer(0);
            }
        }

        return time;
    }
}