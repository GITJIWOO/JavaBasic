
public class For5 {

	public static void main(String[] args) {
		// 2~9단까지 구구단을 출력하는 코드를 작성해주세요.
		// 중첩 반복문을 써 주시면 됩니다.
		for(int i = 2; i<10; i++) {//for i 여는부분
			System.out.println(i +"단 구구단 입니다.");
			System.out.println("---------------");
			
			for(int j=1; j<10; j++) {//for j 여는부분
				System.out.println(
					i + " * " + j + " = " + i * j);
			}//for j 닫는부분
			
		}//for i 닫는부분
	}//main 닫는부분
}
