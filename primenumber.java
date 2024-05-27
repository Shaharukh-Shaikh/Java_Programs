import java.util.Scanner;

public class primenumber {
    public static void main(String Args[])
    {
        int num,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter any number : ");
        num=sc.nextInt();
        for (int i = 2; i < num/2; i++) 
        {
            if (num%i==0) {
                count++;
            }   
        }
        if (count==0) {
            System.out.println("number is prime : " + num);
        }
        else
        {
            System.out.println("number is not prime : " + num);
        }
        sc.close();
    }
}
