import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;//공평하게 자르지 못했을 때 0 return
        HashMap<Integer,Integer> map1= new HashMap<>();
        HashMap<Integer,Integer> map2= new HashMap<>();
        

     int mid=0;
	       for(int i=0; i<mid; i++){
	           map1.put(topping[i],map1.getOrDefault(topping[i],0)+1);
	       }
	       for(int i=mid; i<topping.length; i++){
	           map2.put(topping[i],map2.getOrDefault(topping[i],0)+1);
	       }// 매번 초기화하면서 만드려고 했는데 시간 초과 -> chatgpt에게 힌트 요청. 하나씩 제거하면 
	        // 시간 복잡도를 낮출 수 있다.
	       while (mid<=topping.length-1){// 범위를 0~mid-1 /mid~topping.length()-1 
	    	  // System.out.println(map1.size()+"/"+map2.size()+"/"+mid);
	           if(map1.size()==map2.size()) {
	        	//   System.out.println("~");
	        	   answer+=1;
	           }
	        
	           map1.put(topping[mid],map1.getOrDefault(topping[mid],0)+1);
	            map2.put(topping[mid],map2.getOrDefault(topping[mid],0)-1);
	          if(map2.get(topping[mid])==0) map2.remove(topping[mid]);
	           mid+=1;
	        
        
       }
        return answer;
    }
}