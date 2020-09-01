import java.util.*; 
  
class solution 
{ 
  
// Function to find sum of AP series 
static long sumAP(long n, long d) 
{ 
    // Number of terms 
    n /= d; 
  
    return (n) * (1 + n) * d / 2; 
} 
  
// Function to find the sum of all 
// multiples of 3 and 7 below N 
static long sumMultiples(long n) 
{ 
    // Since, we need the sum of 
    // multiples less than N 
    n--; 
  
    return sumAP(n, 3) + sumAP(n, 5) - sumAP(n,15); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    long n = 100; 
  
    System.out.println(sumMultiples(n)); 
  
 } 
} 