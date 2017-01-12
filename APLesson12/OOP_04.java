public class OOP_04
{
	private String hair, eyes, skin;
	
	public OOP_04()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public OOP_04(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setFace(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
}