package tnsif_d3;

public class Encapsulation {

	private String name;
	private int age;
	private int salary;

	public Encapsulation(){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary(){
		return salary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}

@Override
public String toString() {
	return "Name= "+name+", Age="+age+", Salary= "+salary;
}
}
