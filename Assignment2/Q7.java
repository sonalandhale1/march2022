import java.util.*;
class Q7
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input number: ");
	    int n1 = sc.nextInt();
    for(int i=1; i<=10; i++)
        {
        int n2 = n1 * i;
	   	System.out.println(n1 + " * " +i+ " = " +n2);
        }
	}
}