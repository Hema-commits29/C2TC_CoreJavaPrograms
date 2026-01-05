package nonAccessModifiers;

public class FinalKeyword {
	int value = 100;
	
	void printMessage() {
		System.out.println("This is the final method:" +value);
		
	}
	
	class Example extends FinalKeyword{
		void printMessage() {
			
		}
	}


	public static void main(String[] args) {
		
		FinalKeyword fk = new FinalKeyword();
		fk.printMessage();
		
		fk.value = 200;
		fk.printMessage();
		

	}

}
