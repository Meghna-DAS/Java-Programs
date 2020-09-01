import java.util.*;
class Employee2 { 
    String name; 
    int age; 
    String designation; 
    double salary; 
    
    Employee2
    (String name, int age, String designation,double salary) 
    { 
        this.name = name; 
        this.age = age; 
        this.designation = designation; 
        this.salary = salary;  
    } 
public String toString() 
    { 
        return name + "," + age + "," + designation + "," + salary; 
    } 
public static void main(String[] args) 
    { 
	Scanner sc= new Scanner(System.in);    
	System.out.println("Enter name: ");  
	String a= sc.nextLine();  
		
	System.out.println("Enter age: ");  
	int b= sc.nextInt();  
		
	System.out.println("Enter designation: ");  
	String c= sc.next();  
		
	System.out.println("Enter salary");
	double d=sc.nextDouble(); 
		
	Employee2 e =  
        new Employee2(a, b, c, d);  
        System.out.println(e.toString());	
	
	}
}