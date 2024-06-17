public class swappingOfTwoNumbersWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int a=2,b=3;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a and b after swapping "+a+","+b);

        //Or

        int c=2,d=3;
        c=c^d;
        d=c^d;
        c=c^d;

        System.out.println("value of c and d after swapping "+c+","+d);



    }
}
