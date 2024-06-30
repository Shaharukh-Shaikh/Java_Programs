import java.util.ArrayList;
import java.util.Arrays;

public class FindAllLonelyNumbersInTheArray {
    public static void main(String[] args) {
        int n[]={10,6,5,8};
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(n);
        for(int i=0;i<n.length;i++){
            if(n.length==1){
                list.add(n[0]);
            }else{
            if(i==0){
                if(n[i]!=n[i+1] && n[i+1]!=n[i]+1){
                    list.add(n[i]);
                }
            }else if(i==n.length-1){
                if(n[i]!=n[i-1] && n[i-1]!=n[i]-1){
                    list.add(n[i]);
                }
            }else{
                if(n[i]!=n[i+1] && n[i]!=n[i-1] && n[i+1]!=n[i]+1 && n[i-1]!=n[i]-1){
                    list.add(n[i]);
                }
            }
            }
        }
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
