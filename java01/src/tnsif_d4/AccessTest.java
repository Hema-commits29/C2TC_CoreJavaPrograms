package tnsif_d4;

public class AccessTest {

	public int a = 10;          // public
    protected int b = 20;       // protected
    int c = 30;                 // default
    private int d = 40;         // private

    public void show() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}


