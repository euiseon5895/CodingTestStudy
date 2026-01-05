import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* “수 자체”가 아니라 “자리수 개수”로 푸는 문제 */

public class Main {

    static long gcd(long a, long b) { // Euclidean Algorithm로 gcd(n, m)
        while (b != 0) {              // 시간복잡도: O(log min(a, b))
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken()); // n : 1로만 이루어진 수 A의 자리수
        long m = Long.parseLong(st.nextToken()); // m : 1로만 이루어진 수 B의 자리수

        // gcd(A, B) = 111...1 (gcd(n, m)개)→ '1'의 개수만 gcd로 계산
        long g = gcd(n, m);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < g; i++) {
            sb.append('1');
        }

        System.out.println(sb);
    }
}


/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

    static long gcd(long a, long b) { // Euclidean Algorithm로 gcd(n, m)
        while (b != 0) {              // 시간복잡도: O(log min(a, b))
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());  // A, B를 이루는 '1'의 개수
        long m = Long.parseLong(st.nextToken());  // A, B를 이루는 '1'의 개수

        // 모든 자리가 1인 수를 Repunit이라 할 때,
        // gcd(Repunit(n), Repunit(m)) = Repunit(gcd(n, m))
        long g = gcd(n, m);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] buf = new char[8192]; // 한번에 출력할 버퍼 크기
        Arrays.fill(buf, '1');

        while (g > 0) { // g개 만큼 '1'을 출력 (chunk 단위)
            int len = (int) Math.min(g, buf.length);
            bw.write(buf, 0, len);
            g -= len;
        }
        bw.flush();
    }
}
*/