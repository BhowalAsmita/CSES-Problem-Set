import java.util.*;

class MissingNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        long n = sc.nextLong(); 
        long sum = n*(1 + n)/2;
        for(int i=0;i<n-1;i++){
            sum -= sc.nextLong();
        } 
        System.out.println(sum);
    }
 
}
