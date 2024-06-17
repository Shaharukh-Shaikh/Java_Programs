public class bitManipulation {

    //Even Odd Using Binary Numbers
    public static void EvenOdd(int num){
        if((num&1)==0){
            System.out.println("even Number");
        }else{
            System.out.println("odd Number");
        }
    }
    public static void GetIthBit(int num,int pos){
        int bitMask=1<<pos;
        if((num&bitMask)==0){
            System.out.println("Ith Bit Is Zero");
        }else{
            System.out.println("Ith Bit Is One");
        }
    }

    public static void SetIthBit(int num ,int pos){
        int bitMask=1<<pos;
        int setBit=num|bitMask;
        System.out.println(setBit);
            
    }
    public static void clearIthBit(int num,int pos){
        int bitMask=~(1<<pos);
        int numAfterClearBit=num&bitMask;
        System.out.println(numAfterClearBit);
    }
    public static void updateIthBit(int num,int pos,int bit){
        if (bit==0) {
            clearIthBit(num,pos);
        }else{
            SetIthBit(num,pos);
        }
    }
    public static void powerOfTwo(int num){
        if ((num&(num-1))==0) {
            System.out.println("Number Is Of Power Of Two");
        }else{
            System.out.println("Number Is Not Power Of Two");
        }
    }
    public static void countSetBits(int num){
        int count=0;
        while (num>0) {
            if((num&1) != 0){
                count++;
            }
            num=num>>1;
        }
        System.out.println("Count is : "+ count);
    }
    public static void main(String[] args) {
        System.out.println(5&6);
        System.out.println(5|6);
        System.out.println(5^6);
        System.out.println(~5);
        System.out.println(5<<2);
        System.out.println(5>>2);

        //Even Odd Using Binary Numbers
        EvenOdd(212);

        //Get Ith Bit
        GetIthBit(4,2);

        //Set Ith Bit
        SetIthBit(4,1);

        //clear Ith Bit
        clearIthBit(12,2);

        //Update Ith Bit
        updateIthBit(12,1,1);

        //Check If The Number Is Of Power 2 Or Not
        powerOfTwo(16);

        //Count Set Bits In Number
        countSetBits(7);


    }
}
