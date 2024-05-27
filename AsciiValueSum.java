class AsciiValueSum 
{
	public static void main(String[] args) 
	{
		char i='a';
		int sum=0;
		while(i<='e')
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum Of Characters From A to E is : "+sum);
	}
}
