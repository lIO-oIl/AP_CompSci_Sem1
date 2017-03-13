public class XBox extends Console
{
	private String platform;
	private int serialNo;
	
	public XBox()
	{
		super();
	}
	
	public XBox(String p)
	{
		super(p);
	}
	
	public String getPlatform()
	{
		return "XBox";
	}
	
	public int getSerial()
	{
		return serialNo;
	}
	
	public String getController()
	{
		return "XBox Wireless Controller";
	}
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() +
		"\nSerial #: " + super.getSerial() +
		"\nController: " + getController();
	}
}