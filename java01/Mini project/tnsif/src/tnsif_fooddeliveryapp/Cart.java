package tnsif_fooddeliveryapp;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	
	    private Map<FoodItem, Integer> items = new HashMap<>();

	    public void addItem(FoodItem foodItem, int quantity) {
	        items.put(foodItem, items.getOrDefault(foodItem, 0) + quantity);
	    }

	    public Map<FoodItem, Integer> getItems() {
	        return items;
	    }

	    public void clearCart() {
	        items.clear();
	    }

	    @Override
	    public String toString() {
	        double total = 0;
	        StringBuilder sb = new StringBuilder();
	        for (Map.Entry<FoodItem, Integer> entry : items.entrySet()) {
	            double cost = entry.getKey().getFinalPrice() * entry.getValue();
	            total += cost;
	            sb.append("Food Item: ").append(entry.getKey().getName())
	              .append(", Quantity: ").append(entry.getValue())
	              .append(", Cost: Rs. ").append(cost).append("\n");
	        }
	        sb.append("Total Cost: Rs. ").append(total);
	        return sb.toString();
	    }
	}
