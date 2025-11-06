import java.util.Scanner;
public class senario2 {
    public static long power(long base,int exp){
        if (exp ==0){
            return 1;
        }
        else {
            return base*power(base, exp-1);
        }
    }

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a base value:");
        long base = scanner.nextLong();
       System.out.print("Enter a power of value:");
       int exp = scanner.nextInt();
        System.out.println(power(base,exp));
        scanner.close();
    }
}
