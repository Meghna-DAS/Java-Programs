import java.util.Scanner;

public class conversion
{
public static void main(String args[])
{
double pounds;
double kilograms;
Scanner input= new Scanner(System.in);

System.out.println("Enter your weight in pounds");
pounds=input.nextDouble();

kilograms=pounds*0.454;

System.out.println(pounds +" is " + kilograms +" Kilograms ");
}
}