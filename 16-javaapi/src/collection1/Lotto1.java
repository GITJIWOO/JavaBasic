package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto1 {
	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다.
		// 로또복권 추첨기는 1이상 45이하의 범위에서 겹치는 숫자없기
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 출력하도록 만들어주세요.
		// ArrayList의 정렬은 .sort()대신
		// Collections.sort(리스트); 를 이용해 정렬합니다
		Random random = new Random();
		List<Integer> lotto = new ArrayList<>(); // 내 번호를 뽑는 리스트
		List<Integer> prize = new ArrayList<>(); // 1등 당첨 번호 리스트
		int number;
		int prizeNum = 0; // 보너스 번호를 뽑기 위해 0으로 초기화 시킨다.
		long money = 0; // 사용한 돈
		while (prize.size() < 6) { // 1등 당첨 번호를 뽑는다.
			prizeNum = random.nextInt(45) + 1;
			if(!prize.contains(prizeNum)) {
				prize.add(prizeNum);
			}
		}
		while(prize.contains(prizeNum)) { // 2등 보너스 번호를 뽑는다.
			prizeNum = (int)(Math.random() * 45) + 1;
		}
		Collections.sort(prize);
		System.out.println("1등 번호 : " + prize);
		System.out.println("2등 보너스 번호 : " + prizeNum);
		while (true) { // 당첨이 될 때 까지 번호를 뽑는다.
			while (lotto.size() < 6) { // 번호 6개를 추첨
				number = random.nextInt(45) + 1;
				if(!lotto.contains(number)) { // 뽑은 번호가 이미 있는지 검사
					lotto.add(number); // 없다면 추가
				}
			}
			money += 1000; // 추첨을 한 번 할 때마다 천원씩 추가
			Collections.sort(lotto);
			System.out.println("추첨된 번호 : " + lotto);
			if (lotto.equals(prize)) { // prize와 번호가 같을 때 실행
				System.out.println("내 번호 : " + lotto);
				System.out.println("1등 번호 : " + prize);
				System.out.println("2등 보너스 번호 : " + prizeNum);
				System.out.println("1등 당첨!");
				System.out.println("당첨까지 쓴 돈 : " + money + "원");
				break; // 당첨이기 때문에 braek를 한다.
			}
			lotto.clear(); // 당첨이 안됐기 때문에 다시 뽑기 위해 추첨했던 번호들을 지운다.
		}
	}
}
