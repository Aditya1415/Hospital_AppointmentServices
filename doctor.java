package Health;
import java.util.ArrayList;
import java.util.Iterator;

import payment.Appointment;
import payment.Billing;

public class doctor extends Appointment implements Billing
{

	   //doctor name,specialization,email,phoneno
	
	public final String name;
    public final String specialization;
    public final String email;
	long phoneno;
	int nop; //nop refers to no of patients
	
	public ArrayList<patient>priority=new ArrayList<patient>();
	
	
	//for exceptions
	
	boolean personal_work=true;
	
	
    public doctor(String name,String specialization,String email,long phoneno)
    {
        this.name=name;
        this.specialization=specialization;
        this.email=email;
        this.phoneno=phoneno;
        new Receiptonist(this,priority);
    }
    int i=0;
   public void doctordisplay()
   {
	   System.out.println("Doctor Name:"+name);
	   System.out.println("Specialization:"+specialization);
	   System.out.println("Phone no:"+phoneno);
	   System.out.println("Email:"+email);
	   System.out.println();
	   
   }
	
	
	//writing the logic for the abstract methods
	
	 protected void book_appointments()
	 {
		 if(personal_work)
		 {
			 try
			 {
				 DNA e=new DNA("Doctor Not available");
				 throw e;
				
			 }
			 catch(DNA e)
			 {
				 System.out.println(e);
			 }
		 }
		 else
		 {
			 System.out.println("Appointments are Booked");
		 }
		 
	 }
	 
	 
	
	 protected void check_availability()
	 {
		 System.out.println("Morning 10.00 AM to 1.00 PM");
	 }
	
	 
	 
	 protected void display_slots()
	 {
		 Iterator<patient> itr=priority.iterator();
		 i=0;
		 while(itr.hasNext())
		 {
			 patient a=itr.next();
			 System.out.println(a.name+" "+(10+i)+":00"+"AM");
			 i++;
		 }
		 nop=i;
	 }


	public void generate_report() 
	{
		int i=0;
		for(patient p:priority)
		{
			p.display();
			System.out.println("\nTiming:"+(10+i)+":00:AM");
			
			paymethod();
			
			System.out.println("");
			
			print_receipt();
			
			if(p.ctscan)
			{
				System.out.println("The doctor fee is:"+p.cost);
				System.out.println("The Diagnostic fee is:"+"1500Rs");
				System.out.println("The  Total Cost is:"+(p.cost+2500));
				
			}
			else
			{
				System.out.println("The doctor fee is:"+p.cost);
				System.out.println("The  Total Cost is:"+(p.cost+1000));
			}
			
			
		}
		
	}


	public void print_receipt()
	{
		System.out.println("The hospital fee is 1000RS");
		
	}


	public void paymethod() 
	{
		

		
	}
    
	 
	 
	
}
