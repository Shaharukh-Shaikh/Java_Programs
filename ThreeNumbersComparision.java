class ThreeNumbersComparision 
{
	public static void main(String[] args) 
	{
		int a=30,b=20,c=40;
		if(a>b && a>c){
			System.out.println("A is greater Than B and C");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater Than A and C");
		}
		else if(c>a && c>b)
		{
			System.out.println("C is greater than B and A");
		}
		else
		{
			System.out.println("Numbers are Equal");
		}
	}
}
