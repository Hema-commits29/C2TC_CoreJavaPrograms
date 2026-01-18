package tnsif_fooddeliveryapp;

import java.util.List;

public class FoodCustomization {
	
	private String spiciness;           
    private List<String> addextraToppings;  
    private String extraInstructions; 
    private boolean isVeg;

    // Constructor
    public FoodCustomization(String spiciness, List<String>addextraToppings, String extraInstructions, boolean isVeg) {
        this.spiciness = spiciness;
        this.addextraToppings = addextraToppings;
        this.extraInstructions = extraInstructions;
        this.isVeg = isVeg;
        
    }

    // Getters
    public String getSpiceLevel() {
        return spiciness;
    }

    public List<String> getExtraToppings() {
        return addextraToppings;
    }

    public String getSpecialInstructions() {
        return extraInstructions;
    }
    
    public boolean isVeg() {
    	return isVeg;
    }

    // toString
    @Override
    public String toString() {
        return "Spicy Level: " + spiciness +
               ", Extra Toppings: " + addextraToppings +
               ", Instructions: " + extraInstructions+
               ", Vegetarian: " + (isVeg? "Yes" : "No");        
    }
    
    public static void main(String [] args) {
    	
    	FoodCustomization Pizza = new FoodCustomization("Heavy", List.of("Cheese", "Chicken"), "Give Extra Seasoning", false);
    	FoodCustomization PannerTikka = new FoodCustomization("Medium", List.of("Onion", "Capsicum"), "Nothing", true);
    	
    	System.out.println("Customization of pizza is:" +Pizza);
    	System.out.println("Customization of pannertikka is:" +PannerTikka);
    	
    	//checking items
    	if(Pizza.isVeg) {
    		System.out.println("The pizza is veg");
    	}
    	else {
    		System.out.println("The pizza is nonVeg");
    	}
    	
    	if(PannerTikka.isVeg) {
    		System.out.println("The pannertikka is veg");
    	}
    	else {
    		System.out.println("The panner is nonVeg");
    	}
    		
    	}
    }





