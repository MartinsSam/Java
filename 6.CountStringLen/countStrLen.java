import java.util.Scanner;

public class countStrLen {
	
	public void strLen(String string) {
		String tempString = string;
		int count=0;
		while (!tempString.equals("")) {
			tempString = tempString.substring(1);
			count +=1;
		}
		System.out.println("The string "+ string + " has length equals to " + count);
	}
	public static void main(String args[]) {
		countStrLen test = new countStrLen();
		Scanner read = new Scanner(System.in);
		
		System.out.print("Write the String:");
		test.strLen(read.nextLine());
		
		read.close();
	}
}
