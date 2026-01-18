package tnsif_fooddeliveryapp;
import java.util.ArrayList;
import java.util.List;


public class Restaurant {
	    private int id;
	    private String name;
	    private List<FoodItem> menu;

	/*    public Restaurant(int id, String name, String menu) {
	        this.id = id;
	        this.name = name;
	        this.menu = new ArrayList<>(); 
	    }*/
	    
	    public Restaurant(int id, String name) {
	        this.id = id;
	        this.name = name;
	        this.menu = new ArrayList<>();
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public List<FoodItem> getMenu() {
	    	
	        return menu;
	    }

	    public void addFoodItem(FoodItem item) {
	        this.menu.add(item);
	    }

	    public void removeFoodItem(int id) {
	        if (id >= 0 && id < menu.size()) {
	            this.menu.remove(id);
	        }
	    }

	    @Override
	    public String toString() {
	        return "Restaurant [id=" + id + ", name=" + name + ", menu=" + menu + "]";
	    }
	}