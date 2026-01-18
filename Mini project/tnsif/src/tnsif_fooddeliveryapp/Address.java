package tnsif_fooddeliveryapp;

public class Address {

    private String doorNo;
    private String streetName;
    //private String city;
    //private String state;
    private int pincode;

    // Constructor
    
    public Address( int pincode, String streetName, String doorNo) {
        this.doorNo = doorNo;
        this.streetName = streetName;
        //this.city = city;
        //this.state = state;
        this.pincode = pincode;
    }

    // Getters method
    public String getHouseNo() {
        return doorNo;
    }

    public String getStreet() {
        return streetName;
    }

    /*public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }*/

    public int getPincode() {
        return pincode;
    }

    // toString method
    
    @Override
    public String toString() {
        return doorNo + ", " + streetName + ", " +" - " + pincode;
    }
}