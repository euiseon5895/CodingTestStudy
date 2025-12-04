import java.util.Scanner;
public class Main {
public static StringBuilder iterat(int len,String arr) {
	StringBuilder b= new StringBuilder();
	for(int i=0; i<arr.length(); i++) {
		for(int i2=0; i2<len; i2++) {
			b.append(arr.charAt(i));
		}
	}
	return b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 s를 입력받고
		//각 문자를 R번 반복 새문자열 P를 만들고 출력
		// 즉, 첫번째 문자를 R번 반복후 두번째 문자를 R번 반복 해 P를 만든다
	
		Scanner sc= new Scanner(System.in);
		int testCase= sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<testCase; i++) {
			int len= sc.nextInt(); //반복할 획수
			
			String ar= sc.next();
			System.out.println(iterat(len, ar));

		}

			}
		
		
}
