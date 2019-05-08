import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double investmentAmount;
		int interestRateStart;
		int interestRateEnd;
		int yearAmountStart;
		int yearAmountEnd;
		
		
		System.out.println("How much would you like to invest?");
		Scanner in = new Scanner(System.in);
		investmentAmount = in.nextDouble();
		
		System.out.println("Give a range of the number of years you would like to invest:");
		yearAmountStart = in.nextInt();
		yearAmountEnd = in.nextInt();
		
			System.out.println("Give a range of the interest rates you are interested in:");
		interestRateStart = in.nextInt();
		interestRateEnd =   in.nextInt();
		in.close();
		
		
	
		System.out.printf("%3s", " ");
		for (int k = yearAmountStart; k <= yearAmountEnd; k ++) {
			System.out.printf("%10d", k);
		}
		System.out.println("\n");

		

		
for (int i = interestRateStart; i <= interestRateEnd; i++) {
			//	int t = (int) (i*100);	
				
			System.out.printf("%3d", i );
			System.out.print("%");
				for(double j = yearAmountStart; j <=yearAmountEnd; j++) {
					double money = investmentAmount * Math.pow((1+i*.01), j);
					System.out.printf("%10.2f", money );
				}
			System.out.println("\n");
		}
		

	}
	
}
