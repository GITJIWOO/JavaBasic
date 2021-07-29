
public class Binary01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이항 연산자는 양 변에 피연산자 하나씩 취한다.
		// 산술 연산자는 우리가 잘 알고있는 사칙연산을 활용하는 연산자, 연산 순위도 그대로 계승
		// 단, % 연산자의 우선순위는 *, /와 동일하다.
		
		System.out.println(3 + 5);
		System.out.println(17-21);
		System.out.println(2*3);
		// /는 왼쪽 수를 오른쪽 수로 나눈다.
		// (정수 / 정수 = 정수)
		System.out.println(7/2); 
		System.out.println(10%4);// %는 정수 최대 몫으로 나눈 나머지 값을 출력
		System.out.println(10 + 6/4); //연산 우선 순위는 그대로 존재
	}

}
