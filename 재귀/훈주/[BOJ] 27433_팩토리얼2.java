import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static long factorial(int n) {
        // [Base Case] 더 이상 쪼갤 수 없는 가장 작은 문제
        // 0!은 1로 "정의"되어 있으므로 그대로 반환
        if (n == 0) return 1L;

        // [Recursive Case]
        // n! = n * (n-1)!
        // 현재 n을 곱하고, 나머지 (n-1)!은 "같은 함수"에게 맡긴다.
        return n * factorial(n - 1);
    }

    public static void main(String[] args) throws Exception {
        // 입력: 한 줄에 정수 N (0 <= N <= 20)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(factorial(n)); // 출력: N!
    }
}