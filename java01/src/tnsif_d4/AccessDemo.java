package tnsif_d4;

public class AccessDemo extends AccessTest{
	

    public static void main(String[] args) {
    	

        AccessDemo obj = new AccessDemo();

        System.out.println("Public Method:" +obj.a); // ✅ public
        System.out.println("Protected Method:" +obj.b); // ✅ protected (inheritance)
        // System.out.println(obj.c); // ❌ default
        // System.out.println(obj.d); // ❌ private
     }
}