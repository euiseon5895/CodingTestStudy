

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp = br.readLine();
        String[] box = temp.split("\\-");

        int len = box.length;

        String one = box[0];
        String[] sp = one.split("\\+");
        int n = sp.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(sp[i]);
        }
        for (int i = 1; i < len; i++) {

            String s = box[i];
            String[] split = s.split("\\+");
            int len2 = split.length;
            int tempSum = 0;
            for (int j = 0; j < len2; j++) {
                tempSum += Integer.parseInt(split[j]);
            }
            sum -= tempSum;

        }
        bw.write(sum+"");
        bw.flush();
        bw.close();




    }
}