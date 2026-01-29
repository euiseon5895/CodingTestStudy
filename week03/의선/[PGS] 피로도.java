package week3;
import java.util.*;

class Solution2 {
    int maxCnt = 0;
    public int solution(int k, int[][] dungeons) {
        int answer =0;
        
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(k,visited,0,dungeons);
        
        
        
        
        
        return maxCnt;
    }
    
    void dfs(int k,boolean[] visited,int cnt,int[][]dungeons){
        
        if(maxCnt<cnt){
            maxCnt = cnt;
        }
        for(int i=0;i<dungeons.length;i++){
            int need = dungeons[i][0];
            int cost = dungeons[i][1];
            
            if(!visited[i]&&need<=k){
                visited[i] = true;
                dfs(k-cost,visited,cnt+1,dungeons);
                visited[i] = false;
            }
            
            
            
        }
        
        
    }
}