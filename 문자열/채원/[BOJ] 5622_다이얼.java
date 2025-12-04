import java.util.Scanner;
public class Main{
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시계방향으로 돌리는데, 하나 누르면 다이얼이 처음 위치로 돌아감
		// a1=2 (한칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다) ----> 1번 =2초 /2번=3초/3번=4초/4번=5초/5번- 6초
		// .......(3)초
		// 전화번호를 각 숫자에 해당하는 문자로 외운다
		// ex unucic=868242
		// 97 /98(b)/99(c) || 100 101 102 || 103 104 105||106 107 108||
		// 2(n=0 시간 3초)/3(n=1인데 시간 4) 4 5 6 7 8 9 나누기 3
		// 2! 0 1 2) 3! 3 4 5) 4! 6 7 8) 5! 9 10 11) 6! 12 13 14 )7! 15 16 17 18) 8! 19
		// 20 21 )9! 22 23 24 25
		// (2= abc/ 3=def/4=ghi/5=jkl/6=mno/7=pqrs/8=tuv/9=wxyz/0=operation)
		// 입력: 첫번째 줄에 알파벳 대문자로 이루어진 단어가 주어진다 (단어의 길이는 2이상 15이하이다)
		// 출력: 첫째줄에 다이얼 걸기위해 필요한 최소 시간 출력

		Scanner sc = new Scanner(System.in);

		String numA = sc.nextLine();

//		StringBuilder st= new StringBuilder();
		// st.append(numA);
		int result = 0;
		int[][] di = new int[][] { { 0, 2 }, { 3, 5 }, { 6, 8 }, { 9, 11 }, { 12, 14 }, { 15, 18 }, { 19, 21 },
				{ 22, 25 } };
		for (int i = 0; i < numA.length(); i++) {
			int tmp = (int) (numA.charAt(i) - 'A');
			for(int j=0; j<8;j++) {
				if (di[j][0] <= tmp && tmp <= di[j][1]) {
				
					result += (3 + j);
					continue;

				}
			}
		}
		System.out.println(result);

	}
}

