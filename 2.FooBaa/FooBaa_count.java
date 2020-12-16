
public class FooBaa_count {

	public static void main(String args[]) {
		//The exercise requires a range from 1 to 100. So the count receives 1 and ends when the number bigger than 100
		for(int count = 1; count < 101; count++) {
			String result = null; //this variable keeps the string result when the number is divided by 3 or/and 5
			if(count % 3 == 0) {
				result = "Foo";
			}
			if(count % 5 == 0) {
				result = (result==null? "Baa": result+"Baa");
			}
			System.out.println(result == null?count:result);
		}
	}
}
