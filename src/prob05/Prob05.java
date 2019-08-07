package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요. : ");
		Scanner scanner = new Scanner( System.in );
		int number = scanner.nextInt();
		int minNumber = 1;
		int maxNumber = 100;
				
		Random random = new Random();
		int correctNumber = random.nextInt(maxNumber) + minNumber;
		System.out.println(correctNumber);
		
		//정답 랜덤하게 만들기
		while(true) {
			
			if(number > correctNumber) 
				System.out.println("더 낮게 : ");
			
			if (number < correctNumber) 
				System.out.println("더 높게 : ");
			
			number = scanner.nextInt();
			
			if (number == correctNumber) {
				System.out.println("정-답");
				System.out.println("다시 하시겠습니까?>> ");
				String answer = scanner.next();
				
				if( answer.equals("n") ){
					System.out.println("종료합니다.");
					System.exit(0);
				}
				if( answer.equals("y") ){
					correctNumber = random.nextInt(maxNumber) + minNumber;
					System.out.println(correctNumber);
					continue;
				}
			}
		}
	}
}