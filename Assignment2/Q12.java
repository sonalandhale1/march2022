import java.util.*;
class Q12
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input First number: ");
	    int n1 = sc.nextInt();
	    System.out.print("Input Second number: ");
	    int n2 = sc.nextInt();
	    System.out.print("Input third number: ");
	    int n3 = sc.nextInt();
	    int n4 = (n1 + n2 + n3)/3;
		System.out.println("Average of 3 numbers is : " +n4);
	}
}