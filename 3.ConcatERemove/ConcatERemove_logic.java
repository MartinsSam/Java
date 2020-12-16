import java.util.Scanner;
public class ConcatERemove_logic {
	/*
	 * initial_str = Initial String 
	 * desired_str = Desired String
	 * number_of_operation = Number of allowed operations 
	*/
	private String ConcatERemove(String initial_str,String desired_str, int number_of_operation) {
		int count_operation = 0;
		String resultMatch = "Sim";
		String resultDoNotMatch = "Não";		
		
		/*
		 * if the total of allowed operation has at least the desired_string.lenght * 2 
		 * it indicates that all characters can be removed and added following the desired string
		   Return the String that indicates the positive result 
		 */
		if(number_of_operation>=(initial_str.length()*2)) {
			return resultMatch;
		}
		
		
		else{
			boolean isDesired_str_bigger = false;
			/*
			 * If the initial string length is bigger than desired string: check the difference 
			 * If the difference is bigger than the number_of_operation do not need keep checking
			 */
			
			if(initial_str.length() > desired_str.length()){
		
				count_operation = initial_str.length() - desired_str.length();
				if(count_operation > number_of_operation) {
					return resultDoNotMatch;
				}
			}
			/*
			 * If the desired string is bigger than the initial length get the difference 
			 * If the difference is bigger than the number_of_operation do not need keep checking 
			 */
			else if (initial_str.length() < desired_str.length()) {
				count_operation = desired_str.length() - initial_str.length();
				isDesired_str_bigger = true;
				if(count_operation > number_of_operation) {
					return resultDoNotMatch;
				}
			}
			
			/*
			 * Iterate over each index and check if the char is not the same, add +2( 1 to remove/ 1 to concatenate the right char) if it is the case */
			if (!isDesired_str_bigger) {
				for(int i = 0; i < desired_str.length(); i++) {
					count_operation = sumCountOperation(initial_str.charAt(i),desired_str.charAt(i),count_operation);
					//System.out.println("Char Position " + i + " desired_str " + desired_str.charAt(i) + " initial_str " + initial_str.charAt(i));
				}
			}else {
				for(int i = 0; i < initial_str.length(); i++) {
					count_operation = sumCountOperation(initial_str.charAt(i),desired_str.charAt(i),count_operation);
					
				}
			}
			/*
			 * In the end of the iteration check if the result got is bigger than the number of allowed operations
			 * return the String */
			if( count_operation > number_of_operation) {
				return resultDoNotMatch;
			}else {
				return resultMatch;
			}
		}	
	}
	
	private int sumCountOperation (char initial_char, char desired_char, int count_operation) {
		if(initial_char != desired_char) {
			count_operation +=2;
		}
		return count_operation;
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		ConcatERemove_logic test = new ConcatERemove_logic();
		
		String s,t;
		int k = 0;
		
		System.out.print("Initial String: ");
		s = read.next();
		System.out.print("Desired String: ");
		t= read.next();
		
		System.out.print("Number of operations: ");
		k = Integer.parseInt(read.next());
		
		
		System.out.println(test.ConcatERemove(s, t, k));
		
		read.close();
	}

}
