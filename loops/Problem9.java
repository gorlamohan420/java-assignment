import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        int d=0;
        while(a>0){
            int c=a%10;
            d=(d*10)+c;
            a=a/10;
        }
        if(d==b){
            System.out.println(b+"is a palindrome");
        }
        
        
}
}
