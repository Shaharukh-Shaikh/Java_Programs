class Armstrong 
{
	public static void isArmstrong(){
		int num=153,rem=0,cube=0,arm=0,num1=num;
		while(num!=0)
		{
			rem=num%10;
			cube=rem*rem*rem;
			arm+=cube;
			num=num/10;
		}
		if(arm==num1)
		{
			System.out.print("Number Is an ArmStrong Number");
		}else{
			System.out.print("Number Is Not an ArmStrong Number");
		}
	}
	public static void main(String[] args) 
	{
		
		isArmstrong();
	}
}
