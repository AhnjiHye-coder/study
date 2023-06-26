package Quiz04;

// 문자열 묶기 181855
// 금,토

import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
    	HashMap<Integer, Integer> coun = new HashMap<>();
        int answer = 0;
       
        
        for(String str : strArr){ // 배열에서
        	coun.put(str.length(), coun.getOrDefault(str.length(), 0) + 1);
        }// end of for
        
        for(int count : coun.values()) {
        	answer = Math.max(answer, count);
        }
        return answer;
    }
}
public class Solution3 {
	public static void main(String[] args) {
		
	}
}
