import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter The Number : ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is : "+fact);
		sc.close();
	}
}
