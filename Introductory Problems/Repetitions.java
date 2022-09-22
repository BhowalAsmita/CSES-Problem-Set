import java.util.*;
import java.lang.Math;

class Repetitions { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
        int max =1;
        int maxPattern =-9999;
        for(int i=0;i<str.length()-1;i++){ 
            if(str.charAt(i)==str.charAt(i+1)){
                max++;
            }else{
                max=1;
            } 
            maxPattern = Math.max(max, maxPattern);              
        }
        System.out.println(maxPattern==-9999?1:maxPattern);
    }    
}
