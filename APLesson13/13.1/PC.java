public class PC extends GameSystem
{
	private String platform;
	private int serialNo;
	
	public PC()
	{
		super();
	}
	
	public PC(String p)
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
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: " + getPlatform() +
		"\nSerial #: " + getSerial() +
		"\nSystem Input: " + systemInput();
	}
}