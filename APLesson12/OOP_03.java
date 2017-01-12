public class OOP_03{
	
	private String paint, interior, engine, tires;
	
	public OOP_03()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	public OOP_03(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public void setCustom(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	/*public setPaint(String p)
	{
		paint = p;
	}
	
	public setInterior(String i)
	{
		interior = i;
	}
	
	public setEngine(String e)
	{
		engine = e;
	}
	
	public setTires(String t)
	{
		tires = t;
	}*/
	
	public String getPaint()
	{
		return paint;
	}
	
	public String getInterior()
	{
		return interior;
	}
	
	public String getEngine()
	{
		return engine;
	}
	
	public String getTires()
	{
		return tires;
	}
}