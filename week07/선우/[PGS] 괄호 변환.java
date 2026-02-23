class Solution {
    public String solution(String p) {
        String answer = "";
        if(p.equals("")){
            return answer = "";
        }
        answer = process(p);
   
        return answer;
    }
    
    
    
    public String process(String x){
        String k = "";
        if(x.equals("")){
            return x;
        }
                int c = 0,d = 0;
        String a = "",b = "";
        for(int i = 0; i < x.length() ; i++){
            if(x.charAt(i) == '('){
                c++;
            } else if(x.charAt(i) == ')'){
                d++;
            }
            if(c == d){
                a = x.substring(0,i+1);
                b = x.substring(i+1);
                break;
            }
        }
        if(isCorrect(a)){
            return a + process(b);
        }
        String h = "";
        h =  "(" + process(b) + ")" ;
        
        a = a.substring(1,a.length()-1);
        String y = "";
        for(int j = 0; j<a.length(); j++){
            if(a.charAt(j) == '('){
                y += ")";
            } else if (a.charAt(j) == ')'){
                y += "(";
            }
        }
        k =   h + y;
        
        
        return k;
    }
    boolean isCorrect(String s){
    int cnt = 0;
    for (int i = 0; i < s.length(); i++){
        if (s.charAt(i) == '(') cnt++;
        else cnt--;
        if (cnt < 0) return false;
    }
    return cnt == 0;
}
}