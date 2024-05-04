import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=1;
        int c=0;
        int l=a/2;
        while(b<=l){
            if(a%b==0){
                c=c+1;
                
            }
            b=b+1;
        }
        if(c==1){
            System.out.println(a+"is a prime number");
        }
        
}
}
