package gettingUserInputs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferCreation {

	public static void main(String[] args) throws IOException {
		
		BufferedReader obj2 = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Enter your name:");
		String name = obj2.readLine();
		
		System.out.println("Enter your register number:");
		int register = Integer.parseInt(obj2.readLine());
		
		System.out.println("My name is " +name + " and my register number is "+register);

		// TODO Auto-generated method stub

	}

}
