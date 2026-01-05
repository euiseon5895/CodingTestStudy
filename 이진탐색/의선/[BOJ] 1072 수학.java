package 이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        long X = Integer.parseInt(st.nextToken());
        long Y = Integer.parseInt(st.nextToken());
        long Z = (Y * 100) / X;

        long start = 0;
        long end = 1_000_000_000;
        long answer = -1;
        while (start <= end) {
            long mid = (start + end) / 2;
            long XX = X + mid;
            long YY = Y + mid;
            long ZZ = (YY * 100) / XX;

            if (ZZ > Z) {

                answer = mid;
                end = mid - 1;
            } else {

                start = mid + 1;
            }
        }
        System.out.println(answer);



    }
}
