import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        //k제공
        int answer = 0;
        HashMap<Integer,Integer> tan= new HashMap<>();
        //HashMap 정리
        for(int i: tangerine){
            tan.put(i,tan.getOrDefault(i,0)+1);
        }
       List<Integer> a = new ArrayList<>(tan.values());
     Collections.sort(a, Collections.reverseOrder()); //외우기
        int i=0;
        int sum=0;
        while(i<a.size()){//list는 length가 아니라 size
            sum+=a.get(i);// 배열처럼 접근하면 안되고 a.get(i)
           // System.out.println(sum+"/"+a.get(i));
            if(sum==k) {
                
                answer=(i+1);
                break;
            }
            else if(sum>k){
                answer=i+1; //왜 i+1이냐면 0부터 시작했기 때문
                break;
            }
            i+=1;
        }
        return answer;
    }
}