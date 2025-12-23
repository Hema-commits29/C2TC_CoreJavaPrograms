package wrapperClass;

public class WrapperCreation {

	public static void main(String[] args) {
		
		//Autoboxing: Primitive to object
		
			int x = 29;
			double y = 16.6;
			char ch = 'S';
				
			Integer intobj = x;
			Double doubleobj = y;
			Character charobj = ch;
				
		//Unboxoing: Object to Primitive
				
			int c = intobj;
			double d = doubleobj;
			char e = charobj;
				
			System.out.println("The Autoboxing integer value is:" +intobj);
			
			System.out.println("The Autoboxing double value is:" +doubleobj);
				
			System.out.println("The Autoboxing character value is:" +charobj);
		

	}

}
