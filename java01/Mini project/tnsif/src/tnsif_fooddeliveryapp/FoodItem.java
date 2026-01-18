package tnsif_fooddeliveryapp;

enum CuisineType {
    INDIAN, CHINESE, ITALIAN, AMERICAN,MEXICAN, BELGIAN,NEPALI,DESERT, AFRICAN, WESTERN, FRENCH, GERMAN, IRISH
}
public class FoodItem {
	 private int id;
	    private String name;
	    private double price;
	    private CuisineType cuisine;
	    private double discount;
 public FoodItem(int id, String name, double price, CuisineType cuisine) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.cuisine = cuisine;
	        this.discount = 10;
	    }

	    public double getFinalPrice() {
	        return price - (price * discount / 100);
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setDiscount(double discount) {
	        this.discount = discount;
	    }
	    @Override
	    public String toString() {
	        return  name + " | Rs." + getFinalPrice() + " | " + cuisine + " | " + "\n";
	    }

	    
}