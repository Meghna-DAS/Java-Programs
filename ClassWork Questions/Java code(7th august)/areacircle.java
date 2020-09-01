import java.util.*;
class circle
{
private double radius;
private double area;

circle(double radius)
{
this.radius=radius;
}
public void getarea()
{
double area= 3.14*radius*radius;
System.out.println("Area of title"+area);
}

//difference between area of two of two objects
public double printdiffarea(circle c)
{
if (this.area>c.area)
return (this.area-c.area);
else
return(c.area-this.area);

}

}// end of circle

class areacircle
{
public static void main(String args[])
{
double r1,r2;
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius");
r1=sc.nextDouble();

System.out.println("enter the radius");
r2=sc.nextDouble();

//create 2 objects
circle c1=new circle(r1);
circle c2=new circle(r2);

//calculate getarea
c1.getarea();
c2.getarea();

//printdiffarea
double difference= c1.printdiffarea(c2);
System.out.println("the area difference"+ difference);
}
}
