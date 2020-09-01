class Fan
{
 public static final int SLOW=1,MEDIUM=2,FAST=3;
 int speed;
 boolean f_on;
 double radius;
 String color;
 
 Fan()
 {
  speed=SLOW;
  f_on=false;
  radius=4;
  color="blue";
 }
 
 Fan(int speed,double radius,String color,boolean f_on)
 {
  this.speed=speed;
  this.radius=radius;
  this.color=color;
  this.f_on=f_on;
 }
 
 void display()
 {
  if(f_on==true)
  {
   System.out.println("Fan is on \n the speed is ="+speed+"\n the color is ="+color+"\n the radius is ="+radius);
  }
  else
  {
   System.out.println("Fan is off \n the color of fan is ="+color+"\n the radius of fan is ="+radius);
  }
 }
 
public static void main(String [] args)
{
 Fan obj = new Fan();
 Fan obj1 = new Fan(MEDIUM,6,"brown",true);
 obj.display();
 obj1.display();
 
}
}