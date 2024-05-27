class CountEvenOdd 
{
	public static void main(String[] args) 
	{
		int evencount=0;
		int oddcount=0;
		for(int i=1;i<=101;i++)
		{
			if(i%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println("Count Of Even Number Is : "+evencount);
		System.out.println("Count Of Odd Number Is : "+oddcount);
	}
}
