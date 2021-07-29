package math1;

public class Math6 {
	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다.
		// Math.random()을 이용해 1/3 확률로 가위, 바위, 보를 부여받으며
		// 가위 > 보, 바위 > 가위, 보 > 가위의 상성을 가집니다.
		// 같은 요소가 나오면 무승부입니다.
		// 조건식에 ||을 사용합니다.
		// 0 = 가위, 1 = 바위, 2 = 보
		// 0 > 2, 1 > 0, 2 > 1
		int user = (int)(Math.random() * 3);
		int com = (int)(Math.random() * 3);
		
		// 상수를 처리하는 부분
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		
		// 내가 낸 것과 컴퓨터가 낸 것을 숫자에서 문자로 치환해주는 배열
		String[] items = {"가위", "바위", "보"};
		
		if ((user == SCISSORS && com == PAPER) || 
				(user == ROCK && com == SCISSORS) || 
				(user == PAPER && com == ROCK)){
			System.out.println("내가 이겼습니다.");
		} else if ((user == PAPER && com == SCISSORS) || 
					(user == SCISSORS && com == ROCK) || 
					(user == ROCK && com == PAPER)) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if (user == com) {
			System.out.println("무승부입니다.");
		}
		// 내가 낸 것과 컴퓨터가 낸 것을 출력해주는 부분
		System.out.println("내가 낸 것 : " + items[user]);
		System.out.println("컴퓨터가 낸 것 : " + items[com]);
		
		/*
		if (user == SCISSORS) {
			System.out.println("내가 낸것 : 가위");
		} else if (user == ROCK) {
			System.out.println("내가 낸것 : 바위");
		} else if (user == PAPER) {
			System.out.println("내가 낸것 : 보");
		}
		if (com == SCISSORS) {
			System.out.println("컴퓨터가 낸것 : 가위");
		} else if (com == ROCK) {
			System.out.println("컴퓨터가 낸것 : 바위");
		} else if (com == PAPER) {
			System.out.println("컴퓨터가 낸것 : 보");
		}
		*/
	}
}
