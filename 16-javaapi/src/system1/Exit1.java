package system1;

public class Exit1 {
	public static void main(String[] args) {
		// System.exit()은 break문 처럼 실행 즉시
		// 프로그램 실행을 중단합니다.
		System.out.println("실행중 1");
		System.out.println("실행중 2");
		System.out.println("실행중 3");
		System.out.println("실행중 4");
		System.out.println("실행중 5");
		System.exit(0);
		// 0 정상종료(에러발생 X), 0이외 비정살 종료(에러 발생 O)
		System.out.println("실행중 6");
		System.out.println("실행중 7");
	}
}
