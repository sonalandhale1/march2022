import java.util.*;
class Switchcase
{
	public static void main(String[] args) 
	{  
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the choice");
	    int n1 = sc.nextInt();
	    switch(n1)
	    {
	    case 1 : System.out.println("Today is Monday");
	             break;
	    case 2 : System.out.println("Today is Tues");
	             break;
	    case 3 : System.out.println("Today is Wed");
	             break;
	    case 4 : System.out.println("Today is Thurs");
	             break;
	    case 5 : System.out.println("Today is Fri");
	             break;
	    case 6 : System.out.println("Today is Sat");
	             break;
	    case 7 : System.out.println("Today is Sun");
	             break;
	    default :System.out.println("Invalid date");
	            
	    }
	 }   
}