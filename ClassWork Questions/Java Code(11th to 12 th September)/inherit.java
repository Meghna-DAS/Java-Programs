import java.util.Scanner;

class EMPbase
{
	private String Name;
	private String email;
	private String dept;
	private String phone;
	private String qualification;
	private String Month;
	
//display the value from the user
	public void setdata()
	{
	System.out.println("EMP Name :" + Name);
	System.out.println("Employee Department :" + dept);
	System.out.println("Employee Email :" + email);
	System.out.println("Employee Phone number :" + phone);
	System.out.println("Employee qualification :" + qualification);
	System.out.println("Employee Month :" + Month);
	System.out.println("*********************************");
	}

//accept the value from the user
	public void getdata()
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Employee name:");
	Name= sc.nextLine();
	System.out.print("Department name:");
	dept= sc.nextLine();
	System.out.print("Employee email:");
	email= sc.nextLine();
	System.out.print("Employee Phone number:");
	phone= sc.nextLine();
	System.out.print("Qualification of the employee:");
	qualification= sc.nextLine();
	System.out.print("Month:");
	Month= sc.nextLine();	
	System.out.println("*********************************");
    }
}
	
//EMPbase

class F_Employee extends EMPbase
{
	private String desg;
	private double basicpay;
	private double finalsalary;
	
	public void getvalue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Employee basic salary:");
		basicpay = sc.nextDouble();
		System.out.print("Employee designation:");
		desg= sc.next();
		System.out.println("*********************************");
	}
		
		
		
	public void calpay_f()
	{
		double DA,TA,HRA;
		DA= 0.9*basicpay;
		TA=0.8*basicpay;
		HRA=0.5*basicpay;
		finalsalary=DA+TA+HRA;
		
	}
	public void displaypay()
	{
	System.	out.println("Monthly salary:"+finalsalary);
	System.out.println("*********************************");
	}
	
	
}

class P_Employee extends EMPbase
{
	private double pay;
	private double extrahour;
	private int experience;
	private double finalsalary;
	private double cpay;
	
	public void  getvalue()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Employee experience:");
		experience= sc.nextInt();
		System.out.println("Employee works extra hours:");
		extrahour= sc.nextDouble();
		System.out.println("*********************************");
		
	}


	public void calpay_p()
	{
		if(experience <= 5 )
		  cpay=20000;
	    else if(experience >5 && experience <=10)
			cpay=30000;
		else
			cpay=50000;
	  
	  finalsalary=cpay + (extrahour *1000);
	}
	
	public void displaypay()
	{
		System.out.println("Final salary:"+ finalsalary);
		System.out.println("*********************************");
	}
	
}



class inherit
{
	public static void main(String args[])
	{
		//create the object of fulltime employee
		F_Employee f1=new F_Employee();
		P_Employee p1= new P_Employee();
		
		//create the object of parttime employee
		f1.getdata();
		f1.getvalue();
		f1.calpay_f();
		f1.setdata();
		f1.displaypay();
		
		//call the respective functions
		p1.getdata();
		p1.getvalue();
		p1.calpay_p();
		p1.setdata();
		p1.displaypay();
	}
}