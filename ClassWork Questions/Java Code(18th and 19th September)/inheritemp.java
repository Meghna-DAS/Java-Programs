import java.util.Scanner;
class employee
{
     protected int id;
     protected String name,dept;
     protected double sal;

     employee()
     {
           id = 0;
           name = "";
           dept = "";
           sal = 0.0;

     }     //default constructor

     employee(int id,String name, String dept, double sal)
     {
            this.id=id;
			this.name=name;
			this.dept=dept;
			this.sal=sal;
	}
	
	public void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID:");
		id=sc.nextInt();
		System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter Department:");
		dept=sc.next();	
		System.out.println("Enter Salary");
		sal=sc.nextDouble();
		System.out.println("*********************************************");
	}
    
	public void display ()
     {
           System.out.println ("ID : "+ id);
           System.out.println ("Name : "+ name);
           System.out.println ("Department : "+ dept);
           System.out.println ("Salary : "+ sal);
		   System.out.println("*********************************************");
		   
     }   
}

class manager extends employee
{
	private double bonus;
	private double total;

      manager ()
      {
        bonus=0;
		total=0;
      }
	  
	  manager(int id, String name,String dept, double sal, double bonus)
	  {
	  super(id,name,dept,sal);
	  this.bonus=bonus;
	  }
	  
	  public void inputman()
	  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter bonus:");
	  bonus=sc.nextDouble();
	  System.out.println("*********************************************");
		   
	  }
	  
	  
      public void calSal()
      {
            total = sal + bonus;
      }
	  
	  public void mansal()
	  {
	  System.out.println("Bonus: "+ bonus);
	  System.out.println("Total Salary: "+total);
	  System.out.println("*********************************************");
		   
	  
	  }
}

class inheritemp
{
      public static void main (String args[]) 
      {
		employee E1= new employee(12,"Meghna","Sales",123445.00);
		E1.display();
		employee E2= new employee();
		E1.input();
		E1.display();
           

		manager m = new manager();
		m.input();
		m.inputman();
		m.calSal();
		m.display();
		m.mansal();
		
		manager m1= new manager(14,"Ayushi","E&TC",432619.00, 5000.00);
		m1.calSal();
		m1.display();
		m1.mansal();
	
      }
}