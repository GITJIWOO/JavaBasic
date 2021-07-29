
public class For7 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		// *
		// **
		// ***
		// ****
		// 중첩반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 역피라미드도 만들어보세요.
		for(int i=4; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
