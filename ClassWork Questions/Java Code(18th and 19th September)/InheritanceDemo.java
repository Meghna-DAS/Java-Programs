import java.util.*;
import java.util.Scanner;

class Figure
{
	public double r;
	public double a;
	public double v;
	
	public void dispArea()
	{
		
		System.out.println("Area of cone is:"+a);
		System.out.println("*********************************");
	}
	
	public void dispVolume()
	{
		System.out.println("Volume of cone is:"+v);
	    System.out.println("*********************************");
	}
	
}
//figure

class Cone extends Figure
{
	
	public double h;
	public double s;
	public double pi= 3.14;
	
	public void calcArea()
	{
		a = (pi * r *s) + (pi * r  *r);
		System.out.println("*********************************");
	}
		
		
	public void calcVolume()
	{
		v  = (pi * r * r * h) /3;
		System.out.println("*********************************");
	}
	
	
}

class InheritanceDemo
{
	
	
	public static void main(String args[])
	{
		//create the object of cone 
		Cone c1=new Cone();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for a:");
		c1.a= sc.nextDouble();
		
		System.out.println("Enter value for v:");
		c1.v= sc.nextDouble();
		
		System.out.println("Enter value for r:");
		c1.r= sc.nextDouble();
		
		
		//call functions
		c1.calcArea();
		c1.calcVolume();
		c1.dispArea();
		c1.dispVolume();
	}
}