package Quiz04;

// ������ ������ ����� ��
// ��, ��

class Solution {
	private int answer, balls, share;
	
	public int solution(int balls, int share) {
		answer = 0; 
		this.balls = balls;
		this.share = share;
		
		for(int i = 0; i < balls; i++) {
			combination(i,1); 
		}
		return answer;
	}
	// 5�� �߿��� 3���� ������ ����� ����� �����غ���
	// �̶� 5���߿��� ���� �ϱ� ������ �ݺ��� ������ balls�����̴�
	// �׸��� ������ share�� 3���� �����µ� 5�� �߿� � ���� ������ �𸣱⶧����
	// ������ ������ 3������ balls���� ��ü�� ������ �ݺ��ؼ� 5���� ���� 3����
	// ���� ��� ��찡 ��������� ��Ÿ���� �ȴ�
	
	// ���� ����Լ��� ������ �Ͽ���
	// solution�Լ����� balls��ŭ i�� �ݺ��ϴµ� �ѹ� �ݺ��Ҷ�����
	// ����Լ��� �����ϰ� �ȴ�
	// �̷��� �ϴ� ������ 3���� ������ �������� �� 3���� 5�� �߿� � ������ �𸣱� ������
	// i�� �ѹ� �ݺ��ҋ� 1���ǰ���� ������ �� ��͸� ���� 5�� �ݺ��ϴ� ���̿�
	// ���� ���� ���� ��ġ�ϸ� answer�� �����Ͽ� 5�� �� 3���� ������ ���,
	// ��, 5/1(5����1)�� Ȯ���� answer�� ��´�
	
	private void combination(int curIdx, int curCount) {
		// i�� �ݺ����� ��밡 �������� ���� ��ġ�ϸ�
		if(curCount ==  share) {		
			answer++;	// ����� �� ����
			return;
		}
		// 1. ��ġ���� ���� ��� �ݺ����� ���δ�
		// 2. �ݺ��� ������ balls�� ���� ������ �ִ� ������ ��
		// 3. i�� ��Ϳ� ������ ������ �� ���� �Լ��� �ݿ��Ǿ� �� ������ ��ġ���θ� �Ǵ��Ѵ�
		// 4. ������ for���� i���� curIdx���� ������ �־� 
		//    i�� 0���Ͱ� �ƴ� 1���� ������ �����ϰ��Ͽ� balls���� �ݺ��ϰ� �Ѵ�
		// 5. ��Ͱ� ����Ǹ� �� �ٸ� �Լ��� �ڸ��� ������ �ȴٰ� ǥ���غ��ڸ�
		//    ���� �����Լ��� i�� ������ �޾� curCount�� share�� ����� ���� ã��
		// 6. if ������ true���� ������ �Ǹ� ��� �Լ��� ��� �������
		// 7. ���� i�� ������ ���ư���(���⼭ ���� i�� ���̶� ��Ͱ� ����Ǳ� ���� i�� ���Ѵ�)
		// 8. �̷��� ������ �Ǿ�� 5�� �ȿ��� 3���� ã�� ����� ���� ���� �� �ִ�
		// 9. 5��� �������� 3���� �����ٰ� ������ �װ� 1������,2������,3������ ��� �𸣱� ������
		// 10.5���� �ݺ������� �� �ȿ��� ��ͷ� 5������ 1�� 1���� ��� 5���� �ݺ��� �����־� ����� ���� ���ϴ� ��
		// �׷��Ƿ� ��ͷ� �����ϰ� �� ��쿡�� ó�� for���� i�� �����ϴ� ���� �ƴ� for���� i��° ���� ��ͷ� 5���� ��츦 ������ ���Ѵ�
		// i�� 1��°�� 1~5���� �ݺ��Ͽ� 1��, i�� 2��°�� 1~5���� �ݺ��Ͽ� 2�� ���� �� i�� 5���� �ɶ����� �ݺ��Ѵ�
		// ��ʹ� ó�� �ݺ��ߴ� ���� �������� �� �ڽ��� ȣ���Ͽ� for���� �����ϰ� �������� ��� �ݺ��ߴٸ� �ٽ� ���ư��� ���̴�
		// �׷��Ƿ� ��Ͱ� �ѹ� ���� �Ŀ� ó�� �����̾��� i�� 1���� 2�� �����ϰ� �� ���ؿ��� �ٽ� ��Ͱ� ���۵Ǿ� 2��°�� 5���� ��츦 üũ�ϴ°��̴�
		// �� �ݺ��� ������ ���������� �ٽ� ���ư��� i�� 2��°���� 3��°�� �����Ͽ� �ٽ� �˻��ϰ� �ٽ� ���ƿ����� �ݺ��ϸ� 5���� ����������
		// �� �߿��� 3���� � ������ ���� �𸣱� ������ 5���� ��츦 ��� �Ǻ��ؾ� �Ѵ�
		// �׸��� �Ǻ��� ������ solution�Լ��� ���ư��� �ٽ� for���� ���۵Ǵµ� �̶��� solution�� �Լ��� for���� i�� 2�� �Ǿ�
		// ��� for���� 2���� �ݺ��� �����Ѵ�
		for(int i = curIdx + 1; i < balls; i++) {
			combination(i, curCount +1 );
		}
	}
}

public class Solution2 {
/*
 �Ӿ��̴� ������ ģ���鿡�� �������ַ��� �մϴ�.
 ������ ��� �ٸ��� ������ϴ�.
 �Ӿ��̰� ���� �ִ� ������ ���� balls�� ģ���鿡�� ������ ��
 ���� ���� share�� �Ű������� �־��� ��, balls���� ���� �� share���� ������
 ������ ������ ��� ����� ���� return �ϴ� solution �Լ��� �ϼ����ּ���.
 */
	
	public static void main(String[] args) {
		
		Solution so = new Solution();
		
		int num = so.solution(3, 2);
		System.out.println(num);
		
	}
}