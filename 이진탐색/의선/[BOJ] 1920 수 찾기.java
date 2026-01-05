package 이진탐색;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(arr);


        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());


        for (int i = 0; i < m; i++) {
            int goal = Integer.parseInt(st.nextToken());


            int start = 0;
            int end = n - 1;
            int flag = 0;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (arr[mid] == goal) {
                    flag = 1;
                    break;
                } else if (arr[mid] < goal) {

                    start = mid + 1;
                } else {

                    end = mid - 1;
                }
            }
            sb.append(flag).append('\n');
        }

        System.out.println(sb);

    }

}
