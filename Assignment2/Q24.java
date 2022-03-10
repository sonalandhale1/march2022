import java.util.*;
class Q24
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Decimal no:  ");
	    int num = sc.nextInt();
	    
	    String b = "";
	    int t = num;
	    while(t >0)
	    {
	        int r = t%8;
	        t= t/8;
	        b = r + b;
	    }
        System.out.println("Octal number is: " +b);
	}
}