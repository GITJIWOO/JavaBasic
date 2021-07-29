import java.util.Scanner;

public class Elseif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * else if는 if로 달린 조건 이외에 추가 조건을 달 때 쓴다. if문 다음에 작성하고, else문 전에 작성한다.
		 * else if문은 else와 달리 조건식을 기입해야 한다. else if문은 몇 개라도 작성 할 수 있다.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 ");
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("양수 입니다.");
		}else if(num == 0) {
			System.out.println("0 입니다");
		}else {
			System.out.println("음수");
		}
		
	}

}
