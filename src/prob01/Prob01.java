package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		
		System.out.print( "금액: " );
		int inputMoney = scanner.nextInt();
		
		scanner.close();
		
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] moneycount = new int[10];
		for(int i = 0; i < 10; i++)
		{
			 moneycount[i] = inputMoney/money[i];
			 System.out.println(money[i] + "원 : " + moneycount[i] + "개");
			 inputMoney = inputMoney - (money[i]*moneycount[i]);
		}
 	}
}