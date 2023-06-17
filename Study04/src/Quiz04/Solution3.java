package Quiz04;

// 문자열 묶기
// 금,토

import java.util.Arrays;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
       
        
        for(int i = 0; i < strArr.length; i++){ // 배열에서
            if(strArr[i] == null){       // null이면
            	return -1;//  index++해서 다음 index이동                
                }// end of if
            else if(strArr[i] == strArr[i]){
                 answer++; 
            }
            else {
            	answer++;
            }
          
          
            }// end of for

        return answer;
    }
}
public class Solution3 {
	public static void main(String[] args) {
		
	}
}
