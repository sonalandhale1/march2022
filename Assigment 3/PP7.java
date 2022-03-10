class PP7
{
	public static void main(String[] args) 
	{
	    for(int i=9; i>=1;i--)
	    {
	        for(int j=1; j<=9-i;j++)
	        {
	            System.out.print( " ");
	        }
	        for(int k=9; k>=10-i;k--)
	        {
	            System.out.print( i+ " ");
	        }
	        System.out.println();
	    }
	}
}