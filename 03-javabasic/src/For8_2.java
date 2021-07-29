
public class For8_2 {

	public static void main(String[] args) {
		// for문 두 개 만으로 구성한 오른쪽 피라미드
		for(int i=4; i>0; i--) {
			
			for(int j=0; j<4; j++) {
				
				if(i > j+1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
			
			
		}

	}

}
