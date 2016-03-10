
public class Plane extends Vehicle{

	public Plane()
	{
		
	}
	
	public Plane(String make_)
	{
		super(make_);
	}
	
	public Plane(String make_, String color_)
	{
		super(make_, color_);
	}
	
	public String fly()
	{
		setStatus("flying");
		return "The " + getColor() + " " + getMake() + " is flying.";
	}
	
	@Override
	public String stop()
	{
		String stopState = "The " + getColor() + " " + getMake();
		if(getStatus().equals("flying"))
		{
			setStatus("falling");
			stopState += " is falling.";
		}
		else
		{
			setStatus("off");
			stopState += " has stopped.";
		}
		return stopState;
	}
}
