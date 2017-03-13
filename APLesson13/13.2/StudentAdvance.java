public class StudentAdvance extends Ticket
{
	private int daysLeft;
	
	public StudentAdvance(int d)
	{
		daysLeft = d;
		serialNo = super.serialNo;
	}
	
	public String getPrice()
	{
		if(daysLeft > 10)
		{
			return "$15.00";
		}
		else
		{
			return "$20.00";
		}
	}
	
	public int getSerial()
	{
		return serialNo;
	}
	
	public String toString()
	{
		return "Serial #: " + getSerial() +
		"\nPrice: " + getPrice() +
		"\nStudent ID Required";
	}
}