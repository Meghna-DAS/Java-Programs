class Main{
    public static void main(String args[]){
      //create array of employee object  
      Employee[] obj = new Employee[5] ;
  
      //create actual employee object
      obj[0] = new Employee();
      obj[1] = new Employee();
      obj[2] = new Employee();
      obj[3] = new Employee();
      obj[4] = new Employee();
      
      //assign data to employee objects
      obj[0].setData(100,"ABC","Manager");
      obj[1].setData(200,"XYZ","Clerk");
      obj[2].setData(300,"EFG","Clerk");
      obj[3].setData(400,"HIJ","Manager");
      obj[4].setData(500,"KLM","Clerk");
      
      //display the employee object data
      System.out.println("Employee Object 1:");
      obj[0].showData();
      System.out.println("Employee Object 2:");
      obj[1].showData();
      System.out.println("Employee Object 3:");
      obj[2].showData();
      System.out.println("Employee Object 4:");
      obj[3].showData();
      System.out.println("Employee Object 5:");
      obj[4].showData();

      int count =0;
       for(int i=0;i<obj.length;i++)
       {
         if(obj[i].position=="Clerk")
             count+=1;
       }
      System.out.println("Total clerks:"+count);
    }	
 }
 
 
 //Employee class with empId and name as attributes
 class Employee{
     int empId;
     String name;
     String position;
     
     public void setData(int c,String d, String p){
         empId=c;
         name=d;
         position=p;
      }
     public void showData(){
         System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name+ " "+ "Position=" +position);
         System.out.println();
      }
 }