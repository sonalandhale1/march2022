import java.util.*;
class Q6
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input First number: ");
	    int n1 = sc.nextInt();
	    System.out.print("Input Second number: ");
	    int n2 = sc.nextInt();
	    int n3 = n1 + n2;
	    int n4 = n1 - n2;
	    int n5 = n1 * n2;
	    int n6 = n1 / n2;
	    int n7 = n1 % n2;
		System.out.println("Sum is = " +n3+ "   Sub is "+n4+ "   Mul is " +n5+"   Div is" +n6+ "   Mod is " +n7 );
	}
}