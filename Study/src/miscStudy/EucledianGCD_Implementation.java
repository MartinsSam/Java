package miscStudy;

public class EucledianGCD_Implementation {
	public int euclideanAlgorithm(int a, int b) {
		int r;
		
		if (b > a) {
			int temp = b;
			b = a;
			a = temp;
		} 
		if (a == 0 ) {
			return b;
		}
		else if(b == 0) {
			return a;
		}else {
			while(b!=0) {
				r = a%b;
				a = b;
				b = r;				
			}
			return a;
		}		
	}
	
	public static void main(String args[]) {
		EucledianGCD_Implementation test = new EucledianGCD_Implementation();
		System.out.println(test.euclideanAlgorithm(192, 270));
	}
}

