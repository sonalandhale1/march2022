import java.util.*;
class Oddeven
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number which you which to check : ");
		int n1 = sc.nextInt();
		if(n1%2 == 0)
		System.out.println("Number is Even");
		else 
		System.out.println("Number is odd");
		
	}
}