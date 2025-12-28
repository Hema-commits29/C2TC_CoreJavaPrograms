package gettingUserInputs;

import java.util.Scanner;

public class ScannerCreation {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your favourite movie:");
		String movie = sc.nextLine();
		
		System.out.println("Enter your favourite hero:");
		String hero = sc.nextLine();
		
		System.out.println("My favourite movie is:" +movie +  "\nMy favourite hero is:" +hero);
		
		sc.close();

	
	}

}
