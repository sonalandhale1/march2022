class typecasting
{
public static void main(String args[])
	{	//upcasting
	
		int i = 100;
		float f = i;
		double d = 444.1234567890123; // double prints 13 digits after .
		float f4 = 4.123456F; // double prints 6 digits after .
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(f4);
		
		
		float i1 = 100.7348958949854F;
		double f1 = i1;
		System.out.println(i1);
		System.out.println(f1);
		
		
		//Downcasting
		
		double i2 = 100.645145451;
		float f2 = (float)i2;
		System.out.println(i2);
		System.out.println(f2);
		
		
		double i3 = 100.7;
		float f3 = (float)i3;
		System.out.println(i3);
		System.out.println(f3);
	}
}