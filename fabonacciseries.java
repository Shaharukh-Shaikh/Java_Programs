import java.util.Scanner;

public class fabonacciseries {
    public static void main(String args[])
    {
        int x=0,y=1,z=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        n=sc.nextInt();
        System.out.println("fabonacci series is :  ");
        while (z<=n)
        {
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;   
        }
        sc.close();
    }
}
