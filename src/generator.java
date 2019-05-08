
public class generator {
	int inputNumber = 0;

	generator(int iN){
		iN = inputNumber;
	}
	
	boolean isPrime() {
		
		for(int i = 2; i <= inputNumber; i ++) {
			int mod = inputNumber%i;
			if(mod == 0) {
				return false;
			}
	
		}

	return true;
		
		
	}
	
	void primePrint() {
		if(isPrime() == true) {
			System.out.println(inputNumber);
		
			}
		}
	}


