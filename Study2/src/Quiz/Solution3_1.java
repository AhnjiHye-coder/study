package Quiz;

class Solution {
    public int[] solution(int[] arr) {
    int length = arr.length;
	int new_length = 0;
        
	for(int i=1 ; i<=1024;i*=2) {
		//������
		// if(arr.length ==i) �� ������ �� break�� �ɷ��� new_length�� 0�� ���� arr2�� ���̷� ����.
		//�׷��� new_length =length;�� �߰��Ͽ� arr.length==i�϶����� new_length�� 0�� ���� �ʰ� ���ش�.


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
