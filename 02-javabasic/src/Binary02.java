
public class Binary02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비교 연산자는 크게 대소비교와 단순비교로 나뉨
		// 단순 비교는 ==, != 이며 모든 자료형과 비교 가능
		// 대소 비교는 <, >, <=, =>이며 숫자끼리 비교 할 수 있다
		// 컴퓨터는 비교연산자를 명제로 인식해 참, 거짓을 판단하고 결과를 출력한다.
		System.out.println(3>5);
		System.out.println(12 <= 12);
		System.out.println("a" != "b");
		System.out.println("a" == " b");
		System.out.println(5 == 5.0); //자료형 간에는 비교 x
	}

}
