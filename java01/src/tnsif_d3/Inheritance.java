package tnsif_d3;


	class Vehicle{
		
		String name;
		
		//Constructor - to initialize the value
		
		Vehicle(String name){
			this.name = name;
		}
		
		
		void display() {
			System.out.println("Vehicle type: "+name);
		}
		
	}


	class Cars extends Vehicle{
		
		String brand;
		
		 Cars(String name, String brand){
			super(name);
			this.brand = brand;
		}
		
		void showDetails() {
			display();
			System.out.println("Vehicle brand is: "+brand);
		}
	}

	//multilevel

	class Grandparent {
		
		void gp() {
			System.out.println("Grand parent Class");
		}
		
	}


	class Parent extends Grandparent{
		
		void p() {
			System.out.println("Parent Class");
		}
		
	}

	class Child extends Parent{
		
		void c() {
			System.out.println("Child Class");
		}
		
	}

	//Hierarchical inheritance

	class Color{
		void allColors() {
			System.out.println("All colors");
		}
	}

	class White extends Color{
		void onlywhite() {
			System.out.println("My favourite color is white");
		}
	}

	class Black extends Color{
		void onlyblack() {
			System.out.println("My favourite color is black");
		}
	}

	//multiple inheritance


	/*
	 * class A{ //Parent 1
	 * 
	 * }
	 * 
	 * class B{ //parent 2
	 * 
	 * }
	 * 
	 * class C extends A,B {
	 * 
	 * }
	 */

	interface A{
		
	}

	interface B{
		
	}

	class C implements A,B{
		
	}
	
	public class Inheritance {

	public static void main(String[] args) {
		
		
		 Cars c = new Cars("Car","LandRover");
		 c.showDetails();
		
		//Multilevel
		Child ch = new Child();
		ch.gp();
		ch.p();
		ch.c();
		
		Parent p = new Parent();
		p.gp();
		p.p();
		
		
		//hierarchical
		
		White w = new White();
		w.allColors();
		w.onlywhite();
		
		
		Black b = new Black();
		b.allColors();
		b.onlyblack();
		
			

		}
	}

