package m1;

import java.util.Comparator;

import Health.patient;

public class comp implements Comparator<patient>
{
	
public int compare(patient o1, patient o2)
{

	if (o1.temp < o2.temp) return 1; 
	if (o1.temp > o2.temp) return -1; 
    else return 0;
}


}