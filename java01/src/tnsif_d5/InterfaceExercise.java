package tnsif_d5;

interface Vehicle {
    void start();
    void stop();
    int getMaxSpeed();
}

//Normal Interface

public class InterfaceExercise implements Vehicle {
    private int maxSpeed;
    private int electricRange;

    //Constructors
    
    public InterfaceExercise(int maxSpeed, int electricRange) {
        this.maxSpeed = maxSpeed;
        this.electricRange = electricRange;
    }
    
    @Override
    public void start() {
        System.out.println("The Electric car has started ...!!");
    }
    
    public void stop() {
        System.out.println("The Electric car stopped...!!");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getElectricRange() {
        return electricRange;
    }

	public static void main(String[] args) {
		
		InterfaceExercise  tesla = new InterfaceExercise (250, 500);
	    tesla.start();
	    
	    System.out.println("Max Speed: " + tesla.getMaxSpeed() + " km/h");
	    System.out.println("Electric Range: " + tesla.getElectricRange() + " km");
	    
		
	}

}
