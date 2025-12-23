package tnsif_d5;


//Functional Method


abstract interface EvenorOdd{
	
	boolean isEven(int num);
}

public class CheckingNumbers {

	public static void main(String[] args) {
		
		//lambda expression
		
				EvenorOdd obj = (num) -> num%2==0;
				
				System.out.println(obj.isEven(16));
				System.out.println(obj.isEven(29));

		
	}

}
