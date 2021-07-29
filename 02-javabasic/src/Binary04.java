
public class Binary04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비트 이동 연산자는 숫자 (>> / <<) 자리수 문법을 사용
		// >> 왼쪽으로 입력된 자리수 만큼 이동 , 이 때 정수는 2의 자리수 제곱만큼 증가
		// 반대 방향의 경우 2의 자리수 제곱만큼 감소
		int a = 80;
		System.out.println(a >> 3);
		System.out.println(a << 3);
	}

}
