package Quiz04;

// ���ڿ� ����
// ��,��

import java.util.Arrays;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
       
        
        for(int i = 0; i < strArr.length; i++){ // �迭����
            if(strArr[i] == null){       // null�̸�
            	return -1;//  index++�ؼ� ���� index�̵�                
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
