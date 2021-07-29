import java.util.Scanner;

public class For3 {
	//구구단 출력기를 만들어보겠습니다.
	//1~9중 하나의 숫자를 입력받습니다.
	//만약 1~9 범위를 벗어난 숫자가 입력된다면
	//"범위 내의 수를 입력해주세요"라는 안내문구를 적고 종료합니다.
	//맞는 숫자가 들어온다면 결과예시처럼 출력합니다.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("1~9 사이의 숫자를 입력해주세요.");
		int guguNum = scan.nextInt();
		if(guguNum<10 && guguNum > 0) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(guguNum + " * " + i + " = " + (guguNum * i));
			}
		}else {
			System.out.println("범위 내의 수를 입력해주세요.");
		}
	}
}
