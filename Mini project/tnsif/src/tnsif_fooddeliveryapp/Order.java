package tnsif_fooddeliveryapp;

import java.util.Map;

public class Order {
    private int orderId;
    private Customer customer;
    private Map<FoodItem, Integer> items;
    private DeliveryPerson deliveryPerson;
  //private Option option;
    private int estimatedTime;

    public Order(int orderId, Customer customer, Map<FoodItem, Integer> items) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.estimatedTime = estimateTime();
    }
    
    public int getOrderId() {
		return orderId;
	}

	public Customer getCustomer() {
		return customer;
	}


    private int estimateTime() {
        int totalQty = items.values().stream().mapToInt(i -> i).sum();
        return totalQty > 3 ? 50 : 30;
    }

    public void assignDeliveryPerson(DeliveryPerson dp) {
        this.deliveryPerson = dp;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId +
                ", Customer: " + customer.getUsername() +
                ", ETA: " + estimatedTime + " mins" +
                ", Delivery: " + (deliveryPerson == null ? "Not Assigned" : deliveryPerson.getName());
    }

	
	public Map<FoodItem, Integer> getItems() {
		return items;
	}

}

