package Quiz;

class Solution {
    public int[] solution(int[] arr) {
    int length = arr.length;
	int new_length = 0;
        
	for(int i=1 ; i<=1024;i*=2) {
		//문제점
		// if(arr.length ==i) 가 성립할 때 break가 걸려서 new_length가 0인 값이 arr2의 길이로 들어간다.
		//그래서 new_length =length;를 추가하여 arr.length==i일때에도 new_length가 0이 되지 않게 해준다.


		if(arr.length == i) {new_length= length;	break;}
		if(arr.length <i) {	new_length = i; break;}
		}

	int[] arr2 = new int[new_length];
        
	for(int i=0; i<arr.length;i++) {
		arr2[i] = arr[i];
	}

        return arr2;
    }
}

public class Solution3_1 {

}
