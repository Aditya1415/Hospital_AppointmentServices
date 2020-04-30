package Health;

import java.io.*;
import java.util.ArrayList;


public class Receiptonist implements Runnable 
{

	Thread t;
	String s;
	doctor doctorref;
	ArrayList<patient> al=new ArrayList<patient>();
	Receiptonist(doctor dr,ArrayList priority)
	{
		doctorref = dr;//who refers to which doctor
		al=priority;
		t=new Thread(this,"recp1"); //assigning the name for the receiptonist
		System.out.println("Reciptionst Name:"+t);
		t.start(); //making the thread to start run		
	}

	public void run() 
	{

		try {
			printprescription();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	int i;
	static int  count=0; //declared static
	
	void printprescription() throws IOException
	{
		
		String link="E:\\patient";
		System.out.println(doctorref.nop);
		for(patient s:al)
		{
			
			count++;
			String loc=link+count;
			File f1=new File(loc);
			
			//if there is no file just try to create a new file
			
			//f1.createNewFile();
			
			String p_name="Name:"+s.name;
			String p_age="Age:"+s.age;
			String p_height="Height:"+s.height;
			String p_weight="Weight:"+s.weight;
			String p_phoneno="PhoneNO:"+s.phoneno;
			String p_email="Email:"+s.email;
			String p_temp="Temperature:"+s.temp;
			String p_disease="Disese:"+s.disease;
			String newline="\n";
			//need to convert this data into bytes
			byte bb[]=p_name.getBytes();
			byte bb1[]=p_age.getBytes();
			byte bb2[]=p_height.getBytes();
			byte bb3[]=p_weight.getBytes();
			byte bb4[]=p_phoneno.getBytes();
			byte bb5[]=p_email.getBytes();
			byte bb6[]=p_temp.getBytes();
			byte bb7[]=newline.getBytes();
			byte bb8[]=p_disease.getBytes();
			
			
			//need to convert this data into bytes
			
			FileOutputStream fout=new FileOutputStream(f1);
			//ByteArrayInputStream byin=new ByteArrayInputStream(bb);
			
			//ByteArrayOutputStream bout=new ByteArrayOutputStream(fout);
			fout.write(bb);
			fout.write(bb7);
			fout.write(bb1);
			fout.write(bb7);
			fout.write(bb2);
			fout.write(bb7);
			fout.write(bb3);
			fout.write(bb7);
			fout.write(bb4);
			fout.write(bb7);
			fout.write(bb5);
			fout.write(bb7);
			fout.write(bb6);
			fout.write(bb7);
			fout.write(bb8);
			fout.write(bb7);

			
			
			
			
			//bout.write(bb);
			
			
			//we can also do in this way by taking bytearrayunputstream
			/*
			 /* while(byin.available()!=0){
                // System.out.print((char) byin.read());
                bout.write((char) byin.read());
            } */
			 
			 
			fout.flush();
			//bout.flush();
			//bout.close();
			fout.close();
		}
	}
			
			
			
			
			
			
			
		
		
}
