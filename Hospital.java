package Health;
import payment.Billing;

public class Hospital implements Billing
{
	private static Hospital ref=null;
	
	doctor g;
	
	
	public String s;
	int i;
	private Hospital()
	{
		s="I love Java";
	}
	
	public static Hospital getdata()
	{
		if(ref==null)
		{
			ref=new Hospital();
		}
		return ref;
	}
	
	
	//billing methods
	
	public void generate_report()
	{
		
	}
	
	public void print_receipt()
	{
		
		
		
	}
	
	public void paymethod()
	{
		
	}
	
}
