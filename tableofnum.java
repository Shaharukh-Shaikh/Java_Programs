import java.util.Scanner;

public class tableofnum {
    public static void main(String args[])
    {
        int num ,tab;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter any number :");
        num=sc.nextInt();
        System.out.println("table of number is : ");
        for (int i = 1; i <= 10; i++) {
            tab=num*i;
            System.out.println(tab);
            
        }
        sc.close();
    }
}
