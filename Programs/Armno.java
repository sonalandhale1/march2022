import java.util.*;
class Armno
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1= sc.nextInt();
		int temp = n1;
		int res;
		int sum=0;
		while(n1>0)
		{
			res= n1%10;
			sum= sum+(res*res*res);
			n1=n1/10;
		}
		
		if(temp == sum)
			System.out.println("Armstrong No");
		else
			System.out.println("Not a Armstrong No");
		
	}
}