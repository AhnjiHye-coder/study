package Quiz03;

//���ڿ� ����ϱ�
// ��,��
//class Solution {
// public int solution(String my_string) {
//	 // split : Ư�� ���ڸ� �������� �и��Ͽ� �迭�� ���� ��ȯ
//	 // �� my_string�Ű����� ���ڿ� �߿��� ���� �������� �и��Ͽ� 
//	 // StringArr�迭�� ���ڵ��� ����ְ�
//	 
//	 // ������ �������� �ϱ� ������ ���ڵ��� ������� �ʴ��̻� ���ڸ��� , 3�ڸ����� 1�� index�� ���δ�
//	 // �׷��Ƿ� ���ڸ����� �ƴϴ��� ���� ����
//	 String[] stringArr = my_string.split("");
//	 
//	 // stringArr[0]�� ���� �ϳ��ϳ��� answer�� �������·� ��´�
//	 // ������ 4 + 3 = 7�� ���ڸ����� �����̱� ������
//	 // ���� �տ� �ִ� 4�� answer�� �־��ְ� �ݺ����� �����Ѵ�
//	 // �ݺ����� �����Ҷ����� i�� 1���� �����ϰ� �Ǹ� �ٷ� +�� ������ �ǰ�
//	 // �� ������ ������ +,-������ �����Ͽ� answer�� ���� ����ָ� �Ǵ� ���̴�
//	 // ���⼭ ���� �ϳ��ϳ��� ������ ������ִ� �۾��� �ؾ� ������ �� �� ������
//	 // Integer.parseInt�Լ��� ������ش�
//	 // ���ڿ� "4"�� Integer.parseInt�� �Ͽ� ���� 4�� ���·� answer�� ��´�
//     int answer = Integer.parseInt(stringArr[0]);
//     
//     
//     // �ռ� ���޴� ����, i�� 4 �տ� ������� ����ϱ� ���� 1���� �����Ѵ�
//     for(int i = 1; i < stringArr.length; i+=2) { // i+=2�� �ݺ��� ���Ḧ ���� ��
//    	 // ��, ������� �Ǵ��ϵ��� �ݺ����� �����߱⶧���� ���� ������ +����, -���� ������ �ɰ�
//    	 // ���ӹ������� ���� �����Ͽ� answer�� ������ �ȴ�
//    	 
//    	 // equals�Լ��� �̿��Ͽ� stringArr�迭���� +��� ���ڶ��
//    	 if(stringArr[i].equals("+")) {
//    		 // answer�� +�� ���� index�� answer�� +�Ͽ� ��ƶ�
//    		 // ���� i�� ������(+)�̴�, ���⼭ i + 1�� 4�� ���ؾ��ϴ� �����̴�
//    		 // �ε����� �ڸ��̵��� �Ͽ� ���� ������ answer�� ���� ��Ҵ� 4�� ������ �Ѵ�
//    		 answer += Integer.parseInt(stringArr[i+1]); 
//    	 }	// ���ڿ��� + �Ǵ� -�̱⋚���� else�� -�϶��� ����̴�
//    	 else { // -�� ���������� ������ ���� ���� index�� +�Ͽ� �� �ڸ��� �ִ� ������
//    		 // ���� ����ִ� answer�� ���� �����Ͽ� return�Ѵ�
//    		 answer -= Integer.parseInt(stringArr[i-1]); 
//    		 
//    	 }
//    	 
//     }
//  
//     return answer;
// }
//}

public class Solution1 {
	public static void main(String[] args) {
//		Solution so = new Solution();
//		so.solution("4 + 7");
//		
	}
}