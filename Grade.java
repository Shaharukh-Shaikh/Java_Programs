class Grade 
{
	public static void main(String[] args) 
	{				 
		int phy=5;
		int chem=6;
		int bio=9;
		int math=8;
		int co=8; 
		float total=phy+chem+bio+math+co;
		float per=(total/500)*100;
		System.out.println("Percentage Of Student Is : "+per);
		if(per>=90)
		{
			System.out.println("Grade A");
		}
		else if(per>=80)
		{
			System.out.println("Grade B");
		}
		else if(per>=70)
		{
			System.out.println("Grade C");
		}
		else if(per>=60)
		{
			System.out.println("Grade D");			
		}
		else if(per>=40)
		{
			System.out.println("Grade E");	
		}
		else
		{
			System.out.println("You Are Fail");
		}
	}
}
