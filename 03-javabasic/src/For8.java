
public class For8 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		//    *
		//   **
		//  ***
		// ****
		for(int i=1; i<=4; i++) {
			
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
