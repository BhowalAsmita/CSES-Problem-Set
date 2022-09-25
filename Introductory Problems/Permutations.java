import java.util.Scanner;

class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==2 || n==3){
            System.out.print("NO SOLUTION");
            
        }else{
            StringBuilder str = new StringBuilder();
            StringBuilder str1 = new StringBuilder();
            for(int i=1;i<=n;i+=2){
                    str.append(i+" ");
            }

            for(int i=2;i<=n;i+=2){
                str1.append(i+" ");
            }
            str1.append(str);
            System.out.print(str1);
        }
        
    }
}
