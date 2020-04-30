package tests;
import Health.patient;
import payment.Appointment;
import payment.Billing;

public class Diagnostics extends Appointment implements Billing
{
	patient x;
	int i=0;
	public Diagnostics(patient x)
	{
		this.x=x;
		i++;
	}
	void taketest()
	{
		
	}
	public void generate_report()
	{
		System.out.println("\n");
	}
	void print_report()
	{
		System.out.println("\n");
	}
	public void print_receipt()
	{
		System.out.println("\n");
	}
	
	//appointment
	
	 public void book_appointments()
	 {
		 
	 }
	
	 public void check_availability()
	 {
		 System.out.println("Morning from 10.00 AM to 12.00 PM");
		 
		 System.out.println("Afternoon 1.30 PM to 5.30 PM");
		 
	 }
	
	 protected void display_slots()
	 {
		 System.out.println("\n");
	 }
	
	public void paymethod() 
	{
		
		System.out.println("The payment methods Available are ");
		
		System.out.println("1: Cash");
		System.out.println("2: Card");
		System.out.println("3: Cheque");
		System.out.println("4: Online Transaction");
		
	}
    
	
}
 