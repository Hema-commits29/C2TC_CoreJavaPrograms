package tnsif_fooddeliveryapp;

import java.util.ArrayList;
import java.util.List;

public class Admin {
 static List<Restaurant> restaurant;
 List<DeliveryPerson> deliverypersons;
  public Admin() {
	  restaurant=new ArrayList<>();
	  this.deliverypersons=new ArrayList<>();
	  
  }
  


  public void addRestaurant(Restaurant r) {
      this.restaurant.add(r); 
      
  }
  public void addDeliveryPerson(DeliveryPerson dp) {
      deliverypersons.add(dp);
  }
  public static void main(String[] args) {
  

  }



  public void initRestaurants() {
	  
	  Admin dpob1= new Admin();
      DeliveryPerson dp1= new DeliveryPerson(1, "John", 1234567890L);
      dpob1.addDeliveryPerson(dp1);

	  Restaurant r1 = new Restaurant(1, "Tasty");
	    r1.addFoodItem(new FoodItem(0, "Pizza", 380, CuisineType.INDIAN));
	    r1.addFoodItem(new FoodItem(0, "Burger", 250, CuisineType.INDIAN));
	    r1.addFoodItem(new FoodItem(0, "French Fries", 120, CuisineType.INDIAN));
	    r1.addFoodItem(new FoodItem(0, "Pepsi", 90, CuisineType.INDIAN));
	    r1.addFoodItem(new FoodItem(0, "Tacos", 280, CuisineType.INDIAN));
	    r1.addFoodItem(new FoodItem(0, "Nachos", 250, CuisineType.INDIAN));
	    r1.addFoodItem(new FoodItem(0, "Fried Momos", 180, CuisineType.INDIAN));
	    r1.addFoodItem(new FoodItem(0, "Cheese puff", 80, CuisineType.INDIAN));
	    r1.addFoodItem(new FoodItem(0, "Chicken Sandwich", 140, CuisineType.INDIAN));
	    addRestaurant(r1);
	    
	    
	    Restaurant r2 = new Restaurant(2, "Wood Fire Pizza");
	    r2.addFoodItem(new FoodItem(1, "Margherita Pizza", 185, CuisineType.ITALIAN));
	    r2.addFoodItem(new FoodItem(2, "Cheese and Corn Pizza", 185, CuisineType.ITALIAN));
	    r2.addFoodItem(new FoodItem(3, "Paneer Supreme Pizza", 230, CuisineType.ITALIAN));
	    r2.addFoodItem(new FoodItem(4, "Double Cheese Pizza", 225, CuisineType.ITALIAN));
	    r2.addFoodItem(new FoodItem(5, "Veg Paradise Pizza", 189, CuisineType.ITALIAN));
	    r2.addFoodItem(new FoodItem(6, "Onion Pizza", 180, CuisineType.ITALIAN));
	    r2.addFoodItem(new FoodItem(7, "Peppy Paneer", 240, CuisineType.ITALIAN));
	    r2.addFoodItem(new FoodItem(8, "Mexican Green Wave", 275, CuisineType.ITALIAN));
	    r2.addFoodItem(new FoodItem(9, "Veggie Paradise", 140, CuisineType.ITALIAN));
	    addRestaurant(r2);
	  
	    
	    Restaurant r3 = new Restaurant(3, "Ambur Star Briyani");
	    r3.addFoodItem(new FoodItem(0, "Chicken briyani", 329, CuisineType.INDIAN));
	    r3.addFoodItem(new FoodItem(0, "Chicken 65", 320, CuisineType.INDIAN));
	    r3.addFoodItem(new FoodItem(0, "Chicken fried rice", 300, CuisineType.INDIAN));
	    r3.addFoodItem(new FoodItem(0, "Fish Finger", 280, CuisineType.INDIAN));
	    r3.addFoodItem(new FoodItem(0, "Chettinad Chicken Masala",335, CuisineType.INDIAN));
	    r3.addFoodItem(new FoodItem(0, "Chicken Noodles", 285, CuisineType.INDIAN));
	    r3.addFoodItem(new FoodItem(0, "Garlic Prawn", 350, CuisineType.INDIAN));
	    r3.addFoodItem(new FoodItem(0, "Gobi 65", 245, CuisineType.INDIAN));
	    r3.addFoodItem(new FoodItem(0, "Pallipalayam Chicken", 335, CuisineType.INDIAN));
	    addRestaurant(r3);
	    
	    
	    Restaurant r4 = new Restaurant(4, "Pandiyan Hotel");
	    r4.addFoodItem(new FoodItem(0, "South Indian Meals", 180, CuisineType.INDIAN));
	    r4.addFoodItem(new FoodItem(0, "North Indian Meals", 220, CuisineType.INDIAN));
	    r4.addFoodItem(new FoodItem(0, "Kizhi Parota", 120, CuisineType.INDIAN));
	    r4.addFoodItem(new FoodItem(0, "Poricha Parota", 160, CuisineType.INDIAN));
	    r4.addFoodItem(new FoodItem(0, "Chicken Biriyani", 250, CuisineType.INDIAN));
	    r4.addFoodItem(new FoodItem(0, "Mutton Biriyani", 370, CuisineType.INDIAN));
	    r4.addFoodItem(new FoodItem(0, "Chicken Fried Rice", 200, CuisineType.INDIAN));
	    r4.addFoodItem(new FoodItem(0, "Mutton Fried Rice", 200, CuisineType.INDIAN));
	    addRestaurant(r4);
	    
	    
	    Restaurant r5 = new Restaurant(5, "EatFit");
	    r5.addFoodItem(new FoodItem(1, "Cheesy peri peri bowl", 140, CuisineType.AFRICAN));
	    r5.addFoodItem(new FoodItem(2, "Poha", 99, CuisineType.INDIAN));
	    r5.addFoodItem(new FoodItem(3, "Oatmeal", 140, CuisineType.WESTERN));
	    r5.addFoodItem(new FoodItem(4, "Soya Sabzi", 235, CuisineType.INDIAN));
	    r5.addFoodItem(new FoodItem(5, "Cheesy Chicken bowl", 309, CuisineType.MEXICAN));
	    r5.addFoodItem(new FoodItem(6, "Garlic Chicken", 289, CuisineType.INDIAN));
	    r5.addFoodItem(new FoodItem(7, "Paneer bowl", 250, CuisineType.INDIAN));
	    r5.addFoodItem(new FoodItem(8, "3 layer rice bowl", 275, CuisineType.INDIAN));
	    r5.addFoodItem(new FoodItem(9, "Keema Chicken", 395, CuisineType.INDIAN));
	    addRestaurant(r5);
	    
	    	    
	    Restaurant r6 = new Restaurant(6, "Waffle Mania");
	    r6.addFoodItem(new FoodItem(0, "Red Velvet", 120, CuisineType.DESERT));
	    r6.addFoodItem(new FoodItem(0, "Triple Chocolate", 140, CuisineType.DESERT));
	    r6.addFoodItem(new FoodItem(0, "Naughty Nutty", 150, CuisineType.DESERT));
	    r6.addFoodItem(new FoodItem(0, "Milk and Dark Choco", 180, CuisineType.DESERT));
	    r6.addFoodItem(new FoodItem(0, "Oreo", 180, CuisineType.DESERT));
	    r6.addFoodItem(new FoodItem(0, "Kitkat", 180, CuisineType.DESERT));
	    r6.addFoodItem(new FoodItem(0, "Banana Caramel", 200, CuisineType.DESERT));
	    r6.addFoodItem(new FoodItem(0, "Cookie 'N' Cream", 80, CuisineType.DESERT));
	    r6.addFoodItem(new FoodItem(0, "Lotus Biscoff", 140, CuisineType.DESERT));
	    addRestaurant(r6);
	    
	    
	    Restaurant r7 = new Restaurant(7, "Cake Waves");
	    r7.addFoodItem(new FoodItem(1, "Truffle pastry", 90, CuisineType.FRENCH));
	    r7.addFoodItem(new FoodItem(2, "Black Forest pastry", 75, CuisineType.GERMAN));
	    r7.addFoodItem(new FoodItem(3, "Waves Delight cake", 910, CuisineType.WESTERN));
	    r7.addFoodItem(new FoodItem(4, "Mango Pastry", 80, CuisineType.INDIAN));
	    r7.addFoodItem(new FoodItem(5, "Pineapple cake", 728, CuisineType.MEXICAN));
	    r7.addFoodItem(new FoodItem(6, "Fudge cake", 910, CuisineType.AMERICAN));
	    r7.addFoodItem(new FoodItem(7, "Iresh cake", 871, CuisineType.IRISH));
	    r7.addFoodItem(new FoodItem(8, "Blueberry cake", 910, CuisineType.AMERICAN));
	    r7.addFoodItem(new FoodItem(9, "Almond cake", 1001, CuisineType.INDIAN));
	    addRestaurant(r7);  
	
  }
}
