import java.util.Scanner;

public class palindromenumber 
{
    public static void main(String Args[])
    {
        int n,rev=0,pal;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        n=sc.nextInt();
        pal=n;
        while (n>0) 
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        if(pal==rev)
        {
            System.out.println("number is palindrome : "+rev);
        }
        else
        {
            System.out.println("number is not palindrome : "+rev);
        }
        sc.close();
    }
    
}
