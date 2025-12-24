import java.util.*;
public class Main{
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String r=sc.nextLine();
		String[] tmp= r.split("-");
		int answer=0;
		for(int i=0; i<tmp.length; i++) {
			String[] t= tmp[i].split("\\+");
			int tmp_an=0;
			for(int i2=0; i2<t.length; i2++) {
				tmp_an+=Integer.valueOf(t[i2]);
			}
			if(i==0) answer+=tmp_an;
			else answer-=tmp_an;
					
		}
		System.out.println(answer);
	}
}