public class PlayStation extends Console
{
	private String platform;
	private int serialNo;
	
	public PlayStation()
	{
		super();
	}
	
	public PlayStation(String p)
	{
		super(p);
	}
	
	public String getPlatform()
	{
		return "PlayStation";
	}
	
	public int getSerial()
	{
		return serialNo;
	}
	
	public String getController()
	{
		return "PS DualShock 3";
	}
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() +
		"\nSerial #: " + super.getSerial() +
		"\nController: " + getController();
	}
}