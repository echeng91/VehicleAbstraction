
public abstract class Vehicle {

	private String status;
	private String make;
	private String color;
	
	public Vehicle()
	{
		
	}
	
	public Vehicle(String make_)
	{
		make = make_;
		color = "";
		status = "";
	}
	public Vehicle(String make_, String color_)
	{
		make = make_;
		color = color_;
		status = "";
	}
	
	public String getStatus()
	{
		return status;
	}
	public String getMake()
	{
		return make;
	}
	public String getColor()
	{
		return color;
	}
	
	public void setStatus(String status_)
	{
		status = status_;
	}
	public void setMake(String make_)
	{
		make = make_;
	}
	public void setColor(String color_)
	{
		color = color_;
	}
	
	public String run()
	{
		String runState = "The " + color + " " + make + " is ";
		if(status.equals("on"))
		{
			runState += "running.";
		}
		else
		{
			runState += "starting.";
		}
		setStatus("on");
		return runState;
	}
	public String stop()
	{
		setStatus("off");
		return "The " + color + " " + make + " is stopped.";
	}
	public String accelerate()
	{
		setStatus("accelerating");
		return "The " + color + " " + make + " is accelerating.";
	}
	
	@Override
	public String toString()
	{
		return "The " + color + " " + make + " " + status;
	}
}
