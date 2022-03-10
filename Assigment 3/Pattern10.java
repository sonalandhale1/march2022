class Pattern10
{
	public static void main(String[] args) 
	{
	    for (int i=69; i>=65; i--)
	    {
	        for (int j=69; j>=i;j--)
	        {
		    System.out.print(" ");
	        }
			for (int j=69; j>=i;j--)
	        {
		    System.out.print((char)j +" ");
	        }
	        System.out.println();
	    }
	}
}