import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type your paragraph: ");
		String userInput = scanner.nextLine();
		scanner.close();
		userInput = userInput.trim();
		int count = 0;
		
		if(userInput.length() == 0) {
			count = 0;
		}
		else {
			count++;
			for(int i = 0; i < userInput.length(); i++) {
				if(userInput.charAt(i) == ' ' && userInput.charAt(i+1) != ' ') {
					count++;
				}
			}
		}
		
		System.out.println("Word count: " + count);

	}

}
