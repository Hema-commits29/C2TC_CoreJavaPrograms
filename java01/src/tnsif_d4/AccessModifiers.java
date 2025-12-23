package tnsif_d4;

public class AccessModifiers {
	
	public String name = "Neha";
	private int age = 22;
	protected String sex = "Female";
	
	String city = "Chennai";
	
	public void display () {
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
		System.out.println("Sex:" +sex);
		System.out.println("City:" +city);
		
	}

	public static void main(String[] args) {
		
		AccessModifiers ame = new AccessModifiers();
		ame.display();

		
	}

}
