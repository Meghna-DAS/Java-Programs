import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class TimeDiff {
 
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first date :");
			String date1 = sc.next();
			System.out.println("Enter second date :");
			String date2 = sc.next();
 
			String format = "dd/MM/yyyy ";
 
			SimpleDateFormat sdf = new SimpleDateFormat(format);
 
			Date dateObj1 = sdf.parse(date1 + " " );
			Date dateObj2 = sdf.parse(date2 + " " );
			System.out.println(dateObj1);
			System.out.println(dateObj2 + "\n");
 
			DecimalFormat TimeD = new DecimalFormat("###,###");
 
			// getTime() returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object
			long diff = dateObj2.getTime() - dateObj1.getTime();
 
			int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
			System.out.println("Difference in days : " + TimeD.format(diffDays));
 
			int diffhours = (int) (diff / (60 * 60 * 1000));
			System.out.println("Difference in hours : " + TimeD.format(diffhours));
 
			int diffmin = (int) (diff / (60 * 1000));
			System.out.println("Difference in minutes : " + TimeD.format(diffmin));
 
			int diffsec = (int) (diff / (1000));
			System.out.println("Difference in seconds : " + TimeD.format(diffsec));
 
			System.out.println("Difference in milliseconds : " + TimeD.format(diff));
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}