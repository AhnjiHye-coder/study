package Quiz;

// 배열의 길이를 2의 거듭제곱으로 만들기
class Solution {
    public int[] solution(int[] arr) {
//        int[] answer = {};
//        int Arr = 0;
        int length = arr.length;
        int new_length = 0;
        // 길이가 6이 들어왔을때 2의 제곱이 될 수 있도록 0으로 채워서 늘리고
        // 길이 4일때는 2의 제곱이기 때문에 길이를 늘릴 필요가 없다
        
        // 1부터 1000까지 범위가 정해져있는 문제이다
        for(int i = 1; i < 1024; i *= 2) { // 1000이 범위라고 한다면 그의 제곱까지 생각해야 하기 때문에 1024로 범위를 잡아준다 
        	// 그리고 제곱으로 증가하기 때문에  i*= 1로설정한다
        	if(arr.length < i) {	// 길이가 만약 6인데 매개변수로 들어온 길이가 8이라면
        		new_length = i;			// 만들어놓은 변수에 i를 담아준다
        		// 이렇게 담아주게 되면 Arr을 새로운 빈 배열에 담았을때 Arr에 담긴 숫자가 곧 배열의 길이가 되는 것이다
        		break;				// arr길이만큼 Arr에 담았다면 break로 반복문 종료
        	}
        	//문제점
        	// if(arr.length ==i) 가 성립할 때 break가 걸려서 new_length가 0인 값이 arr2의 길이로 들어간다.
        	//그래서 new_length =length;를 추가하여 arr.length==i일때에도 new_length가 0이 되지 않게 해준다.
        	
        	if(arr.length == i) {	// 만약 길이가 2의 제곱이라면 즉, 4라면
        		new_length= length;		// 바로 길이를 반환해준다(그럼 길이안에 전달된 매개변수들이 그대로 반환된다
        		break;
        	}
        }
        
        // 여기서는 Arr에 담은 것을 배열로 만들어주는 작업을 한다
        int[] arr2 = new int[new_length];		// 먼저 Arr에 담긴 것을 빈 배열에 담아준다
        // -> 이렇게 되면 6의 숫자가 전달되어도 i *= 1의 조건에 따라 8의 길이가 tmp에 들어가게 된다
        
        for(int i = 0; i < arr.length; i++) {	// 이제 매개변수로 들어온 배열의 길이만큼 반복하면서
        	arr2[i] = arr[i];				// 만들어진 새로윤 배열에 값을 추가하여 담아준다
        }
        
        
        return arr2;
    
    }
}

public class Solution3 {
	
}
