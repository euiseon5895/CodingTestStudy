class Solution {

    public String solution(String new_id) {
       
         String answer ="";
        char[] tmp=new_id.toCharArray();
       
        for(int i=0; i<tmp.length; i++){
            //1단계 소문자로 바꾸기
            if(Character.isAlphabetic(tmp[i])){
                tmp[i]=Character.toLowerCase(tmp[i]);
            }
            //2단계 알수없는 단어 제거
            if(!(Character.isAlphabetic(tmp[i]) ||
                 Character.isDigit(tmp[i])
                 ||tmp[i]=='-'
                 ||tmp[i]=='_'
                 ||tmp[i]=='.')){
                tmp[i]=' '; //공백처리후 나중에 문자열로 바꿀때 replace로 제거
            }
        }
        
        StringBuilder sb= new StringBuilder(String.valueOf(tmp).replaceAll(" ",""));
            //3단계 (.)마침표가 2번이상 연속된다면 하나의 마침표로 치환(chatgpt 힌트) ->
        boolean ti=false;
        int tindex=Integer.MIN_VALUE;
        for(int i=0; i<sb.length(); i++) {
        	if(sb.charAt(i)=='.') {
        		if(ti==true) {
        		
        			sb.setCharAt(tindex, ' ');
        			tindex=i;
        			
        		}
        		else if(ti==false) {
        			ti=true;
        			tindex=i;
        			
        		}
    	}
        
        else if(sb.charAt(i)==' ') {
        }	
			else if(sb.charAt(i)!='.') {
        		if(ti==true) {
        			ti=false;
        			tindex=Integer.MIN_VALUE;
        		
        	}
        		
                }
        }
       sb= new StringBuilder(sb.toString().replaceAll(" ",""));
//4단계 : new_id에서 마침표가 처음이나 끝에 위치한다면 제거
        if(sb.length()>0) {
            if(sb.charAt(0)=='.') {
            	sb.deleteCharAt(0);
            }
           
            if(sb.length()>0) {
            	if(sb.charAt(sb.length()-1)=='.') {
            
            	sb.deleteCharAt(sb.length()-1);
            	}
            }
        }
//5단계 빈문자열이라면 new_id에 a를 대입
       
        if(sb.length()==0) sb.append("a");
//6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
 //    만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if(sb.length()>=16){
        	
          sb=sb.delete(15,sb.length());
        }
        if(sb.length()>0) {
        	if(sb.charAt(sb.length()-1)=='.') {
	            
        	sb.deleteCharAt(sb.length()-1);
        }
        }
//7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(sb.length()<=2){
            for(int p=0; sb.length()<3; p++){
                char c= sb.charAt(sb.length()-1);
                sb.append(c);
            }
        	}
        
        answer=sb.toString().replaceAll(" ","");
       return answer;
        

    }
}
