package studycodingtest.week03;

import java.util.HashSet;

/*
    (nums.length / 2) max
    중복을 제거 -> HashSet

    if 문(포켓몬 사이즈 > max)
        max
       else
            포켓몬 사이즈

 */
public class week03_1 {
    class Solution {
        public int solution(int[] nums) {
            // 선택 가능 포켓몬 수
            int max = nums.length / 2;

            // 중복제거하기
            HashSet<Integer> pokemon = new HashSet<>();

            for (int num : nums) {
                pokemon.add(num);
            }

            // 중복을 제거한 셋의 크기가 max보다 크면 max를, 작으면 pokemon의 size를 리턴
            if (pokemon.size() > max) {
                return max;
            } else {
                return pokemon.size();
            }
        }
    }
    // 테스트용 main -> gpt main 줘
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};

        week03_1 outer = new week03_1();           // 바깥 클래스 인스턴스
        week03_1.Solution sol = outer.new Solution(); // inner class 생성 방식

        int result = sol.solution(nums);
        System.out.println(result); // 기대값: 2
    }
}
