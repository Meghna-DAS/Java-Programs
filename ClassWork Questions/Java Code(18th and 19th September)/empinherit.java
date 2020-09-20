import java.util.Scanner;
class employee{
	private int emp_id;
	private String emp_name;
	private String emp_addr;
	
	public void get_data(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee Id: ");
		emp_id=sc.nextInt();
		System.out.println("Employee Name:");
		emp_name=sc.next();
		System.out.println("Employee Address:");
		emp_addr=sc.next();
		System.out.println("*********************************************");
	}
	
	public void display_emp(){
		System.out.println("Employee ID is:"+ emp_id);
		System.out.println("Employee Name is:" + emp_name);
		System.out.println("Employee Address is:" + emp_addr);
		System.out.println("*********************************************");
	}
}//employee


class P_employee extends employee{
	private double BP,HRA,DA,salary1;
	
	public void get_val(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Basic Pay: ");
		BP=sc.nextDouble();
		System.out.println("HRA : ");
		HRA=sc.nextDouble();
		System.out.println("DA : ");
		DA=sc.nextDouble();
		System.out.println("*********************************************");
	}
	
	public void cal_sal(){
		DA=(0.5*BP);
		HRA=((0.5*BP) + DA);
		salary1=(BP+DA+HRA);
	}
	
	 public double  getsal()
	  {
		  return(salary1);
	  }
	
	public void display_sal(){
		System.out.println("Total Salary of Permanent Employee is: "+ salary1);
		System.out.println("*********************************************");
	}
}//P_employee

class Manager extends P_employee{
	private Double AdvLimit,salary2;
	private String vehicle;
	
	public void get_data2(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Just tell the Advance limit of Manager : ");
		AdvLimit=sc.nextDouble();
		System.out.println("Please tell your vehicle name : ");
		vehicle=sc.next();
		System.out.println("*********************************************");
	}
	public void cal_pay(){
		salary2=  getsal();
		salary2=(AdvLimit+salary2);
	}
	public void display_data(){
		System.out.println("Total Salary of Manager is : "+ salary2);
		System.out.println("*********************************************");
	}
}//Manager

public class empinherit{
	public static void main(String args[]){
		//object for Permanent Employee
		P_employee P1 = new P_employee();
		P1.get_data();
		P1.display_emp();
		P1.get_val();
		P1.cal_sal();
		P1.display_sal();
		//object for Manager
		Manager M1 = new Manager();
		M1.get_data();
		M1.display_emp();
		M1.get_val();
		M1.cal_sal();
		M1.display_sal();
		M1.get_data2();
		M1.cal_pay();
		M1.display_data();
	}
}//main 
		
		
	