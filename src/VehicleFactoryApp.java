
public class VehicleFactoryApp {

	public static void main(String[] args)
	{
		/*
		Plane p = new Plane("Boeing", "white");
		System.out.println(p.run());
		System.out.println(p.stop());
		System.out.println(p.accelerate());
		System.out.println(p.fly());
		System.out.println(p.stop());
		
		Boat b = new Boat("Bismarck", "black");
		System.out.println(b.run());
		System.out.println(b.stop());
		System.out.println(b.accelerate());
		System.out.println(b.stop());
		
		Car c = new Car("Toyota", "red");
		System.out.println(c.run());
		System.out.println(c.accelerate());
		System.out.println(c.drift());
		System.out.println(c.stop());
		*/
		
		Car redPorsche = new Car("Porsche", "red");
		Car blueJetta = new Car("Jetta", "blue");
		System.out.println(redPorsche.run());
		System.out.println(blueJetta.run());
		System.out.println(redPorsche.accelerate());
		System.out.println(blueJetta.accelerate());
		blueJetta.setStatus("has stopped to have its emissions checked.");
		System.out.println(blueJetta.toString());
		blueJetta.setStatus("passes its emissions test");
		System.out.println(blueJetta.toString());
		System.out.println(redPorsche.setSpeed(50));
		System.out.println(redPorsche.stop());
		blueJetta.setStatus("just passed the " + blueJetta.getColor() + " " + blueJetta.getMake());
		System.out.println(blueJetta.toString());
	}
}
