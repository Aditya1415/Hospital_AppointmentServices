package Health;

public class patient 
{

	//taking the parameters as Name,email,phone no,Temerature,height,age
	public String name;
    String email;
    long phoneno;
    float weight;
    public float temp;
    int height;
    int age;
    public int cost;
    public boolean ctscan=false;
    String disease;
    
    //here the cost includes the billing cost and the doctor fees
    
    
    //constructor
    
    public patient(String name,String email,long phoneno,float weight,float temp,int height,int age,String disease)
    {
    	this.name=name;
        this.email=email;
        this.phoneno=phoneno;
        this.weight=weight;
        this.temp=temp;
        this.height=height;
        this.age=age;
        this.disease=disease;
    }
    
    public void display()
    {
    	System.out.println("Name:"+name);
        System.out.println("Email:"+email);
        System.out.println("Phone no:"+phoneno);
        System.out.println("Weight:"+weight);
        System.out.println("Temperature:"+temp);
        System.out.println("Height"+height);
        System.out.println("Age:"+age);
        System.out.println("Disese:"+disease);
    }
	
	
	
}
