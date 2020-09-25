package bridge.VechicleManufactureExample;

//implementor of bridge pattern
interface Workshop{
	abstract public void work();
}

//Concrete implementation for bridge pattern
class Produce implements Workshop{

	@Override
	public void work() {
		System.out.println("Produced");
	}
	
}

//concrete implemenation -2 for bridge pattern
class Assemble implements Workshop{

	@Override
	public void work() {
		System.out.println(" Assembled");
	}
	
}

//abstraction in bridge pattern
abstract class Vehicle{
	protected Workshop workshop1;
	protected Workshop workshop2;
	
	public Vehicle(Workshop workshop1,Workshop workshop2) {
		this.workshop1 = workshop1;
		this.workshop2 = workshop2;
	}
	
	abstract public void manufacture();
}

//refine abstraction in bridge pattern
class Bike extends Vehicle{
	
	public Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}

	@Override
	public void manufacture() {
		System.out.println("Bike manufacture");
		workshop1.work();
		workshop2.work();
	}
	
}

//refine abstraction2 in bridge pattern
class Car extends Vehicle{

	public Car(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}

	@Override
	public void manufacture() {
		System.out.println("Car manufacture");
		workshop1.work();
		workshop2.work();
	}
}

public class VehicleManufactureDemo {
	
	public static void main(String[] args) {
		Vehicle vehicle1 = new Car(new Produce(),new Assemble());
		vehicle1.manufacture();
		
		Vehicle vehicle2 = new Bike(new Produce(),new Assemble());
		vehicle2.manufacture();
	}
}
