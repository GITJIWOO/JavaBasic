
public class Bonus {
	public static void main(String[] args) {
		// 중첩 반복문을 이용해서 
		// 다음 방정식의 양의 정수 
		// 해를 모두 구하세요.
		// 4x + 5y = 60
		for(int x=1; x<16; x++) {
			
			for(int y=1; y<13; y++) {
				if((4*x) + (5*y) == 60) {
					System.out.println("x의 해 : " + x);
					System.out.println("y의 해 : " + y);
					System.out.println("--------------");
				}
				
			}
			
		}
	}
}
