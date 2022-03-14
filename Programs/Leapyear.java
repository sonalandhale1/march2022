import java.util.*;
class Leapyear
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year which you wish to check : ");
		int n1 = sc.nextInt();
	
		if(n1%4==0 || n1%400==0 && n1%100!=0)
		System.out.println("Leap year");
		else 
		System.out.println("Not a Leap year");
		
	}
}