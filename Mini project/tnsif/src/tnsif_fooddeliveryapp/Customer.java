package tnsif_fooddeliveryapp;
import java.util.HashSet;
import java.util.Set;

public class Customer extends User {
    protected static Address address;
	private Cart cart = new Cart();

   /* public Customer(int id, String name, long contact, Address address) {
        super(id, name, contact, address);
    }*/

  
	public Customer(int id, String name, long contact, Address address) {
	    super(id, name, contact, address);
	    this.cart = new Cart();
	}



	public Cart getCart() {
        return cart;
    }

	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return null;
	}

}