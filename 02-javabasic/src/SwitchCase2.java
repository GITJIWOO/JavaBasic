
public class SwitchCase2 {

	public static void main(String[] args) {
		// Math.random(); 을 이용해 난수를 하나 발급받을수 있고
		// 난수의 범위는 0초과 1미만입니다.
		double number = Math.random();
		
		// 뒤에 숫자를 곱하면 원하는 범위의 정수를 얻을 수 있습니다.
		int intNum = (int)(Math.random() * 5);

		//Switch~Case문을 이용해서
		//식당 이름을 출력하는 프로그램을 만들어보세요.(최소 6개)
		switch(intNum) {
		case 0:
			System.out.println("어메이징 넝카이");
			break;
		case 1:
			System.out.println("싸다김밥");
			break;
		case 2:
			System.out.println("가츠시");
			break;
		case 3:
			System.out.println("서가네");
			break;
		case 4:
			System.out.println("로쏘");
			break;
		case 5:
			System.out.println("한우마을");
			break;
		default:
			System.out.println("굶기");
			break;
		}
	}

}
