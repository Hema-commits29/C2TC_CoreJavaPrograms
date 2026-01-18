package tnsif_fooddeliveryapp;

public class DeliveryPerson {		
	private int deliverypersonid;
	private String name;
	private long contactNo;
	
	DeliveryPerson(int deliverypersonid, String name, long contactNo ){
	this.deliverypersonid = deliverypersonid;
	this.name = name;
	this.contactNo = contactNo;
}
	public int getDeliverypersonid() {
	return deliverypersonid;
}
public String getName() {
	return name;
}

public long getContactNo() {
	return contactNo;
}

	@Override
public String toString() {
	return "Delivery personid=" + deliverypersonid + ", name=" + name + ", contactNo=" + contactNo;
			
	}
}

