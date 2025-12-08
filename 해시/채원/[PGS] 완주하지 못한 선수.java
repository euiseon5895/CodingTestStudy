import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
       String answer="";
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        StringBuilder sb= new StringBuilder("");
        for(String name: participant){
            map1.put(name,map1.getOrDefault(name,0)+1);
        }
        for(String name: completion){
            map2.put(name,map2.getOrDefault(name,0)+1);
        }
        for(String name: map1.keySet()){
            //이름을 가지고 있지 않다면
            if(!map2.containsKey(name)) sb.append(name);
            
            //아무생각없이 !=를썼는데 효율성 테스트에서 점수가 떨어져서 
            // 질문하기를 비슷한 케이스를 참고했는데 Integer와 int는 다르다는 말을 보고 아차했다.
            //equals로 바꾸니 통과되었다. 잘 알아두는게 좋을 거 같다.
            else if(!(map2.get(name).equals(map1.get(name)))) sb.append(name);
        }
        answer=sb.toString();
        return answer;
    }
}