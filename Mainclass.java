package m1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import Health.Hospital;
import Health.doctor;
import Health.patient;
import tests.CTScan;

public class Mainclass
{

	public static void main(String[] args)
	{
		
		//taking the parameters as Name,email,phone no,Temperature,height,age
		
		
		ArrayList<patient> a=new ArrayList<patient>();
		
        a.add(new patient("Abhinav","a@gmail.com",1111111,65.4f,104.6f,145,21,"Fever"));
        a.add(new patient("Abishek","b@gmail.com",2222222,55.4f,108.6f,148,14,"Cold"));
        a.add(new patient("Akshay","c@gmail.com",3333333,54.4f,98.6f,156,27,"Cough"));
        a.add(new patient("Asif","d@gmail.com",4444444,58.4f,102.6f,170,29,"Headache"));
        a.add(new patient("Benny","e@gmail.com",5555555,48.4f,100.6f,165,24,"Cough"));
      
        
        //sorting the data using the collections
        
        int i,j;
        comp c1=new comp();
        
        Collections.sort(a,c1);
        
        //creating doctor references
        //doctor name,specialization,email,phone no
        doctor d1=new doctor("Ramesh","Physician","d1@gmail.com",9632587);
        doctor d2=new doctor("Suresh","Neurologist","d2@gmail.com",9999999);
        
        //assigning to doctors as per temperatures
       
       for(patient p:a)
       {
    	   if(p.temp <102) //assigning to doctor2
    	   {
    		   d2.priority.add(p);
    		   p.cost=600;
    	   }
    	   else
    	   {
    		   d1.priority.add(p);
    		   p.cost=500;
    	   }
       }
        
       Hospital h=Hospital.getdata();
     
       //We need to create a hash map of key and values
       
     
       HashMap<doctor,ArrayList<patient>> hm=new HashMap<doctor,ArrayList<patient>>();
       
       hm.put(d1, d1.priority);
       hm.put(d2, d2.priority);
       
       
        
       //getting a set of entries
        
      
       
		Iterator<patient> itr1=d1.priority.iterator();
		patient h1=itr1.next();
		
		Iterator<patient> itr2=d2.priority.iterator();
		
		patient h2=itr2.next();
		patient h3=itr2.next();
		
		h3.ctscan=true;
		h1.ctscan=true;
		
		CTScan d=new CTScan(h3,"Chest","inject");
		CTScan k=new CTScan(h1,"Hand","inh");
		
		d1.doctordisplay();
		
		d2.doctordisplay();
		
		d1.generate_report();
		
		d2.generate_report();
		
		
	
	}
        
}


