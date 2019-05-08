import java.util.Scanner;
public class multiplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startValue;
		int endValue;
		int smallerValue = 0;
		int largerValue = 0;
		
		System.out.println("Type a starting multiplication integer and an ending multiplication integer.");
		Scanner intial = new Scanner(System.in);
		startValue = intial.nextInt();
		endValue = intial.nextInt();
		
		if( startValue < endValue) {
			smallerValue = startValue;
			largerValue = endValue;
		}
		else if (startValue > endValue) {
			smallerValue = endValue;
			largerValue = startValue;
		}
	
		System.out.print("X ");
		for (int k = smallerValue; k <= largerValue; k ++) {
			System.out.print(k + " ");
		}
		
		
		System.out.println("\n");
		for (int i = smallerValue; i <= largerValue; i++) {
			
			System.out.print(i + " ");
				for(int j = smallerValue; j <=largerValue; j++) {
					
					System.out.print(j*i + " ");
				}
			System.out.println("\n");
		}
		
	}

}
