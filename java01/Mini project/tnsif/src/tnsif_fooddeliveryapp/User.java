package tnsif_fooddeliveryapp;

public abstract class User {
	
	private int userId;
    private String username;
    private long contactNo;
    private Address address;   // HAS-A 

    // Constructor
    
    public User(int userId, String username, long contactNo, Address address) {
        if (userId <= 0)
            throw new IllegalArgumentException("User ID must be positive");
        
        if (username == null || username.trim().isEmpty())
            throw new IllegalArgumentException("Username cannot be empty");
        
        if (address == null)
            throw new IllegalArgumentException("Address cannot be null");

        this.userId = userId;
        this.username = username;
        this.contactNo = contactNo;
        this.address = address;
    }

    //getters
    
    public int getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public long getContactNo() {
		return contactNo;
	}

	public Address getAddress() {
		return address;
	}
	
	// Abstract method 
    public abstract String getRole();


	@Override
    public String toString() {
        return "User ID: " + userId +
               ", Username: " + username +
               ", Contact No: " + contactNo +
               ", Address: " + address +
               ", Role: " + getRole();
    }

}
