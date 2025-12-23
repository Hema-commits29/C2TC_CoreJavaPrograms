package exceptionhandling_d7;

public class TryCatchExercise {

	public static void main(String[] args) {
		
		System.out.println("Hyy...I'm in the main method");
		int result;
		try {
			result = TryCatchExample.performDivision(16,0);
			if(result != 0)
				System.out.println("The Division value is:" +result);
			
			System.out.println("---------------------");
			
			result = TryCatchExample.performDivision(29,3);
			if(result !=0)
				System.out.println("The Division value is:" +result);
			
			System.out.println("----------------------");
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("I'm in the catch block" +e.getMessage());
			
			e.printStackTrace();
		}
		
		System.out.println(TryCatchExercise.performDivision(12f,5f));
		
		System.out.println("----------------------");
		System.out.println(TryCatchExercise.performDivision(12f,0f));

	}
    public static float performDivision(float a, float b) {
		return a/b;
	}
	


}
