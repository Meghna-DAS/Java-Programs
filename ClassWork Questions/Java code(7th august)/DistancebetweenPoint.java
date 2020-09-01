import java.util.*;
class getdistance
{
	 double dis;
 
	 getdistance(int x1,int y1,int x2,int y2)
	 {
	  dis=(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
	 }
}
class DistancebetweenPoint
{
	public static void main(String args[])
	
	{
           int x1,x2,y1,y2;
	
	   Scanner sc=new Scanner(System.in);
 
	   System.out.println("Enter point x1: ");
	   
           x1=sc.nextInt();
	  
           System.out.println("Enter point y1: ");
	   
           y1=sc.nextInt();
	 
           System.out.println("Enter point x2: ");
	   
           x2=sc.nextInt();
	 
           System.out.println("Enter point y2: ");
	   
           y2=sc.nextInt();
	  
	   getdistance cd=new getdistance(x1,y1,x2,y2);	    
 	 	    
  	   System.out.println("Distance Between"+"("+x1+","+y1+"),"+"("+x2+","+y2+") ===> "+cd.dis);
 
	}
}