package random1;

import java.util.Random;
import java.util.Scanner;

public class Random2 {
	public static void main(String[] args) {
		// Random객체를 생성한 다음 nextBoolean() 기능을 이용해서
		// 동전던지기 카운팅 프로그램을 만들어주세요.
		// n회 던졌을때 true = 앞면, false = 뒷면으로 간주해서
		// 프로그램이 다 끝났을 때 앞면 몇회, 뒷면 몇 회 인지
		// 콘솔에 출력해주세요.
		// 실행 홧수 n회는 스캐너로 입력받습니다.
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("몇번 던지시겠습니까?");
		int input = sc.nextInt(); // 몇번 던질 것인지 정해주는 변수
		int front = 0; // 앞면
		int back = 0; // 뒷면
		for(int i = 0; i < input ; i++) { // input 만큼 던지기 위한 반복문
			boolean coin = ran.nextBoolean(); // 앞면 또는 뒷면이 input만큼 랜덤으로 나오게
			if (coin == true) { // true는 앞면이기 때문에 front++
				front++;
			} else if (coin == false){ // false는 뒷면이기 때문에 back++
				back++;
			}
			/*
			if (ran.nextBoolean()) {
				front++;
			} else {
				back++;
			}
			*/
		}
		System.out.println(input + "바퀴 던진 결과값"); // 반복문이 끝나면 앞면과 뒷면 값을 출력해준다.
		System.out.println("앞면 : " + front);
		System.out.println("뒷면 : " + back);
		sc.close();
	}
}
