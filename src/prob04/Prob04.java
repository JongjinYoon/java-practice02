package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		char[] copystr = str.toCharArray();
		char[] reversestr = new char[str.length()];
		int j = str.length() - 1;
		for(int i = 0 ; i < str.length(); i++)
		{
			reversestr[i] = copystr[j];
			j--;
		}
		
		return reversestr;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]);
		}
	}
}