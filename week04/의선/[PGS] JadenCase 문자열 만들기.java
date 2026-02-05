package week4;

public class Soluton2 {
	public String solution(String s) {
		String answer = "";
		s = s.toLowerCase();
		int flag = 1;
		StringBuilder sb = new StringBuilder();

		for (char temp : s.toCharArray()) {

			if (temp == ' ') {
				sb.append(temp);
				flag = 1;
			} else {

				if (flag == 1) {
					sb.append(Character.toUpperCase(temp));
					flag = 0;
				} else {
					sb.append(temp);
				}
			}

		}

		return sb.toString();
	}
}
