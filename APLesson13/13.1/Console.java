public abstract class Console extends GameSystem
{
	private String platform;
	private int serialNo;
	
	public Console()
	{
		super();
	}
	
	public Console(String p)
	{
		super(p);
	}
	
	public String getPlatform()
	{
		return super.platform;
	}
	
	public int getSerial()
	{
		return super.serialNo;
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + getPlatform() +
		"\nSerial #: " + getSerial() +
		"\nController: " + getController();
	}
}