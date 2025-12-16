import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int fib(int n) {
        // [Base Case 1] 더 이상 쪼갤 수 없는 가장 작은 문제
        if (n == 0) return 0;

        // [Base Case 2]
        if (n == 1) return 1;

        // [Recursive Case]
        // n번째 값은 (n-1)번째와 (n-2)번째의 합
        // 여기서 fib(n-1), fib(n-2)를 각각 구하기 위해 재귀 호출이 발생하며
        // 이 과정에서 중복 계산이 생긴다.
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) throws Exception {
        // 입력: n (0 <= n <= 20)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 출력: fib(n)
        System.out.println(fib(n));
    }
}
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    /**
     * fibIterative(n) = n번째 피보나치 수를 반복문으로 계산
     *
     * 핵심 논리(중복 계산 제거):
     * - 피보나치는 "이전 두 항"만 알면 다음 항을 만들 수 있다.
     * - 따라서 0부터 n까지 차례대로 누적 계산(bottom-up)하면 된다.
     *
     * 장점:
     * - 중복 계산 없음 => O(n)
     * - 재귀 호출 스택 없음 => 안전
     * - 이전 두 값만 들고 가면 되므로 메모리 O(1)
     */
    static int fibIterative(int n) {
        // n이 0 또는 1이면 정의값 그대로 반환
        if (n == 0) return 0;
        if (n == 1) return 1;

        // a = F(0), b = F(1)로 시작
        int a = 0;
        int b = 1;

        // i=2부터 n까지 순서대로 F(i)를 만든다.
        for (int i = 2; i <= n; i++) {
            int next = a + b; // next = F(i) = F(i-1) + F(i-2)
            a = b;            // 다음 루프에서 a는 F(i-1)가 되어야 함
            b = next;         // 다음 루프에서 b는 F(i)가 되어야 함
        }

        // 루프가 끝나면 b가 F(n)
        return b;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fibIterative(n));
    }
}

*/