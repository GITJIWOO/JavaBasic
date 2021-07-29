package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto3 {
	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어 주세요.
		// 1. 당첨번호 6개를 뽑습니다.
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복중지
		// 4. 3에서 일치하지 않으면 반복횟수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사.
		Random ran = new Random();
		List<Integer> lotto = new ArrayList<>();
		List<Integer> prize = new ArrayList<>();
		int number;
		int prizeNum;
		long money = 0;
		while(true) {
			if(prize.size() != 5) {
				while(prize.size() != 6) {
					prizeNum = ran.nextInt(45) + 1;
					if(!prize.contains(prizeNum)) {
						prize.add(prizeNum);
					}
				}
				Collections.sort(prize);
			}
			while(lotto.size() != 6) {
				number = ran.nextInt(45) + 1;
				if(!lotto.contains(number)) { 	
					lotto.add(number);
				}
			}
			Collections.sort(lotto);
			System.out.println("추첨한 번호 : " + lotto);
			money += 1000;
			if(lotto.equals(prize)) {
				System.out.println("추첨번호 : " + lotto);
				System.out.println("당첨번호 : " + prize);
				System.out.println("당첨입니다!");
				System.out.println((money / 1000) + "번 추첨했습니다.");
				System.out.println("당첨 될 때 까지 쓴 돈 : " + money + "원");
				break;
			}
			lotto.clear();
		}
	}
}
