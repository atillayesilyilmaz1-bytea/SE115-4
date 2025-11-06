import java.util.Scanner;

public class fibbonachibonus {
   public  static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number:");
       int n = scanner.nextInt();
       System.out.println(fibbonachi(n));
       scanner.close();
   }
    public static int fibbonachi(int n){
       if(n==0){
           return 0;

       }
       if (n==1){
           return 1;
       }
       return fibbonachi(n-1)+fibbonachi(n-2);

   }
}
