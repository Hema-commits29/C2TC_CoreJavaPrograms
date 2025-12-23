package nonAccessModifiers;

public class FinalKeyword {
	int VALUE = 100;
	
	void printMessage() {
		System.out.println("This is the final method:" +VALUE);
		
	}

	public static void main(String[] args) {
		
		FinalKeyword fk = new FinalKeyword();
		fk.printMessage();
		
		fk.VALUE = 200;
		fk.printMessage();
		

	}

}
class Example extends FinalKeyword{
	void printMessage() {
		
	}
}
