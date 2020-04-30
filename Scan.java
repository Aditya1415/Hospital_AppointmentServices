package tests;
import Health.patient;

public class Scan extends Diagnostics
{

	String location;
	Scan(patient p,String loc)
	{
		super(p);
		location=loc;
	}
	
}
