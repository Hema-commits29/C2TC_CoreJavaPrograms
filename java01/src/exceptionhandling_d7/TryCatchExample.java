package exceptionhandling_d7;

public class TryCatchExample {
	static int performDivision(int x, int y) {
		System.out.println("I'm in the performDivision method");
		int z=0;
		z=x/y;
		return z;
	}
	
	static float performDivision(float a, float b) {
		return a/b;
	}

}
