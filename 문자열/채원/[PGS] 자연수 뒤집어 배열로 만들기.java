class Solution {
    public int[] solution(long n) {
        String r= String.valueOf(n); 
		String[] tmp=r.split("");
		
		int[] answer=new int[tmp.length];

		for(int i=0; i<=tmp.length-1; i++) {
			answer[i]=Integer.parseInt(tmp[tmp.length-(1+i)]);
			
		}
        return answer;
    }
}
