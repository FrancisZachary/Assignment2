import java.util.Scanner;
public class primeGenerator1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner( System.in );
		int n = in.nextInt();
		
		for( int i = 2; i <= n; i++ ) {
			if( isPrime( i ) ) {
				System.out.println( i );
			}
		}
		
		in.close();
		
	}

	private static boolean isPrime( int i ) {
		
		for( int j  = 2; j < i; j++ ) {
			if( i % j == 0 ) {
				return false;
			}
		}
		
		return true;
	}
	
	

}
