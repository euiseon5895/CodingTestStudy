class Solution {//substring과 equals 쓰면 되겠다. 
    public int solution(String s) {
     String answer="";
		
		String[]com= {"zero","one","two","three","four","five","six","seven","eight","nine"};
	

			int tmp=0;
	        int end=0;
	        while(tmp<=end){
	        	boolean tp=false;
	        	if(end==s.length()) {
	        		
	        		String t=s.substring(tmp,end);
		            //System.out.println(t);
	           for(int i=0; i<com.length; i++) {
	        	   if(t.contains(com[i])) {
	        		   tp=true;
	        		   answer+=i+"";
	        		   break;
	               
		
				}
				else if(t.contains(String.valueOf(i))==true) {
					answer+=i+"";
	                tp=true;
	                break;
				}
			}
	        		break;
	        	}
	        	else {
	        		String t=s.substring(tmp,end);
		           // System.out.println(t);
	           for(int i=0; i<com.length; i++) {
	        	   if(t.contains(com[i])) {
	        		   tp=true;
	        		   answer+=i+"";
	        		   break;
	               
		
				}
				else if(t.contains(String.valueOf(i))==true) {
					answer+=i+"";
	                tp=true;
	                break;
				}
			}
	           if(tp==true) {
	        	   tmp=end;
	           }
	           else {
	        	   end+=1;
	           }
	    
	        }
	        }
        return Integer.parseInt(answer);
    }
}
