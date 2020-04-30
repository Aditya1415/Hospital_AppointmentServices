package tests;
import Health.patient;

public class CTScan extends Scan
{

	String type_of_injection;
	public CTScan(patient p,String loc,String type)
	{
		super(p,loc);
		type_of_injection=type;
		
	}
	
	public void display_slots()
	{
		System.out.println(x.name+"--->"+"12'0 Clock");
	}
	
	public void book_appointments()
	{
		System.out.println("Please visit the Diagnostics prior 10 minutes before");
	}
	
	public void generate_report()
	{
		System.out.println("\n");
		System.out.println("Injection Type:"+type_of_injection);
		
	}
	
	
}
