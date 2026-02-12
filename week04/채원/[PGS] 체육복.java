import java.util.*;
class Solution {
    public int d(int p,int n, int[] lost, int[] reserve, int[] visited){

        //옷을 빌려줄 수 없는 상태 
        for(int i=0; i<reserve.length; i++){
            for(int i2=0;i2<lost.length; i2++){
                if(lost[i2]==reserve[i]){
                    reserve[i]=-1;
                    lost[i2]=-1;
                }
            }
        }
        for(int i=0; i<reserve.length; i++){
        if(reserve[i]==-1) continue;
            for(int i2=0; i2<lost.length;i2++){
        if(lost[i2]==-1) continue;
               if(reserve[i]==lost[i2]+1){
                   //System.out.println(i+"/"+i2);
                   p+=1;
                  lost[i2]=-1;
                  break;
                
                  
               }
               else if(reserve[i]==lost[i2]-1){
                   //System.out.println(i+"/"+i2);
                  
                   p+=1;
                   lost[i2]=-1;
                   break;
               }
           }
            
        }
        int tmp=0;
        for(int i:lost){
            if(i!=-1){
                tmp+=1;
            }
        }
        return n-tmp;
    }
    public int solution(int n, int[] lost, int[] reserve) {
        
        /*
        체격순으로 매개져있어 앞번호의 학생이나 바로 뒷번호의학생에게만 체육복을 빌려줄수 있다
        4번은 -->3,5 번학생한테만 빌려줄 수 있다.
        최대한 많은 학생이 체육수업을 들어야한다
        
        전체 학생 수 n
        체육복 도난당한 학생들의 번호가 담긴 배열 lost
        여벌의 체육복을 가져온 학생들의 번호가 담긴 reserve
        
        체육수업을 들을수있는 학생의 최댓값을 return 
         전체 학생의 수 2~30
         
         체육복을 도난당한 학생의 수 1~n 중복되는 번호는 없다
         
         여벌의 체육복을 가져온 학생의 수는 1~n명 이하이며 중복 x
         
          여벌의 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있다.
          
          여벌 체육복을 가져온 학생이 체육복을 도난 당했을 수 있음. 하나만 도난당한거고, 남은 체육복이 하나면 체육복을 빌려줄수 없다.
        */
    
        int[] visited= new int[n+1];
     
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer=d(0,n,lost,reserve,visited);
        return answer;
    }
}