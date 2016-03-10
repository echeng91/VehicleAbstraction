
public class Boat extends Vehicle{

	public Boat()
	{
		
	}
	
	public Boat(String make_)
	{
		super(make_);
	}
	
	public Boat(String make_, String color_)
	{
		super(make_, color_);
	}
	
	@Override
	public String stop()
	{
		String stopState = "The " + getColor() + " " + getMake();
		if(getStatus().equals("accelerating"))
		{
			setStatus("drifting");
			stopState += " is drifting.";
		}
		else
		{
			setStatus("off");
			stopState += " has stopped.";
		}
		return stopState;
	}
}
