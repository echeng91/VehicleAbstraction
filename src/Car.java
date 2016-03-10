
public class Car extends Vehicle{

	private int speed;
	
	public Car()
	{
		
	}
	
	public Car(String make_)
	{
		super(make_);
	}
	
	public Car(String make_, String color_)
	{
		super(make_, color_);
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public String setSpeed(int speed_)
	{
		speed = speed_;
		return "The " + getColor() + " " + getMake() + " is going " + speed + " mph.";
	}
	
	public String drift()
	{
		setStatus("drifting");
		return "The " + getColor() + " " + getMake() + " is drifting.";
	}
}
