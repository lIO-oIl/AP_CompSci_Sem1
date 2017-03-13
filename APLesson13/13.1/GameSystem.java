public class GameSystem
{
	public String platform;
	public int serialNo;
	
	public GameSystem()
	{
		platform = "";
		serialNo = (int)(Math.random() * 10000000) + 1;
	}
	
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random() * 10000000) + 1;
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerial()
	{
		return serialNo;
	}
}