import java.util.*;

class bookdemo
{
public static void main(String args[])
{
book b1= new book(122, "ABCD",1000.56);
book b2= new book(123, "EFGH",500);
b1.display();
b2.display();

double bk1= b1.getprice();
double bk2= b2.getprice();
if(bk1>bk2)
	System.out.println("book1 has higher price");
else
	System.out.println("book2 has higher price");

}

}

class book
{
private int bookid;
private String bookname;
private double bookprice;

book(int bid, String bname, double bp)
{
bookid=bid;
bookname=bname;
bookprice=bp;
}
public void getdata()
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the book id");
bookid=sc.nextInt();
System.out.println("enter the book name");
bookname=sc.nextLine();
System.out.println("enter the book price");
bookprice=sc.nextDouble();
}
public void display()
{
System.out.println("Bookid= " + bookid);
System.out.println("bookname = " + bookname);
System.out.println("bookprice="+ bookprice);
}
public double getprice()
{
	return(bookprice);
}
}

