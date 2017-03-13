public abstract class Ticket
{
	public int serialNo;
	
	public Ticket()
	{
		serialNo = (int)(Math.random() * 10000000) + 1;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract String getPrice();
	
	public String toString()
	{
		return "Serial #: " + serialNo +
		"\nPrice: " + getPrice();
	}
}