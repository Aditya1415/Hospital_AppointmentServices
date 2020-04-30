
package userinterfaces;
import java.applet.*;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class patientui extends JApplet 
{

	
	
	JLabel name;
	JLabel temp;
	JLabel weight;
	JLabel height;
	JLabel age;
	JLabel disease,email;
	
	JTextField name1;
	JTextField temp1;
	JTextField weight1;
	JTextField height1;
	JTextField age1;
	JTextField disease1,email1;
	
	JButton bt;
	
	
	public void init()
	{
		 setLayout(new FlowLayout(FlowLayout.LEFT));
		 
		 name=new JLabel("Name:",Label.RIGHT);
		 temp=new JLabel("Temp:",Label.LEFT);
		 weight=new JLabel("Weight",Label.LEFT);
		 height=new JLabel("Height",Label.LEFT);
		 age=new JLabel("Age",Label.LEFT);
		 disease=new JLabel("Disese",Label.LEFT);
		 email=new JLabel("Email",Label.LEFT);
		 
		 
		 //adding new text fields
		  name1=new JTextField(45);
		  
		  temp1=new JTextField(45);
		  weight1=new JTextField(45);
		  height1=new JTextField(45);
		  age1=new JTextField(45);
		  disease1=new JTextField(45);
		  email1=new JTextField(45);
		  
		 
		bt=new JButton("Submit");
		  
		 
		  add(name);
			 add(name1);
			
			 add(temp);
			 add(temp1);

			 add(weight);
			 add(weight1);
			
			 add(height);
			 add(height1);

			 add(age);
			 add(age1);

			 add(disease);
			 add(disease1);
			 
			 
			 add(email);
			 add(email1);
		
			 add(bt);
		 setVisible(true);
		 setSize(500,500);
		 
	}
	
	
	
	
	
	
	
	
}