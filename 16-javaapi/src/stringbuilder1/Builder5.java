package stringbuilder1;

public class Builder5 {
	public static void main(String[] args) {
		// 다음 문자열의 문자를 0번부터 시작해서 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요.
		
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwsyz");
		int b = 0;
		for(int i = 0; i < a.length(); i++) {
			if(i % 3 == 0) {
				a.deleteCharAt(i);
			}
			/*
			if (b >= a.length()) {
				break;
			}
			a.deleteCharAt(b);
			b += 3;
			*/
		}
		System.out.println(a);
	}
}
