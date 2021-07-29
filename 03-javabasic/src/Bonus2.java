import java.util.Scanner;

public class Bonus2 {
	//이중 반복문을 이용해
	//n을 입력받았을때 4~n까지의 범위에서
	//소수만 출력해주는 코드를 작성해주세요.

	//*소수 = 1과 자기 자신으로만 나눌 수 있는 숫자
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 까지의 숫자 중 소수만 탐색하시겠습니까?");
		int finalNum = scan.nextInt();
		boolean isOk;
		for(int i=4; i<finalNum; i++) {
			isOk = false;
			for(int j=2; j<i; j++) {
				if(i % j == 0) {
					isOk = true;
				}
				if((i-1 == j) && !isOk) {
					System.out.println(i + "은 소수입니다.");	
				}
				
			}			
		}
		
	}
}
