class CountPrime 
{
	public static void main(String[] args) 
	{

		System.out.println("Prime Numbers Are : ");
		for(int i=1;i<=100;i++) 
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag++;
				}
			}
			if(flag==0)
			{
				System.out.print(i+",");
			}
		}
		System.out.println("Not Prime Numbers Are : ");
		for(int i=1;i<=100;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag++;
				}
			}
			if(flag!=0)
			{
				System.out.print(i+",");
			}
			
		}
		
	}
}
