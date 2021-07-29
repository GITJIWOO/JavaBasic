package system1;

import java.util.Scanner;

public class TimeCheck2 {
	public static void main(String[] args) {
		// tryCatch구문의 소요시간을 구해주세요.
		// 여러분들이 직접 원하는 종류의 예외를 발생시켜주세요.
		Scanner sc = new Scanner(System.in);
		long start = System.currentTimeMillis();
		System.out.print("몇 번째 숫자 : ");
		int a = sc.nextInt();
		int[] b = {1, 2, 3, 4, 5, 6};
		try {
			System.out.println(b[a]);
		} catch(Exception e) {
			System.out.println("범위를 벗어났습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("끝");
		}
		sc.close();
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start));
	}
}
