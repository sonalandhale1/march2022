import java.util.*;
class PrimeNo
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number which you wish to check : ");
		int n1 = sc.nextInt();
		int temp=0;
		for (int i=2; i<(n1-1);i++)
		{
		    if(n1%i ==0)
		    temp = temp + 1;
		}
		if (temp == 0)
		System.out.println("Prime no");
		else 
		System.out.println("Not a Prime no");
		
	}
}