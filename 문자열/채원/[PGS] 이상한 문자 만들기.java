class Solution {
    public String solution(String s) {
        String answer = "";
			s=s.toLowerCase();
		s=s.toLowerCase();
		char[] sp = s.toCharArray();
		// TODO Auto-generated method stubc
		
		int index = 0;
		int tindex = 0;
		//System.out.println(sp.length);
		while (index < sp.length) {
			if (Character.isAlphabetic(sp[index])) {
				if (tindex % 2 == 0 || tindex == 0) {
					// 짝수라면 대문자.예외:0
					//System.out.println(tindex + "~" + tindex + "짝수여:" + sp[index]);
					answer += Character.toUpperCase(sp[index]);

				} else if (tindex % 2 != 0) {
					// 홀수라면 소문자.
					//System.out.println(tindex + "~" + index + "홀수:" + sp[index]);
					answer += Character.toLowerCase(sp[index]);

				}
				tindex+=1;
				
			}

			else  {//공백인 경우 
				//System.out.println("?");
				answer += sp[index];
				tindex=0;
			}
			index += 1;
			
		}
        return answer;
     
    }
}
